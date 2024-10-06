import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_2_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_2_3 extends W2
{

    /**
     * Constructor for objects of class W2_2_3.
     * 
     */
    public W2_2_3()
    {
        prepare();
    }
    
    public void prepare() {
        addObject(new Piso(450, 30), 225, 885); // Chão
        addObject(new Piso(700, 60), 300, 30); // Teto
        addObject(new Piso(30, 450), 15, 375); // Parede esquerda
        addObject(new Piso(30, 700), 585, 300); // Parede direita
        addObject(new Piso(100, 30), 535, 200); // Plataforma Lhama
        addObject(new LhamaPreta(), 535, 160);
    }
}
