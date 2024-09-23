import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class MyWorld extends World
{   
    protected Jogador jogador;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
    }
    
    protected void irPraDireita(Jogador jogador, MyWorld mundo) {
        if (jogador.isAtEdge()) {
            if (jogador.getX() >= getWidth() - 10) {
                Greenfoot.setWorld(mundo);
                jogador.setLocation(jogador.getX() - 11, jogador.getY());
            }
        }
    }
    
    protected void irParaEsquerda(Jogador jogador, MyWorld mundo) {
        if (jogador.isAtEdge()) {
            if (jogador.getX() <= 10) {
                Greenfoot.setWorld(mundo);
                jogador.setLocation(jogador.getX() + 11, jogador.getY());
            }
        }
    }
    
    protected void irParaBaixo(Jogador jogador, MyWorld mundo) {
        if (jogador.isAtEdge()) {
            if (jogador.getY() >= getHeight() - 10) {
                Greenfoot.setWorld(mundo);
                jogador.setLocation(jogador.getX(), jogador.getY() - 11);
            }
        }
    }
}
