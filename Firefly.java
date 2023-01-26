import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Firefly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Firefly extends Fly
{
    
    int anim = 1;
    
    /**
     * Act - do whatever the Firefly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.{ 
        move(3);
        
        anim -= 1;
        //Derek, if you're reading this, the numbers seen in the next two 'if' statements are just how many game ticks it takes to switch images. 
        //I'm not defining more than one integer for that.
        if(anim == 0)
        {
            this.setImage("Firefly2.png");
            anim = 4;
        } 
        if (anim <= 2)
        {
            this.setImage("Firefly1.png");
        }
        
        if (Greenfoot.getRandomNumber(100) < 10)
    
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
    
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
    
        {
            turn(180);
            move(5);
        }
    
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)    
        {
            turn(180);
            move(5);
        }
    
  
    }
}