import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W0_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_0_1 extends W2
{
    ContextoW2 contexto;
    
    public W2_0_1(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irPraDireita(jogador, contexto.w2_0_2);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(700, 60), 300, 570); // Chão
        addObject(new Piso(700, 60), 300, 30); // Teto
        addObject(new Piso(30, 700), 15, 300); // Parede esquerda
        addObject(new Piso(60, 450), 600, 225); // Parede direita
        addObject(new PortaCastelo(), 80, 465);
        addObject(new Jogador(), 170, 510);
    }
}
