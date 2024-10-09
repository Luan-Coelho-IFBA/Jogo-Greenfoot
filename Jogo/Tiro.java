import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiro extends Projetil
{
    public static int dano = 20;
    private int velocidade = 6;
    
    public void act()
    {
        move(velocidade);
        super.checarSeChegouNoFim();
    }
}
