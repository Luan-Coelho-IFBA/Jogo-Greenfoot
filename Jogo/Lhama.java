import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Llama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lhama extends Inimigo
{
    private int vida = 10;
    private boolean acertadoPorTiro = false;
    private int TIRO_COOLDOWN = 60;
    private int tiroCoolDown = 60;
    private Jogador jogador = null;
    
    public void act()
    {
        List<Jogador> jogadores = getWorld().getObjects(Jogador.class);
        
        if (!jogadores.isEmpty()) {
            this.jogador = jogadores.get(0);
        } else {
            this.jogador = null;
        }

        virar();
        cuspir();
        super.cair();
        super.ajeitarPosicao();
        setLocation(getX(), getY() + super.velocidade);
        tomarDano();
    }
    
    public void cuspir() {
        if (tiroCoolDown <= 0 && this.jogador != null) {
            Cuspe cuspe = new Cuspe();
            
            getWorld().addObject(cuspe, getX(), getY());
            cuspe.turnTowards(jogador.getX(), jogador.getY());
            
            tiroCoolDown = TIRO_COOLDOWN;
        } else {
            tiroCoolDown--;
        }
    }
    
    public void virar() {
        if (jogador != null) {
            if (jogador.getX() > getX()) {
                setImage(new GreenfootImage("lhama direita.png"));
            } else {
                setImage(new GreenfootImage("lhama esquerda.png"));
            }
        }
    }
    
    public void tomarDano() {
        Actor tiro = getOneIntersectingObject(Tiro.class);
        
        if (tiro != null && !acertadoPorTiro) {
            vida -= Tiro.dano;
            acertadoPorTiro = true;
            
            getWorld().removeObject(tiro);
        }
        
        if (tiro == null) {
            acertadoPorTiro = false;
        }
        
        if (vida <= 0) {
            getWorld().removeObject(this);
            vida = 400;
        }
    }
}
