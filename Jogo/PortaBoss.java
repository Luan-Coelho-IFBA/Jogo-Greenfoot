import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PortaBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PortaBoss extends ProximaFase
{
    /**
     * Act - do whatever the PortaBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Jogador.class)) {
            Greenfoot.setWorld(new W3());
        }
    }
}
