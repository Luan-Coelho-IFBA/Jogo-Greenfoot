import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CobraVermelha extends Cobra
{    
    public CobraVermelha(int contagem) {
        super.QUANTIDADE_PASSOS = Math.abs(contagem);
        super.contagemPassos = contagem;
        super.vida = 400;
    }
    
    public void act()
    {
        super.processar();
    }
}
