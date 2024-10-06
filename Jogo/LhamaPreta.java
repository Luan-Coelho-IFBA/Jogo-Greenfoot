import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class LhamaPreta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LhamaPreta extends Lhama
{
    public LhamaPreta() {
        super.TIRO_COOLDOWN = 30;
        super.tiroCoolDown = 30;
        super.vida = 10;
        super.imagemDireita = new GreenfootImage("lhama direita_Copy.png");
        super.imagemEsquerda = new GreenfootImage("lhama esquerda_Copy.png");
    }
    
    public void act()
    {
        super.processar();
    }
}
