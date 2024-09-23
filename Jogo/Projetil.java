import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projetil extends Actor
{
    public void act()
    {

    }
    
    public void checkIfReachEnd() {
        if (isAtEdge() || isTouching(Chao.class)) {
            getWorld().removeObject(this);
        }
    }
}
