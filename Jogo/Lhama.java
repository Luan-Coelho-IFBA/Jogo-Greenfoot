import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Llama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lhama extends Inimigo
{
    private int tiroCollDown = 100;
    
    public void act()
    {
        virar();
        cuspir();
        super.cair();
        super.ajeitarPosicao();
        setLocation(getX(), getY() + super.velocidade);
    }
    
    public void cuspir() {
        
    }
    
    public void virar() {
        if (getWorld().getObjects(Jogador.class).get(0).getX() > getX()) {
            setImage(new GreenfootImage("lhama direita.png"));
        } else {
            setImage(new GreenfootImage("lhama esquerda.png"));
        }
    }
}
