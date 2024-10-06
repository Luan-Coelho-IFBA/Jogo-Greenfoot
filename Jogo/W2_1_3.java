import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_1_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_1_3 extends W2
{
    ContextoW2 contexto;
    
    public W2_1_3(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaBaixo(jogador, contexto.w2_0_3);
            super.irParaCima(jogador, contexto.w2_2_3);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(450, 30), 375, 885); // Chão
        addObject(new Piso(450, 60), 225, 0); // Teto
        addObject(new Piso(30, 700), 15, 300); // Parede esquerda
        addObject(new Piso(30, 700), 585, 300); // Parede direita
        addObject(new Piso(450, 30), 225, 420); // Plataforma #1
        addObject(new Piso(450, 30), 375, 220); // Plataforma #2
        addObject(new Piso(100, 80), 550, 180); // Plataforma #3
        addObject(new Pomba(), 591, 70);
        addObject(new CobraVermelha(180), 430, 385);
        addObject(new Jogador(), 90, 550);
    }
}
