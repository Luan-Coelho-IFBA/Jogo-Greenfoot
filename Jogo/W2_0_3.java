import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_0_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_0_3 extends W2
{
    ContextoW2 contexto;
    
    public W2_0_3(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaEsquerda(jogador, contexto.w2_0_2);
            super.irParaCima(jogador, contexto.w2_1_3);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(700, 60), 300, 570); // Chão
        addObject(new Piso(450, 30), 375, 15); // Teto
        addObject(new Piso(60, 450), 0, 225); // Parede esquerda
        addObject(new Piso(30, 700), 585, 300); // Parede direita
        addObject(new Piso(300, 300), 450, 450); // Blocão
        addObject(new Piso(100, 30), 250, 420); // Plataforma #1
        addObject(new Piso(450, 30), 225, 170); // Plataforma #2
        addObject(new CobraVermelha(105), 540, 280); // Cobra #1
        addObject(new CobraVermelha(185), 430, 135);
        addObject(new Jogador(), 11, 510);
    }
}
