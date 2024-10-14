import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_5 extends W1
{

    private ContextoW1 contexto;
    
    public W1_5(ContextoW1 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.processar();
            if (super.irParaEsquerda(jogador, contexto.w1_4)) {
                contexto.posicao = Posicao.DIREITA;
            }
        }
    }
    
    private void prepare() {
        addObject(new Grama(700, 30), 300, 590); // Chão
        addObject(new Jogador(), 11, 545);
        Castelo castelo = new Castelo();
        addObject(castelo,500,425);
    }
}
