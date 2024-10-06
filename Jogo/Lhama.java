import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Lhama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Lhama extends Inimigo
{
    protected int TIRO_COOLDOWN;
    protected int tiroCoolDown;
    private Jogador jogador = null;
    protected GreenfootImage imagemDireita;
    protected GreenfootImage imagemEsquerda;
    
    public void processar() {
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
            
            Greenfoot.playSound("cuspe.mp3");
        } else {
            tiroCoolDown--;
        }
    }
    
    public void virar() {
        if (jogador != null) {
            if (jogador.getX() > getX()) {
                setImage(imagemDireita);
            } else {
                setImage(imagemEsquerda);
            }
        }
    }
}
