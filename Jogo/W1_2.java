import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_2 extends W1
{
    private W1_1 mundoPassado;
    private W0_2 mundoAbaixo;
    private W1_3 mundoLado;
    
    public W1_2(W1_1 mundoPassado)
    {
        this.mundoPassado = mundoPassado;
        this.mundoAbaixo = new W0_2();
        this.mundoLado = new W1_3(this);
        prepare();
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            if (super.jogador.isAtEdge()) {
                if (super.jogador.getX() <= 20) {
                    Greenfoot.setWorld(mundoPassado);
                    super.jogador.setLocation(super.jogador.getX() + 10, super.jogador.getY());
                } else if (super.jogador.getY() >= getHeight() - 10) {
                Greenfoot.setWorld(mundoAbaixo);
                } else if (super.jogador.getX() >= getWidth() - 5) {
                    Greenfoot.setWorld(mundoLado);
                    super.jogador.setLocation(super.jogador.getX() - 10, super.jogador.getY());
                }
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
