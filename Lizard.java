import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lizard extends Actor
{   
    
    Color[] colors = { Color.ORANGE, Color.RED };
    int colorNum = 0;
    int counter = 1;
    
    
    
        
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
       
    
    
    
    public void act() 
    {
        goTo();
        checkPlayerCollision();
        
    
    } 


     public void goTo()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        int PlayerX = player.getX();
        int PlayerY = player.getY();
        turnTowards(PlayerX,PlayerY);
        move(2);
        
        
    }
    
    public void checkPlayerCollision()
    {
    
          if(isTouching(Player.class))
        {
        removeTouching(Player.class);
        updateImage();
            
        }
            
            
    }

    

     public void updateImage()
    {
        setImage(new GreenfootImage("GAME\nOVER", 96, colors [colorNum], new Color(0, 0, 0, 0)));
        new Color(0, 0, 0, 0);
    }
        
        
    
}




        
   



    
    
        




            
    
    

              
