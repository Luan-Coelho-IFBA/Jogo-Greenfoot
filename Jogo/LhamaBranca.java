import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Llama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LhamaBranca extends Lhama
{
    public LhamaBranca() {
        super.TIRO_COOLDOWN = 60;
        super.tiroCoolDown = 60;
        super.vida = 10;
        super.imagemDireita = new GreenfootImage("lhama direita.png");
        super.imagemEsquerda = new GreenfootImage("lhama esquerda.png");
    }
    
    public void act()
    {
        super.processar();
    }
}
