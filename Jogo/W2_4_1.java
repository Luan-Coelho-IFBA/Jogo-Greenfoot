import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_4_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_4_1 extends W2
{
    ContextoW2 contexto;
    
    public W2_4_1(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaBaixo(jogador, contexto.w2_3_1);
            super.irParaDireita(jogador, contexto.w2_4_2);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(250, 30), 125, 600); // Chão #1
        addObject(new Piso(250, 30), 475, 600); // Chão #2
        addObject(new Piso(700, 30), 300, 15); // Teto
        addObject(new Piso(60, 700), 0, 300); // Parede esquerda
        addObject(new Piso(60, 450), 600, 375); // Parede direita
        addObject(new Piso(100, 30), 200, 380); // Plataforma #1
        addObject(new Piso(100, 30), 400, 380); // Plataforma #2
        addObject(new CobraVermelha(-80), 60, 560); // Cobra #1
        addObject(new CobraVermelha(80), 540, 560); // Cobra #2
        addObject(new LhamaPreta(), 200, 340); // Lhama #1
        addObject(new LhamaPreta(), 400, 340); // Lhama #2
        addObject(new Pomba(), 9, 50);
        addObject(new Jogador(), 300, 550);
    }
}
