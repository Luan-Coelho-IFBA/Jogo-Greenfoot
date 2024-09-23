import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogar extends W1
{
    public W1_1 w1_1 = new W1_1(this);
    public W1_2 w1_2 = new W1_2(this);
    public W1_3 w1_3 = new W1_3(this);
    public W0_2 w0_2 = new W0_2();

    /**
     * Constructor for objects of class Jogar.
     * 
     */
    public Jogar()
    {
        Greenfoot.setSpeed(50);
    }

    public void act() {
        Greenfoot.setWorld(this.w1_1);
    }
}
