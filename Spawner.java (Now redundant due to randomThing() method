import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class spawner here.
 * 
 * @author Nick Bowley
 * @author Piers Watson
 * @version (a version number or a date)
 */


//NOTE: this entire class has been made redundant by a single method in MyWorld. As such, it has been retained exclusively for documentation purposes.


public class Spawner extends Actor
{
    //this maximum doesnt include the frog, the lizard or the spawner.
    int maxObjects = 5;
    
    
    /**
     * Act - do whatever the spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int luckyNumber = Greenfoot.getRandomNumber(1000);
        MyWorld mw = (MyWorld)getWorld();
        int mwSizeX = mw.getWidth();
        int mwSizeY = mw.getHeight();
        
        int objectCount = mw.numberOfObjects() - 3;
        
        
        if((luckyNumber > 950) & (objectCount < maxObjects))
        {
            int flyX = Greenfoot.getRandomNumber(mwSizeX - 20) + 10;
            int flyY = Greenfoot.getRandomNumber(mwSizeY - 20) + 10;
            mw.addObject(new Firefly(), flyX, flyY); 
        }
        if((luckyNumber < 100) & (objectCount < maxObjects))
        {
            int flyX = Greenfoot.getRandomNumber(mwSizeX - 20) + 10;
            int flyY = Greenfoot.getRandomNumber(mwSizeY - 20) + 10;
            mw.addObject(new Fly(), flyX, flyY); 
            
        }
        
        
        
        
    }
}
