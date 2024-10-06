import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_4_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_4_2 extends W2
{
    ContextoW2 contexto;
    
    public W2_4_2(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaEsquerda(jogador, contexto.w2_4_1);
            super.irParaBaixo(jogador, contexto.w2_3_2);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(450, 60), 225, 600); // Chão
        addObject(new Piso(700, 60), 300, 0); // Teto
        addObject(new Piso(60, 450), 30, 375); // Lateral esquerda
        addObject(new Piso(60, 700), 600, 300); // Lateral direita
        addObject(new Pomba(), 591, 50);
        addObject(new Jogador(), 30, 500);
    }
}
