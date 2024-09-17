import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogar extends MyWorld
{

    /**
     * Constructor for objects of class Jogar.
     * 
     */
    public Jogar()
    {

        prepare();
    }

    public void act() {
        Greenfoot.setWorld(new W1_1());
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Grama grama = new Grama(700, 150);
        addObject(grama,230,463);
        grama.setLocation(321,567);
        Jogador jogador = new Jogador();
        addObject(jogador,26,460);
    }
}
