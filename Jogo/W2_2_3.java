import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_2_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_2_3 extends W2
{
    ContextoW2 contexto;
    
    public W2_2_3(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaBaixo(jogador, contexto.w2_1_3);
            super.irParaEsquerda(jogador, contexto.w2_2_2);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(450, 30), 225, 885); // Chão
        addObject(new Piso(700, 60), 300, 30); // Teto
        addObject(new Piso(60, 450), 0, 375); // Parede esquerda
        addObject(new Piso(30, 700), 585, 300); // Parede direita
        addObject(new Piso(100, 30), 535, 200); // Plataforma Lhama
        addObject(new Piso(100, 30), 300, 400); // Plataforma #1
        addObject(new Piso(100, 30), 150, 240); // Plataforma #2
        addObject(new LhamaPreta(), 535, 160);
        addObject(new Pomba(), 591, 70);
        addObject(new Jogador(), 510, 550);
    }
}
