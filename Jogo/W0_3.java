import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W0_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W0_3 extends W1
{
    private ContextoW1 contexto;
    private boolean rodaUmaVez = false;
    
    public W0_3(ContextoW1 contexto)
    {
        prepare();
        this.contexto = contexto;
    }
    
    public void act() {
        if (!rodaUmaVez) {
            if (contexto.posicao == Posicao.ESQUERDA) {
                addObject(new Jogador(), 11, 520);
            } else if (contexto.posicao == Posicao.CIMA) {
                addObject(new Jogador() , 100, 11);
            } else {
                addObject(new Jogador(), 589, 520);
            }
            super.jogador = getObjects(Jogador.class).get(0);
            rodaUmaVez = true;
        }
        
        if (super.jogador != null) {
            super.processar();
        }
        if (super.jogador != null) {
            if (super.irParaEsquerda(jogador, contexto.w0_2)) {
                contexto.posicao = Posicao.DIREITA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
            else if (super.irParaCima(jogador, contexto.w1_3)) {
                contexto.posicao = Posicao.BAIXO;
                rodaUmaVez = false;
                removeObject(jogador);
            }
            else if (super.irParaDireita(jogador, contexto.w0_4)) {
                contexto.posicao = Posicao.ESQUERDA;
                rodaUmaVez = false;
                removeObject(jogador);
            };
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Grama(700, 60), 300, 580);
        addObject(new Grama(60, 400), 0, 200);
        addObject(new Grama(300, 470), 450, 235);
        addObject(new Grama(100, 40), 250, 450);
        addObject(new Grama(100, 40), 70, 350);
        addObject(new Grama(100, 40), 250, 250);
        addObject(new Grama(100, 40), 70, 140);
    }
}
