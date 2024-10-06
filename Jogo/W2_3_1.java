import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_3_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_3_1 extends W2
{
    ContextoW2 contexto;
    
    public W2_3_1(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaBaixo(jogador, contexto.w2_2_1);
            super.irParaCima(jogador, contexto.w2_4_1);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(200, 700), 100, 300); // Lateral esquerda
        addObject(new Piso(200, 700), 500, 300); // Lateral direita
        addObject(new Piso(100, 30), 250, 590); // Plataforma #1
        addObject(new Piso(100, 30), 350, 400); // Plataforma #2
        addObject(new Piso(100, 30), 250, 210); // Plataforma #3
        addObject(new Piso(100, 30), 350, 100); // Plataforma #4
        addObject(new Pomba(), 9, 20);
        addObject(new Jogador(), 350, 550);
    }
}
