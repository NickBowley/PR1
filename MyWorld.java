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
    
     public int a = 0;
    private int threshold = 100;
    
    
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
    public void gameOver()
{
    removeObjects(getObjects(Actor.class)); // remove all actors from world
    GreenfootImage bg = getBackground(); // get reference to background image
    bg.setColor(Color.BLACK); // set drawing color to black for 'bg' image
    bg.fill(); // fills 'bg' image with the currently set drawing color
    GreenfootImage txtImg = new GreenfootImage("GAME\nOVER", 80, Color.WHITE, Color.BLACK); // create "GAME OVER" text image
    bg.drawImage(txtImg, (bg.getWidth()-txtImg.getWidth())/2, (bg.getHeight()-txtImg.getHeight())/2); // draw text centered onto 'bg' image
    Greenfoot.stop(); // stop the scenario
}

}
