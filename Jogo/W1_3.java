import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_3 extends W1
{
    private Jogar mundo;
    
    public W1_3(Jogar mundo)
    {
        prepare();
        this.mundo = mundo;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaBaixo(jogador, mundo.w0_3);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Grama(30, 700), 10, 300);
        addObject(new Grama(700, 30), 300, 10);
        addObject(new Jogador(), 100, 550);
        addObject(new Grama(500, 30), 400, 610);
        addObject(new Grama(100, 40), 450, 490);
        addObject(new Grama(30, 450), 590, 375);
        addObject(new Grama(100, 40), 350, 390);
        addObject(new Grama(100, 40), 250, 290);
        addObject(new Grama(300, 40), 450, 170);
        addObject(new Cobra(180), 540, 555);
        addObject(new Lhama(), 500, 120);
    }
}
