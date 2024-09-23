import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_2 extends W1
{
    private Jogar mundo;
    
    public W1_2(Jogar mundo)
    {
        prepare();
        this.mundo = mundo;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irPraDireita(jogador, mundo.w1_3);
            super.irParaEsquerda(jogador, mundo.w1_1);
            super.irParaBaixo(jogador, mundo.w0_2);
        
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

        Grama grama = new Grama(200, 290);
        addObject(grama,300,333);
        grama.setLocation(100,533);
        Grama grama2 = new Grama(300, 120);
        addObject(grama2,200,455);
        grama2.setLocation(460,570);
        Jogador jogador = new Jogador();
        addObject(jogador,32,350);
        Cobra cobra = new Cobra(100);
        addObject(cobra,572,474);
        Grama grama3 = new Grama(60, 20);
        addObject(grama3,255,410);
        grama3.setLocation(217,425);
    }
}
