import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        Lift lift = new Lift();
        addObject(lift, 600, 100);
    }
}
