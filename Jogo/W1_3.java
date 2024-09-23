import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_3 extends W1
{
    public W1_2 w1_2;
    
    public W1_3(W1_2 w1_2)
    {
        this.w1_2 = w1_2;
        prepare();
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            if (super.jogador.getX() <= 20) {
            Greenfoot.setWorld(w1_2);
            super.jogador.setLocation(super.jogador.getX() + 10, super.jogador.getY());
        }
        
        super.mostrarVida();
        super.tomarDano();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Grama grama = new Grama(700, 150);
        addObject(grama,230,422);
        grama.setLocation(300,575);
        Jogador jogador = new Jogador();
        addObject(jogador,24,471);
        CobraVermelha cobra = new CobraVermelha(260);
        addObject(cobra,560,464);
        Grama grama2 = new Grama(15, 700);
        addObject(grama2, 598, 300);
    }
}
