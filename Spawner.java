import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    //this maximum doesnt include the frog or the spawner.
    int maxObjects = 5;
    
    int lizardTimer = 1000;
    
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
        
        int objectCount = mw.numberOfObjects() - 2;
        
        //this conditional statement will count down from 1000 to 0, then spawn the lizard.
        if(lizardTimer <= 0)
        {
            mw.addObject(new Lizard(), 600, 400);
        } else {
            lizardTimer -= 1;
        }
        
        if((luckyNumber < 100) & (objectCount < maxObjects))
        {
            int flyX = Greenfoot.getRandomNumber(mwSizeX - 20) + 10;
            int flyY = Greenfoot.getRandomNumber(mwSizeY - 20) + 10;
            mw.addObject(new Fly(), flyX, flyY); 
            
        }
    }
}
