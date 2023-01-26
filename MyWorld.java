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
    
    
    private int score = 0;
    int worldSizeX = 700;
    int worldSizeY = 500;
    
    public int a = 0;
    private int threshold = 50;
    Color[] colors = { Color.ORANGE, Color.RED };
    int colorNum = 0;
    int counter = 1;

    
    
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
        
    
    public void increaseScore (int amount)
    {
        score+=amount;
        showText("Score is: " + score, 70,20);
        
          if (score==5)
        {
        showText("CONGRATULATIONS, YOU'VE WON: " + score, 300, 300);
        Greenfoot.stop();
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
               public void act()
        
        {
            a++;
        if(a == threshold)
        {
            RandomThingMethod();
            a = 0;
        }
    }
    

        public void RandomThingMethod()
    {
        int z = Greenfoot.getRandomNumber(10);
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
 
        if(z == 1)
            addObject(new Firefly(),x,y); 
    }
    
    
       
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Player(),200,100);
        int prepareFliesLoop = 5;
        
        while (prepareFliesLoop > 0)
        {
            flySpawner();
            --prepareFliesLoop;
        }
        
        addObject(new Lizard(), 100,200);
    }

}
