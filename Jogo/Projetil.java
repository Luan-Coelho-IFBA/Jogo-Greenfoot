import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Projetil extends Actor
{
    public void act()
    {

    }
    
    public void checarSeChegouNoFim() {
        if (isAtEdge() || isTouching(Chao.class)) {
            getWorld().removeObject(this);
        }
    }
}
