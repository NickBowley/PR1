import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author Nick Bowley 
 * @version 1
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int flysEaten = 0;
    
    public void act()
    {
        move(5);
        
         if (isAtEdge()) 
   {
         turn(17);
    }
    
     if (Greenfoot.isKeyDown("left")) 
   {
          turn(-4);
   }
   if (Greenfoot.isKeyDown("right"))   
   {
         turn(4);
   }
   { 
       checkCollision();
   
    }
}   
   

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
                
            }
                    
                 
                
                
        
        
    
                    
                
            
                    
                
               
          
        
    
    

