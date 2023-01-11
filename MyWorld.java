import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Nick Bowley
 * @author Piers Watson
 * @version 1.1
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
