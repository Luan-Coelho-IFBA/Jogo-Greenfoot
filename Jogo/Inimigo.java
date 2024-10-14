import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inimigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Inimigo extends Actor
{
    protected int vida;
    private final int GRAVIDADE = 1;
    protected int velocidade;
    private boolean acertadoPorTiro = false;
    
    public void cair() {
        if (!estaNoChao()) {
            velocidade += GRAVIDADE;
        } else {
            velocidade = 0;
        }
    }
    
    public void ajeitarPosicao() {
        if (estaNoChao()) {
            while(estaNoChao()) {
                setLocation(getX(), getY() - 1);
            }
            setLocation(getX(), getY() + 1);
        }
    }
    
    public boolean estaNoChao() {
        if (getY() >= getWorld().getHeight() - 30) {
            return true;
        }
        
        int larguraInimigo = getImage().getWidth();
        int alturaInimigo = getImage().getHeight();
        
        // Olha se está em uma plataforma
        
        if (getOneObjectAtOffset(larguraInimigo / -2, alturaInimigo / 2, Chao.class) != null) {
            return true;
        }
        
        if (getOneObjectAtOffset(larguraInimigo / 2, alturaInimigo / 2, Chao.class) != null) {
            return true;
        }
        
        return false;
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
            vida = 10;
            
            Greenfoot.playSound("animalMorre.mp3");
            
            if (getClass().equals(Boss.class)) {
                Greenfoot.setWorld(new GanhouJogo());
            }
        }
    }
}
