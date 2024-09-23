import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CobraVermelha extends Inimigo
{
    private int vida = 400;
    private int velocidade = -2;
    private boolean acertadoPorTiro = false;
    private final int QUANTIDADE_PASSOS;
    private int contagemPassos;
    
    public CobraVermelha(int contagem) {
        QUANTIDADE_PASSOS = contagem;
        contagemPassos = QUANTIDADE_PASSOS;
    }
    
    public void act()
    {
        cair();
        andar();
        ajeitarPosicao();
        setLocation(getX() + velocidade, getY() + super.velocidade);
        tomarDano();
    }
    
    public void andar() {
        if (contagemPassos <= 0) {
            velocidade = -velocidade;
            contagemPassos = QUANTIDADE_PASSOS;
            getImage().mirrorHorizontally();
        } else {
            contagemPassos--;
        }
    }
    
    public void tomarDano() {
        Actor tiro = getOneIntersectingObject(Tiro.class);
        
        if (tiro != null && !acertadoPorTiro) {
            vida -= Tiro.dano;
            acertadoPorTiro = true;
            
            getWorld().removeObject(tiro);
        }
        
        if (tiro == null) {
            acertadoPorTiro = false;
        }
        
        if (vida <= 0) {
            getWorld().removeObject(this);
            vida = 100;
        }
    }
}
