import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_3 extends W1
{
    private ContextoW1 contexto;
    
    public W2_3(ContextoW1 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
        super.irParaEsquerda(jogador, contexto.w2_2);
        super.processar();
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
        addObject(cobra,555,464);
        Grama grama2 = new Grama(15, 700);
        addObject(grama2, 598, 300);
    }
}
