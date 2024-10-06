import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Chao extends Actor
{
    GreenfootImage image;
    
    public Chao() {
        this(250, 25);
    }
    
    public Chao(int largura, int altura) {
        image = getImage();
        
        image.scale(largura, altura);
        
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
