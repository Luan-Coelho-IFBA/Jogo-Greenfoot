import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_3_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_3_2 extends W2
{
    ContextoW2 contexto;
    
    public W2_3_2(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaCima(jogador, contexto.w2_4_2);
            super.irParaDireita(jogador, contexto.w2_3_3);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(700, 60), 300, 600); // Chão
        addObject(new Piso(450, 60), 225, 0); // Teto
        addObject(new Piso(60, 700), 0, 300); // Parede esquerda
        addObject(new Piso(60, 475), 600, 225); // Parede direita
        addObject(new Piso(400, 80), 400, 200); // Plataforma #1
        addObject(new Piso(400, 80), 200, 400); // Plataforma #2
        addObject(new CobraVermelha(-100), 200, 141); // Cobra #1
        addObject(new CobraVermelha(160), 380, 341); // Cobra #2
        addObject(new CobraVermelha(-250), 50, 551); // Cobra #3
        addObject(new Jogador(), 525, 11);
    }
}
