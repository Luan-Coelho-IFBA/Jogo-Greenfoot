import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pomba extends Inimigo
{
    private final int VELOCIDADE_VOAR = 3;
    private int velocidadeVoar = VELOCIDADE_VOAR;
    private final int TIRO_COOLDOWN = 100;
    private int tiroCoolDown = 100;
    
    public Pomba() {
        super.vida = 50;
    }
    
    public void act()
    {
        voar();
        atirar();
        tomarDano();
    }
    
    public void voar() {
        if (getX() < 10) {
            velocidadeVoar = VELOCIDADE_VOAR;
            getImage().mirrorHorizontally();
        } else if (getX() > getWorld().getWidth() - 10) {
            velocidadeVoar = -VELOCIDADE_VOAR;
            getImage().mirrorHorizontally();
        }
        setLocation(getX() + velocidadeVoar, getY());
    }
    
    public void atirar() {
        if (tiroCoolDown <= 0) {
            Ovo ovo = new Ovo();
            
            getWorld().addObject(ovo, getX(), getY());
            ovo.turnTowards(getX(), getY() + 1);
            
            tiroCoolDown = TIRO_COOLDOWN;
            
            GreenfootSound ovoSaindo = new GreenfootSound("ovoSaindo.mp3");
            ovoSaindo.setVolume(30);
            ovoSaindo.play();
        } else {
            tiroCoolDown--;
        }
    }
}
