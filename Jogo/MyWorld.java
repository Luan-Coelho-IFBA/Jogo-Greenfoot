import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Greenfoot.setSpeed(50);
        Sol sol = new Sol();
        addObject(sol,548,46);
        Nuvem1 nuvem1 = new Nuvem1();
        addObject(nuvem1,75,153);
        Nuvem1 nuvem12 = new Nuvem1();
        addObject(nuvem12,227,53);
        Nuvem1 nuvem13 = new Nuvem1();
        addObject(nuvem13,441,134);
        Jogador jogador = new Jogador();
        addObject(jogador,98,297);
        Grama grama = new Grama();
        addObject(grama,261,313);
        Grama grama2 = new Grama(60, 250);
        addObject(grama2,451,288);
        grama2.setLocation(515,350);
        grama.setLocation(362,232);
        grama.setLocation(345,217);
        removeObject(grama);
        removeObject(grama2);
        Grama grama3 = new Grama(700, 50);
        addObject(grama3,326,350);
        grama3.setLocation(325,481);
        Grama grama4 = new Grama(300, 60);
        addObject(grama4,354,265);
        grama4.setLocation(328,325);
        jogador.setLocation(50,421);
    }
}
