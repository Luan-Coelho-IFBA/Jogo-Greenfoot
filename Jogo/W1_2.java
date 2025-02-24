import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W0_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_2 extends W1
{
    private ContextoW1 contexto;

    public W1_2(ContextoW1 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaBaixo(jogador, contexto.w0_2);
            super.processar();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Grama grama = new Grama(60, 150);
        addObject(grama,213,337);
        grama.setLocation(184,70);
        Grama grama2 = new Grama(60, 150);
        addObject(grama2,383,252);
        grama2.setLocation(365,70);
        Grama grama3 = new Grama(300, 700);
        addObject(grama3,250,378);
        grama3.setLocation(80,335);
        Grama grama4 = new Grama(300, 150);
        addObject(grama4,450,132);
        grama4.setLocation(520,70);
        Jogador jogador = new Jogador();
        addObject(jogador,277,26);
        Grama grama5 = new Grama(300, 60);
        addObject(grama5,359,326);
        grama5.setLocation(350,296);
        Grama grama6 = new Grama(300, 300);
        addObject(grama6,553,470);
        grama6.setLocation(484,570);
        Cobra cobra = new CobraVerde(60);
        addObject(cobra,506,232);
        Cobra cobra2 = new CobraVerde(110);
        addObject(cobra2,555,390);
        cobra.setLocation(478,249);
        Grama grama7 = new Grama(15, 300);
        addObject(grama7, 599, 290);
    }
}
