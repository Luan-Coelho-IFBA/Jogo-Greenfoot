import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ovo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ovo extends Projetil
{
    public static int dano = 10;
    private int velocidade = 6;
    
    public void act()
    {
        move(velocidade);
        this.checarSeChegouNoFim();
    }
    
    @Override()
    public void checarSeChegouNoFim() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
