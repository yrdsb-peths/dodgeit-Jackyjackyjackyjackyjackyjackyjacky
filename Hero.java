import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    boolean moved = false;
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            moved = !moved;
        }
        
        if(moved)
        {
            setLocation(100, 300);
        }
        else
        {
            setLocation(100, 100);
        }
    }
}
