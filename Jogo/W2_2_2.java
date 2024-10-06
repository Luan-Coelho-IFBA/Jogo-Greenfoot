import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_2_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_2_2 extends W2
{
    ContextoW2 contexto;

    public W2_2_2(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaEsquerda(jogador, contexto.w2_2_1);
            super.irParaDireita(jogador, contexto.w2_2_3);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(700, 60), 300, 570); // Chão
        addObject(new Piso(700, 450), 300, 225); // Teto
        addObject(new CobraVerde(-270), 11, 520); // Cobra #1
        addObject(new CobraVerde(-270), 31, 520); // Cobra #2
        addObject(new Jogador(), 589, 512);
    }
}
