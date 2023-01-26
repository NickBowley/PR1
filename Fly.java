import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author Nick Bowley 
 * @version 
 */
public class Fly extends Actor
{
    /**
     * Act - The below method makes the flies move around the game randomly,
     * turing when they hit the egde of the screen.
     * 
     */
    public void act()
    
    { 
        move(2);
    if (Greenfoot.getRandomNumber(100) <10)
    
    {
        turn(Greenfoot.getRandomNumber(90) - 45);
    }
    
    if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
    
    {
        turn(180);
    }
    
    if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)    
    {
        turn(180);
    }
    
  
               }
          }

  
