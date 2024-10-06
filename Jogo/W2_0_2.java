import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_0_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_0_2 extends W2
{
    ContextoW2 contexto;
    
    public W2_0_2(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaEsquerda(jogador, contexto.w2_0_1);
            super.irPraDireita(jogador, contexto.w2_0_3);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(700, 60), 300, 570); // Chão
        addObject(new Piso(700, 60), 300, 30); // Teto
        addObject(new Piso(60, 450), 0, 225); // Parede esquerda
        addObject(new Piso(60, 450), 600, 225); // Parede direita
        addObject(new Piso(100, 30), 540, 200); // Plataforma
        addObject(new LhamaPreta(), 530, 160);
        addObject(new Pomba(), 11, 100);
        addObject(new Jogador(), 11, 510);
    }
}
