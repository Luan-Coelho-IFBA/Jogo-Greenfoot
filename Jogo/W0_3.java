import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W0_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W0_3 extends W1
{
    private Jogar mundo;
    
    public W0_3(Jogar mundo)
    {
        prepare();
        this.mundo = mundo;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaEsquerda(jogador, mundo.w0_2);
            super.irParaCima(jogador, mundo.w1_3);
            super.processar();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Grama(700, 60), 300, 580);
        addObject(new Grama(30, 400), 10, 200);
        addObject(new Jogador(), 11, 520);
        addObject(new Grama(300, 470), 450, 235);
        addObject(new Grama(100, 40), 250, 450);
        addObject(new Grama(100, 40), 70, 350);
        addObject(new Grama(100, 40), 250, 250);
        addObject(new Grama(100, 40), 70, 140);
    }
}
