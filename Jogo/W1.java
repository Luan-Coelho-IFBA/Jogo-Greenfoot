import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1 extends MyWorld
{    
    protected static int vida;
    
    public W1()
    {
        vida = 100;
    }
    
    protected void tomarDano() {
        if (super.jogador.estaTocandoInimigo()) {
            this.vida -= 20;
        }
        
        if (this.vida <= 0) {
            removeObject(super.jogador);
            super.jogador = null;
        }
    }
    
    protected void mostrarVida() {
    }
}
