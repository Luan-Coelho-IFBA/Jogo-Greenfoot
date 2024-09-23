import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cuspe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuspe extends Projetil
{
    public static int dano = 20;
    private int velocidade = 4;
    
    public void act()
    {
        move(velocidade);
        this.checkIfReachEnd();
    }
    
    @Override()
    public void checkIfReachEnd() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
