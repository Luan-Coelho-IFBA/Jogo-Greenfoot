import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CobraVerde extends Cobra
{
    public CobraVerde(int contagem) {
        super.QUANTIDADE_PASSOS = contagem;
        super.contagemPassos = super.QUANTIDADE_PASSOS;
        super.vida = 100;
    }
    
    public void act() {
        super.processar();
    }
}
