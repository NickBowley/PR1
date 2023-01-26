import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Nick Bowley
 * @author Piers Watson
 * @version P.26/01/23
 */

//Heya, These // comments
public class MyWorld extends World
{
    
    
    private int score = 0;
    int winCondition = 10;
    int worldSizeX = 700;
    int worldSizeY = 500;
    
    int maxObjects = 5;
    
    public int a = 0; //can't help but wonder why this variable is just called 'a'
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
        
        act();

        
    }
        
    
    public void increaseScore (int amount)
    {
        score+=amount;
        showText("Score is: " + score, 70,20);
        
        if (score>=winCondition)
        {
            showText("CONGRATULATIONS, YOU'VE WON: " + score, 300, 300);
            Greenfoot.stop();
        }
        
    }
  
    
    
    /*
     * I've commented out this method, as the RandomThingMethod() has made it redundant.
     */
    //private void flySpawner()
    //{
    //    int luckyNumber = Greenfoot.getRandomNumber(1000);
    //    int mwSizeX = getWidth();
    //    int mwSizeY = getHeight();
    //    
    //    int objectCount = numberOfObjects() - 3;
    //    
    //    
    //    if((luckyNumber > 950) & (objectCount < maxObjects))
    //    {
    //        int flyX = Greenfoot.getRandomNumber(mwSizeX - 20) + 10;
    //        int flyY = Greenfoot.getRandomNumber(mwSizeY - 20) + 10;
    //        addObject(new Firefly(), flyX, flyY); 
    //    }
    //    if((luckyNumber < 100) & (objectCount < maxObjects))
    //    {
    //        int flyX = Greenfoot.getRandomNumber(mwSizeX - 20) + 10;
    //        int flyY = Greenfoot.getRandomNumber(mwSizeY - 20) + 10;
    //        addObject(new Fly(), flyX, flyY); 
    //        
    //    } 
    //}
    
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
        
        //love this method, as it can completely replace the 'spawner' actor.
        //just made a few little tweaks to the numbers to let it spawn flies more often than fireflies, and to stop it from spawning too many.
        
        int objectCount = numberOfObjects() - 2; //the two being subtracted are the Player and the Lizard
        
        int z = Greenfoot.getRandomNumber(100);
        int x = Greenfoot.getRandomNumber(getWidth() - 20) + 10;
        int y = Greenfoot.getRandomNumber(getHeight() - 20) + 10;
 
        
        //flies have (roughly) a 10% chance of spawning, Fireflies are at 5%.
        //it won't spawn both at the same time, and it won't spawn either if there's 5 bugs already on screen.
        
        if(objectCount < maxObjects)
        {
            if(z >= 90)
            {
                addObject(new Fly(), x, y);
            }
        
            if(z <= 5)
            {
                addObject(new Firefly(), x, y); 
            }
        }
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
            int flyX = Greenfoot.getRandomNumber(worldSizeX - 20) + 10;
            int flyY = Greenfoot.getRandomNumber(worldSizeY - 20) + 10;
            addObject(new Fly(), flyX, flyY); 
            
            --prepareFliesLoop;
        }
        
        addObject(new Lizard(), 300,300);
    }

}
