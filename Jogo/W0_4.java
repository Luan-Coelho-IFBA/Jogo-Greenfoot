import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W0_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W0_4 extends W1
{
    private ContextoW1 contexto;
    private boolean rodaUmaVez = false;
    
    public W0_4(ContextoW1 contexto)
    {
        prepare();
        this.contexto = contexto;
    }
    
    public void act() {
        if (!rodaUmaVez) {
            if (contexto.posicao == Posicao.CIMA) {
                addObject(new Jogador(), 520, 11);
            } else {
                addObject(new Jogador() , 11, 545);
            }
            super.jogador = getObjects(Jogador.class).get(0);
            rodaUmaVez = true;
        }
        
        if (super.jogador != null) {
            super.processar();
        }
        
        if (super.jogador != null) {
            if (super.irParaEsquerda(jogador, contexto.w0_3)) {
                contexto.posicao = Posicao.DIREITA;
                rodaUmaVez = false;
                removeObject(jogador);
            }
            else if (super.irParaCima(jogador, contexto.w1_4)) {
                contexto.posicao = Posicao.BAIXO;
                rodaUmaVez = false;
                removeObject(jogador);
            }
        }
    }
    
    public void prepare() {
        addObject(new Grama(700, 30), 300, 590); // Chão
        addObject(new Grama(450, 30), 225, 10); // Teto
        addObject(new Grama(60, 450), 0, 225); // Lateral esquerda
        addObject(new Grama(30, 700), 590, 350); // Lateral direita
        addObject(new Grama(300, 325), 450, 417); // Bloco direita
        addObject(new Grama(100, 40), 250, 475);// Plataforma #1
        addObject(new Grama(100, 40), 75, 375);// Plataforma #2
        addObject(new Grama(100, 40), 250, 275);// Plataforma #3
        addObject(new Grama(100, 40), 525, 160);// Plataforma #4
        addObject(new Grama(50, 40), 550, 120);// Plataforma #4
        Cobra cobra = new CobraVerde(160);
        addObject(cobra,540,220);
    }
}
