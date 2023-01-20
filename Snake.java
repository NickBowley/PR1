import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Snake is the enemy.
 * 
 * @author Nick Bowley 
 * @version 1
 */
public class Snake extends Actor
{   
        
    /**
     * The below method gets the snake following the frog around the screen.
     */
    
    
    public void act() 
    {
         goTo();
    } 
    
     public void goTo()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
    int PlayerX = player.getX();
    int PlayerY = player.getY();
        
    turnTowards(PlayerX,PlayerY);
        move(2);
    }
    
    
}
