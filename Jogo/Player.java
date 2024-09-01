import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int walkSpeed = 4;
    private final int GRAVITY = 1;
    private int velocity;
    private boolean hasDoubleJump = true;
    private boolean doubleJump = true;
    
    public Player() {
        this.velocity = 0;
    }
    
    public void act()
    {
        move();
        fall();
        jump();
        setLocation(getX(), getY() + velocity);
    }
    
    public void move() {
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - walkSpeed, getY());
        }
        if (Greenfoot.isKeyDown("d")) {
        setLocation(getX() + walkSpeed, getY());
        }
    }
    
    public void fall() {
        if (!isOnGround()) {
            velocity += GRAVITY;
        } else {
            velocity = 0;
        }
    }
    
    public void jump() {
        if (isOnGround() && Greenfoot.isKeyDown("space")) {
            velocity = -15;
        }
        
        if (!isOnGround() && Greenfoot.isKeyDown("space") &&
        hasDoubleJump && doubleJump && velocity >= -2) {
            doubleJump = false;
            velocity = -15;
        }
    }
    
    public boolean isOnGround() {
        if (getY() > getWorld().getHeight() - 50) {
            doubleJump = true;
            return true;
        } else {
            return false;
        }
    }
}
