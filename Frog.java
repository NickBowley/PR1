import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author Nick Bowley 
 * @author Piers Watson
 * @version 1.1
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void checkCollision()
    {
        if(isTouching(Fly.class))
        {
            removeTouching(Fly.class);
        
            flysEaten+=1;
        
            MyWorld mw = (MyWorld)getWorld();
            mw.showText("Score is: " + flysEaten, 70,20);
        }
    }

    
    int flysEaten = 0;
    int turnRate = 4;
    int turnRateEdge = 20;
    int jumpDistance = 5;
    int jumpDelay = 5;
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            move(jumpDistance);
            
        }
        
        if (isAtEdge())
        {
            turn(turnRateEdge);
        }
    
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-turnRate);
        }
        
        if (Greenfoot.isKeyDown("right"))   
        {
            turn(turnRate);
        }
        
        checkCollision();
    }        
}   
   

                    
                 
                
                
        
        
    
                    
                
            
                    
                
               
          
        
    
    

