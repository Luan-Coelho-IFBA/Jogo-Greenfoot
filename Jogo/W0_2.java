import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W0_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W0_2 extends W1
{
    private ContextoW1 contexto;

    /**
     * Constructor for objects of class W0_2.
     * 
     */
    public W0_2(ContextoW1 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            if (super.irParaDireita(jogador, contexto.w0_3)) {
                contexto.posicao = Posicao.ESQUERDA;
            }
            super.processar();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jogador jogador = new Jogador();
        addObject(jogador,300,11);
        Grama grama = new Grama(275, 500);
        addObject(grama,127,434);
        Grama grama2 = new Grama(250, 30);
        addObject(grama2, 476, 200);
        Grama grama3 = new Grama(30, 250);
        addObject(grama3, 350, 90);
        Grama grama4 = new Grama(30, 250);
        addObject(grama4, 250, 90);
        Grama grama5 = new Grama(700, 60);
        addObject(grama5, 350, 600);
        Lhama lhama = new LhamaBranca();
        addObject(lhama,470,155);
        Lhama lhama2 = new LhamaBranca();
        addObject(lhama2,125,153);
    }
}
