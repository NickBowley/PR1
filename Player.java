import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;

/**
 * the Player class is the player's character. They can move and eat flies.
 * 
 * @author Nick Bowley 
 * @author Piers Watson
 * @version P.26/01/23
 */
public class Player extends Actor
{
    int fireFliesEaten = 0; 
    int flysEaten = 0;
    //since MyWorld is now in charge of keeping track of the player's score, these two variables are now redundant.

    int turnRate = 3;
    int turnRateEdge = 20;
    int jumpDistance = 100;
    int jumpDelay = 0;

//the below removes the flies and fireflies once tshey are eaten. As commenteed above, the variables for keeping score are now included the the MyWorld 
//class.
        public void checkCollision()
    {

        if(isTouching(Firefly.class))

        {
            removeTouching(Firefly.class);

            MyWorld mw = (MyWorld)getWorld();
            fireFliesEaten +=2;
            mw.increaseScore(2);

        }

        if(isTouching(Fly.class))
        {

            removeTouching(Fly.class);

            flysEaten +=1;

            MyWorld mw = (MyWorld)getWorld();
            mw.increaseScore(+1);

        }  

    }

    public void act()
    {
        checkCollision();

        //this if condition allows the jump delay to tick down. It also helpfully shows the 'jumping' image when the player cannot jump yet.
        if(jumpDelay > 0)
        {
            --jumpDelay;

            if(jumpDelay >= 1)
            {
                this.setImage("Frog2.png");

            } else {
                this.setImage("Frog1.png");
            }
        }

        //this one allows the player to 'jump' if the delay is zero.
        if(Greenfoot.isKeyDown("up") & (jumpDelay==0))
        {
            move(jumpDistance);
            jumpDelay = 20;
        }

        //this one is here to force the player to turn around at the edge.
        if (isAtEdge())
        {
            turn(turnRateEdge);
        }

        //then here we have the controls for turning left and right.
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-turnRate);
        }
        
        if (Greenfoot.isKeyDown("right"))   
        {
            turn(turnRate);
        }
        
    }


    } 
