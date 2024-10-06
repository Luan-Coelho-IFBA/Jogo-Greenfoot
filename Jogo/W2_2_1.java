import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_2_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_2_1 extends W2
{
    ContextoW2 contexto;

    public W2_2_1(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaDireita(jogador, contexto.w2_2_2);
            super.irParaCima(jogador, contexto.w2_3_1);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(700, 60), 300, 570); // Chão
        addObject(new Piso(475,30), 225, 15); // Teto
        addObject(new Piso(60, 450), 600, 225); // Parede direita
        addObject(new Piso(100, 700), 250, 300);
        addObject(new Piso(100, 700), 50, 300);
        addObject(new Piso(300, 300), 150, 450);
        addObject(new Piso(300, 150), 150, 75);
        addObject(new Piso(100, 30), 350, 340); // Plataforma #1
        addObject(new Piso(100, 30), 520, 200); // Plataforma #2
        addObject(new LhamaPreta(), 150, 275);
        addObject(new Jogador(), 589, 512);
    }
}
