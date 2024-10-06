import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W0_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W0_3 extends W1
{
    private Jogar mundo;
    private boolean rodaUmaVez = false;
    
    public W0_3(Jogar mundo)
    {
        prepare();
        this.mundo = mundo;
    }
    
    public void act() {
        if (!rodaUmaVez) {
            if (mundo.posicao == Posicao.ESQUERDA) {
                addObject(new Jogador(), 11, 520);
            } else if (mundo.posicao == Posicao.CIMA) {
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
            if (super.irParaEsquerda(jogador, mundo.w0_2)) {
                mundo.posicao = Posicao.DIREITA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
            else if (super.irParaCima(jogador, mundo.w1_3)) {
                mundo.posicao = Posicao.BAIXO;
                rodaUmaVez = false;
                removeObject(jogador);
            }
            else if (super.irParaDireita(jogador, mundo.w0_4)) {
                mundo.posicao = Posicao.ESQUERDA;
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
