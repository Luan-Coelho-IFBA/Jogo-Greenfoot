import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogador extends Actor
{
    private int velocidadeAndar = 4;
    private final int GRAVIDADE = 1;
    private int velocidade;
    private static boolean temPuloDuplo = false;
    private static boolean duploPulo = true;
    private int tiroCollDown = 0;
    private int danoCollDown = 0;
    
    public Jogador() {
        this.velocidade = 0;
    }
    
    public void act()
    {
        movimentar();
        cair();
        pular();
        verificarBateuCabeca();
        ajeitarPosicao();
        atirar();
        setLocation(getX(), getY() + velocidade);
    }
    
    public void movimentar() {
        if (Greenfoot.isKeyDown("a") && podeMoverPraEsquerda()) {
            setLocation(getX() - velocidadeAndar, getY());
        }
        
        if (Greenfoot.isKeyDown("d") && podeMoverPraDireita()) {
        setLocation(getX() + velocidadeAndar, getY());
        }
    }
    
    public void cair() {
        if (!estaNoChao()) {
            velocidade += GRAVIDADE;
        } else {
            velocidade = 0;
        }
    }
    
    public void pular() {
        if (estaNoChao() && Greenfoot.isKeyDown("space")) {
            velocidade = -15;
        }
        
        if (!estaNoChao() && Greenfoot.isKeyDown("space") &&
        temPuloDuplo && duploPulo && velocidade >= -2) {
            duploPulo = false;
            velocidade = -15;
        }
    }
    
    public void ajeitarPosicao() {
        if (estaNoChao()) {
            while(estaNoChao()) {
                setLocation(getX(), getY() - 1);
            }
            setLocation(getX(), getY() + 1);
        }
    }
    
    public void verificarBateuCabeca() {
        // Olha se bateu a cabeça ao pular
        
        int larguraJogador = getImage().getWidth();
        int alturaJogador = getImage().getHeight();
        
        if (velocidade < 0 &&
        (getOneObjectAtOffset(larguraJogador / -2, alturaJogador / -2, Chao.class) != null ||
        getOneObjectAtOffset(larguraJogador / 2, alturaJogador / -2, Chao.class) != null)) {
            velocidade = 0;
        }
    }
    
    public void atirar() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        tiroCollDown--;
        
        if (mouse != null && tiroCollDown <= 0) {
            int button = mouse.getButton();
            
            if (button == 1) {
                Tiro tiro = new Tiro();
                getWorld().addObject(tiro, getX(), getY());
                tiro.turnTowards(mouse.getX(), mouse.getY());
                tiroCollDown = 20;
            }
        }
     }
     
    public boolean estaTocandoInimigo() {
        if (isTouching(Inimigo.class) && danoCollDown <= 0) {
            danoCollDown = 20;
            return true;
        } else {
            danoCollDown--;
        }
        
        return false;
    }
    
    public boolean estaNoChao() {
        int larguraJogador = getImage().getWidth();
        int alturaJogador = getImage().getHeight();
        
        // Olha se está em uma plataforma
        
        if (getOneObjectAtOffset(larguraJogador / -2, alturaJogador / 2, Chao.class) != null) {
            duploPulo = true;
            return true;
        }
        
        if (getOneObjectAtOffset(larguraJogador / 2, alturaJogador / 2, Chao.class) != null) {
            duploPulo = true;
            return true;
        }
        
        return false;
    }
    
    public boolean podeMoverPraEsquerda() {
        int larguraJogador = getImage().getWidth();
        int alturaJogador = getImage().getHeight();
        
        if (getOneObjectAtOffset(larguraJogador / -2 - 5, alturaJogador / 2, Chao.class) != null &&
        getOneObjectAtOffset(larguraJogador / -2 - 5, alturaJogador / -2, Chao.class) != null) {
            return false;
        }
        
        if (getOneObjectAtOffset(larguraJogador / -2 - 5, alturaJogador / 2, Chao.class) == null &&
        getOneObjectAtOffset(larguraJogador / -2 - 5, alturaJogador / -2, Chao.class) != null) {
            return false;
        }
        
        if (getOneObjectAtOffset(larguraJogador / -2 - 5, alturaJogador / 2 - 1, Chao.class) != null &&
        getOneObjectAtOffset(larguraJogador / -2 - 5, alturaJogador / -2, Chao.class) == null) {
            return false;
        }
        
        if (isTouching(Chao.class) && !estaNoChao() &&
        getOneObjectAtOffset(larguraJogador / -2 - 5, alturaJogador / 2, Chao.class) == null &&
        getOneObjectAtOffset(larguraJogador / -2 - 5, alturaJogador / -2, Chao.class) == null) {
            return false;
        }
        
        return true;
    }
    
    public boolean podeMoverPraDireita() {
        int larguraJogador = getImage().getWidth();
        int alturaJogador = getImage().getHeight();
        
        if (getOneObjectAtOffset(larguraJogador / 2 + 5, alturaJogador / 2, Chao.class) != null &&
        getOneObjectAtOffset(larguraJogador / 2 + 5, alturaJogador / -2, Chao.class) != null) {
            return false;
        }
        
        if (getOneObjectAtOffset(larguraJogador / 2 + 5, alturaJogador / 2, Chao.class) == null &&
        getOneObjectAtOffset(larguraJogador / 2 + 5, alturaJogador / -2, Chao.class) != null) {
            return false;
        }
        
        if (getOneObjectAtOffset(larguraJogador / 2 + 5, alturaJogador / 2 - 1, Chao.class) != null &&
        getOneObjectAtOffset(larguraJogador / 2 + 5, alturaJogador / -2, Chao.class) == null) {
            return false;
        }
        
        if (isTouching(Chao.class) && !estaNoChao() &&
        getOneObjectAtOffset(larguraJogador / 2 + 5, alturaJogador / 2, Chao.class) == null &&
        getOneObjectAtOffset(larguraJogador / 2 + 5, alturaJogador / -2, Chao.class) == null) {
            return false;
        }
        
        return true;
    }
}
