import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogar extends W1
{
    public W2_1 w2_1 = new W2_1(this);
    public W2_2 w2_2 = new W2_2(this);
    public W2_3 w2_3 = new W2_3(this);
    public W1_2 w1_2 = new W1_2(this);
    public W0_2 w0_2 = new W0_2(this);
    public W0_3 w0_3 = new W0_3(this);
    public W1_3 w1_3 = new W1_3(this);

    /**
     * Constructor for objects of class Jogar.
     * 
     */
    public Jogar()
    {
        Greenfoot.setSpeed(50);
    }

    public void act() {
        Greenfoot.setWorld(this.w2_1);
    }
}
