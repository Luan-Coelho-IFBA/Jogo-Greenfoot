import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1_3 extends W1
{
    private ContextoW1 contexto;
    private boolean rodaUmaVez = false;
    
    public W1_3(ContextoW1 contexto)
    {
        prepare();
        this.contexto = contexto;
    }
    
    public void act() {
        if (!rodaUmaVez) {
            if (contexto.posicao == Posicao.BAIXO) {
                addObject(new Jogador(), 100, 500);
            } else {
                addObject(new Jogador() , 589, 120);
            }
            super.jogador = getObjects(Jogador.class).get(0);
            rodaUmaVez = true;
        }
        
        if (super.jogador != null) {
            super.processar();
        }
        
        if (super.jogador != null) {
            if (super.irParaBaixo(jogador, contexto.w0_3)) {
                contexto.posicao = Posicao.CIMA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
            else if (super.irParaDireita(jogador, contexto.w1_4)) {
                contexto.posicao = Posicao.ESQUERDA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
        }
    }
    
    public void prepare() {
        addObject(new Grama(30, 700), 10, 300);
        addObject(new Grama(700, 30), 300, 10);
        addObject(new Grama(500, 30), 400, 610);
        addObject(new Grama(100, 30), 450, 490);
        addObject(new Grama(30, 450), 590, 385);
        addObject(new Grama(100, 30), 350, 390);
        addObject(new Grama(100, 30), 250, 290);
        addObject(new Grama(300, 30), 450, 175);
        addObject(new CobraVerde(180), 540, 555);
        addObject(new LhamaBranca(), 500, 130);
    }
}
