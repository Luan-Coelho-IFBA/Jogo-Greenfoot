import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cobra extends Inimigo
{
    private int vida = 100;
    private int velocidade = 4;
    private boolean acertadoPorTiro = false;
    
    public void act()
    {
        cair();
        ajeitarPosicao();
        andar();
        setLocation(getX(), getY() + super.velocidade);
        tomarDano();
    }
    
    public void andar() {
        int larguraCobra = getImage().getWidth();
        int alturaCobra = getImage().getHeight();
        
        if (getOneObjectAtOffset(larguraCobra / -2, alturaCobra / -2, Chao.class) == null &&
        getOneObjectAtOffset(larguraCobra / 2, alturaCobra / -2, Chao.class) != null) {
            
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
