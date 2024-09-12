import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lift extends Actor
{
    public void act()
    {
        move(-3);
        if(getX() <= 0)
        {
            resetLift();
        }
        if(isTouching(Hero.class))
        {
            Circle circle = new Circle();
            getWorld().addObject(circle, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetLift()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600,100);
        }
        else
        {
            setLocation(600, 300);
        }
    }
}
