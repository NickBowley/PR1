import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the Player class is the player's character. They can move and eat flies.
 * 
 * @author Nick Bowley 
 * @author Piers Watson
 * @version 1.1
 */
public class Player extends Actor
{
    int fireFliesEaten = 0;
    int flysEaten = 0;
    int turnRate = 3;
    int turnRateEdge = 20;
    int jumpDistance = 100;
    int jumpDelay = 0;
    int energy = 0;
    int maxEnergy = 5;
    
    

    
    
    
        public void checkCollision()
    {
        if(isTouching(Fly.class))
        {
            
            removeTouching(Fly.class);
        
            flysEaten +=1;
        
        MyWorld mw = (MyWorld)getWorld();
        mw.increaseScore(+1);
            
    }  
        
        
        if(isTouching(Firefly.class))
        
        {
            removeTouching(Firefly.class);
        
        MyWorld mw = (MyWorld)getWorld();
        fireFliesEaten +=2;
        mw.increaseScore(5);
            
        }
        
        
        
        
            
    }
    
    public void act()
    {
        checkCollision();
        
        //this if condition allows the jump delay to tick down.
        if(jumpDelay > 0)
        {
            --jumpDelay;
        }
        
        //this one allows the player to 'jump' if the delay is zero.
        if(Greenfoot.isKeyDown("up") & (jumpDelay==0))
        {
            move(jumpDistance);
            jumpDelay = 20;
        }
        
        //this one is supposed to make you turn around at the edge, 
        //but we'll probably have to adapt that to killing the Frog
        if (isAtEdge())
        {
            turn(turnRateEdge);
        }
        
        //then here we have the controls for turning the frog left and right.
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-turnRate);
        }
        
        if (Greenfoot.isKeyDown("right"))   
        {
            turn(turnRate);
        }
        

    }
        
   
    }      

                    
                 
                
                
        
        
    
                    
                
            
                    
                
               
          
        
    
    

