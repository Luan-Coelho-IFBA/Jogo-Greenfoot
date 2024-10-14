import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Inimigo
{
    private Jogador jogador;
    private boolean rodaUmaVez;
    private final int TIRO_COOLDOWN = 60;
    private int tiroCoolDown = TIRO_COOLDOWN;
    
    public Boss() {
        super.vida = 1500;
        this.rodaUmaVez = true;
    }
    
    public void act()
    {
        try {
            if (rodaUmaVez) {
                this.jogador = getWorld().getObjects(Jogador.class).get(0);
                rodaUmaVez = false;
            }
            
            if (jogador != null) {
                virar();
                atirar();
                super.tomarDano();
            }
        } catch (Exception e) {
            
        }
    }
    
    public void atirar() {
        if (tiroCoolDown <= 0) {
            BolaDeFogo b1 = new BolaDeFogo();
            BolaDeFogo b2 = new BolaDeFogo();
            BolaDeFogo b3 = new BolaDeFogo();
            
            getWorld().addObject(b1, getX(), getY());
            getWorld().addObject(b2, getX(), getY());
            getWorld().addObject(b3, getX(), getY());
            
            b1.turnTowards(jogador.getX(), jogador.getY());
            b2.turnTowards(jogador.getX(), jogador.getY());
            b3.turnTowards(jogador.getX(), jogador.getY());
            
            b2.turn(-30);
            b3.turn(30);
            
            GreenfootSound som = new GreenfootSound("fireball.mp3");
            som.setVolume(80);
            som.play();
            
            tiroCoolDown = TIRO_COOLDOWN;
        } else {
            tiroCoolDown--;
        }
    }
    
    public void virar() {
        turnTowards(jogador.getX(), jogador.getY());
    };
}
