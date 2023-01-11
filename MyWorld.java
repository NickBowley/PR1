import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Nick Bowley
 * @author Piers Watson
 * @version 1.1ish
 */
public class MyWorld extends World
{
    
    
    
    int worldSizeX = 700;
    int worldSizeY = 500;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 700x500 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        
        prepare();
        //the following line gives a random number from 0-999 inclusive.
        //use this for anything that has a percentage chance of happening.
        //considering that greenfoot does like 10 ticks a second, you'll wanna keep those chances pretty low.
        int luckyNumber = Greenfoot.getRandomNumber(1000);
        int flyCount = flyCounter();
        if (luckyNumber < 50 & flyCount < 7)
        {
            flySpawner();
        }
        
        
        
    }
    
    /**
     * This method will be for spawning Flies. It grabs a random co-ordinate (10 steps away from the edges), then spawns a fly there.
     */
    private void flySpawner()
    {
        int flyX = Greenfoot.getRandomNumber(worldSizeX - 20) + 10;
        int flyY = Greenfoot.getRandomNumber(worldSizeY - 20) + 10;
        addObject(new Fly(), flyX, flyY); 
    }
    
    
    /**
     * This method is for counting how many Flies are currently 'alive'. This is so that we never spawn more than 5 at a given time.
     */
    private int flyCounter()
    {
        int flyCount = numberOfObjects();
        return flyCount;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Frog(),200,100);
        int prepareFliesLoop = 5;
        
        while (prepareFliesLoop > 0)
        {
            flySpawner();
            --prepareFliesLoop;
        }
        
    }
}
