import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_1 extends W1
{
    private W1_2 w1_2 = new W1_2(this);
    
    public W1_1()
    {
        prepare();
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador.isAtEdge()) {
            Greenfoot.setWorld(w1_2);
            super.jogador.setLocation(super.jogador.getX() - 10, super.jogador.getY());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Grama grama = new Grama(60, 700);
        addObject(grama,366,337);
        grama.setLocation(-7,342);
        grama.setLocation(-3,343);
        grama.setLocation(12,344);
        Grama grama2 = new Grama(700, 150);
        addObject(grama2,365,342);
        grama2.setLocation(400,583);
        grama2.setLocation(395,574);
        grama2.setLocation(352,570);
        grama2.setLocation(358,575);
        Grama grama3 = new Grama(60, 150);
        addObject(grama3,414,194);
        grama3.setLocation(592,508);
        Grama grama4 = new Grama(300, 60);
        addObject(grama4,387,284);
        grama4.setLocation(472,411);
        Jogador jogador = new Jogador();
        addObject(jogador,111,391);
        Cobra cobra = new Cobra(135);
        addObject(cobra,575,345);
    }
}
