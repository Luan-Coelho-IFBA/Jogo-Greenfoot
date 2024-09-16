import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiro extends Actor
{
    public static int dano = 20;
    private int velocidade = 6;
    
    public void act()
    {
        move(velocidade);
        checkIfReachEnd();
    }
    
    public void checkIfReachEnd() {
        if (isAtEdge() || isTouching(Chao.class)) {
            getWorld().removeObject(this);
        }
    }
}
