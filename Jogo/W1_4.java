import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_4 extends W1
{
    private Jogar mundo;
    private boolean rodaUmaVez = false;

    public W1_4(Jogar mundo)
    {
        this.mundo = mundo;
        prepare();
    }
    
    public void act() {
        if (!rodaUmaVez) {
            if (mundo.posicao == Posicao.ESQUERDA) {
                addObject(new Jogador(), 11, 120);
            } else {
                addObject(new Jogador(), 480, 520);
            }
            super.jogador = getObjects(Jogador.class).get(0);
            rodaUmaVez = true;
        }
        
        if (jogador != null) {
            super.processar();
            if (irParaBaixo(jogador, mundo.w0_4) && super.jogador != null) {
                mundo.posicao = Posicao.CIMA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
            else if (irParaEsquerda(jogador, mundo.w1_3) && super.jogador != null) {
                mundo.posicao = Posicao.DIREITA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
        }
    }
    
    public void prepare() {
        addObject(new Grama(450, 30), 225, 590); // Chão
        addObject(new Grama(700, 30), 300, 10); // Teto
        addObject(new Grama(30, 450), 10, 375); // Lateral esquerda
        addObject(new Grama(30, 450), 590, 375);
        addObject(new Grama(100, 40), 60, 170); // Plataforma esquerda
    }
}
