import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_4_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_4_3 extends W2
{
    ContextoW2 contexto;
    
    public W2_4_3(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaBaixo(jogador, contexto.w2_3_3);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(450, 60), 375, 600); // Chão
        addObject(new Piso(700, 60), 300, 0); // Teto
        addObject(new Piso(60, 700), 600, 300); // Parede direita
        addObject(new Piso(60, 700), 0, 300); // Parede esquerda
        addObject(new PortaBoss(), 435, 394);
        addObject(new Jogador(), 90, 550);
    }
}
