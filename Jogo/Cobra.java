import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Cobra extends Inimigo
{
    private int velocidadeAndar = -2;
    protected int QUANTIDADE_PASSOS;
    protected int contagemPassos;
    
    public void processar()
    {
        super.cair();
        andar();
        super.ajeitarPosicao();
        setLocation(getX() + velocidadeAndar, getY() + super.velocidade);
        super.tomarDano();
    }
    
    public void andar() {
        if (contagemPassos <= 0) {
            velocidadeAndar = -velocidadeAndar;
            contagemPassos = QUANTIDADE_PASSOS;
            getImage().mirrorHorizontally();
        } else {
            contagemPassos--;
        }
    }
}
