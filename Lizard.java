import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * The Lizard is the enemy, if the player is caught, the game ends.
 * 
 * @author Nick Bowley and Piers Watson
 * Version 4
 */ 
public class Lizard extends Actor
{   
    
    Color[] colors = { Color.ORANGE, Color.RED };
    int colorNum = 0;
    int counter = 1;

    int anim = 1;

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {


        anim -= 1;
        //Derek, if you're reading this, the numbers seen in the next two 'if' statements are just how many game ticks it takes to switch images. 
        //I'm not defining more than one integer for that.
        if(anim == 0)
        {
            this.setImage("Lizard2.png");
            anim = 40;
        } 
        if (anim <= 20)
        {
            this.setImage("Lizard1.png");
        }

        goTo();
        checkPlayerCollision();

        
    
    } 
    
    //the below method makes the lizard follow the player. It has been slowed down as the game was too tricky to win easily.
     public void goTo()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        int PlayerX = player.getX();
        int PlayerY = player.getY();
        turnTowards(PlayerX,PlayerY);
        move(1);
        
        
    }
    
    
    //the below method removes the player if it is caught by the lizard and stops the game. "update Image" is the game over screen.
    public void checkPlayerCollision()
    {

          if(isTouching(Player.class))
        {
            removeTouching(Player.class);
            updateImage();
            Greenfoot.stop();

        }

            
    }
    

     public void updateImage()
    {
        setRotation(0);
        setImage(new GreenfootImage("GAME\nOVER", 96, colors [colorNum], new Color(0, 0, 0, 0)));
        new Color(0, 0, 0, 0);
    }



}
