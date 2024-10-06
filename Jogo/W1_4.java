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
            } else if (mundo.posicao == Posicao.BAIXO) {
                addObject(new Jogador(), 480, 520);
            } else {
                addObject(new Jogador(), 589, 120);
            }
            super.jogador = getObjects(Jogador.class).get(0);
            rodaUmaVez = true;
        }
        
        if (jogador != null) {
            super.processar();
        }
        
        if (jogador != null) {
            if (irParaBaixo(jogador, mundo.w0_4)) {
                mundo.posicao = Posicao.CIMA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
            else if (irParaEsquerda(jogador, mundo.w1_3)) {
                mundo.posicao = Posicao.DIREITA;
                rodaUmaVez = false;
                removeObject(jogador);
            } else if (irParaDireita(jogador, mundo.w1_5)) {
                mundo.posicao = Posicao.ESQUERDA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
        }
    }
    
    public void prepare() {
        addObject(new Grama(450, 30), 225, 590); // Chão
        addObject(new Grama(700, 30), 300, 10); // Teto
        addObject(new Grama(30, 450), 10, 375); // Lateral esquerda
        addObject(new Grama(30, 450), 590, 375); // Lateral direita
        addObject(new Grama(100, 30), 60, 165); // Plataforma esquerda
        addObject(new Grama(100, 30), 540, 165); // Plataforma direita
        addObject(new LhamaBranca(), 540, 120); // Lhama
        addObject(new Grama(100, 30), 75, 480); // Plataforma #1
        addObject(new Grama(100, 30), 210, 380); // Plataforma #2
        addObject(new Grama(100, 30), 345, 280); // Plataforma #3
        addObject(new Grama(150, 30), 500, 195); // Plataforma #4
    }
}
