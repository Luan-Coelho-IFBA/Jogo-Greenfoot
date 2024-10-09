import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W3 extends MyWorld
{

    /**
     * Constructor for objects of class W3.
     * 
     */
    public W3()
    {
        super();
        prepare();
        super.vida = 100;
        Jogador.temPuloDuplo = true;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(700, 60), 300, 600); // Chão
        addObject(new Piso(700, 60), 300, 0); // Teto
        addObject(new Piso(60, 700), 0, 300); // Lateral esquerda
        addObject(new Piso(60, 700), 600, 300); // Lateral direita
        addObject(new Piso(100, 30), 150, 400); // Plataforma #1
        addObject(new Piso(100, 30), 150, 200); // Plataforma #2
        addObject(new Jogador(), 150, 541);
        addObject(new Boss(), 500, 330);
    }
}
