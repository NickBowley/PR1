import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Fly here.
 * 
 * @author Nick Bowley 
 * @author Piers Watson
 * @version 
 */
public class Fly extends Actor
{
    int anim = 1;

    /**
     * Act - The below method makes the flies move around the game randomly,
     * turing when they hit the egde of the screen.
     * 
     */



    public void act()

    { 
        move(2);
        anim -= 1;
        //Derek, if you're reading this, the numbers seen in the next two 'if' statements are just how many game ticks it takes to switch images. 
        //I'm not defining more than one integer for that.
        if(anim == 0)
        {
            this.setImage("Fly2.png");
            anim = 4;
        } 
        if (anim <=2)
        {
            this.setImage("Fly1.png");
        }

        if (Greenfoot.getRandomNumber(100) <10)

        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }

        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)

        {
            turn(180);
        }

        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)    
        {
            turn(180);
        }


    }
}
