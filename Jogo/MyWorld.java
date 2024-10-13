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
    protected static int vida;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
    }
    
    protected void processar() {
        tomarDano();
        mostrarVida();
    }
    
    private void tomarDano() {
        if (this.jogador.estaTocandoInimigo()) {
            this.vida -= 20;
            Greenfoot.playSound("machucado.mp3");
        }
        
        if (this.jogador.estaTocandoCuspe()) {
            this.vida -= Cuspe.dano;
            Greenfoot.playSound("machucado.mp3");
        }
        
        if (this.jogador.estaTocandoOvo()) {
            this.vida -= Ovo.dano;
            Greenfoot.playSound("machucado.mp3");
        }
        
        if (this.jogador.estaTocandoBolaDeFogo()) {
            this.vida -= BolaDeFogo.dano;
            Greenfoot.playSound("machucado.mp3");
        }
        
        if (this.vida <= 0) {
            removeObject(this.jogador);
            this.jogador = null;
        }
    }
    
    private void mostrarVida() {
        if (this.vida > 0) {
            showText("VIDA: " + this.vida, 100, 20);
        } else {
            showText(" ", 100, 20);
            showText("VOCÊ MORREU!", 300, 300);
        }
    }
    
    protected boolean irParaDireita(Jogador jogador, MyWorld mundo) {
        if (jogador.isAtEdge()) {
            if (jogador.getX() >= getWidth() - 10) {
                Greenfoot.setWorld(mundo);
                apagarBalas();
                jogador.setLocation(jogador.getX() - 11, jogador.getY());
                return true;
            }
        }
        return false;
    }
    
    protected boolean irParaEsquerda(Jogador jogador, MyWorld mundo) {
        if (jogador.isAtEdge()) {
            if (jogador.getX() <= 10) {
                Greenfoot.setWorld(mundo);
                apagarBalas();
                jogador.setLocation(jogador.getX() + 11, jogador.getY());
                return true;
            }
        }
        return false;
    }
    
    protected boolean irParaBaixo(Jogador jogador, MyWorld mundo) {
        if (jogador.isAtEdge()) {
            if (jogador.getY() >= getHeight() - 10) {
                Greenfoot.setWorld(mundo);
                apagarBalas();
                jogador.setLocation(jogador.getX(), jogador.getY() - 50);
                return true;
            }
        }
        return false;
    }
    
    protected boolean irParaCima(Jogador jogador, MyWorld mundo) {
        if (jogador.isAtEdge()) {
            if (jogador.getY() <= 10) {
                Greenfoot.setWorld(mundo);
                apagarBalas();
                jogador.setLocation(jogador.getX(), jogador.getY() + 11);
                return true;
            }
        }
        return false;
    }
    
    private void apagarBalas() {
        removeObjects(getObjects(Projetil.class));
    }
}
