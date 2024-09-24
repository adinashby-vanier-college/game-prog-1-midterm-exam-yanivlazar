import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pigWorld here.
 * 
 * @author (yan) 
 * @version (a version number or a date)
 */
public class pigWorld extends World
{

    /**
     * Constructor for objects of class pigWorld.
     * 
     */
    public pigWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger = new Burger();
        addObject(burger,99,94);
        Burger burger2 = new Burger();
        addObject(burger2,161,149);
        burger.setLocation(107,97);
        burger2.setLocation(150,133);
        burger.setLocation(100,91);
        Burger burger3 = new Burger();
        addObject(burger3,512,97);
        Burger burger4 = new Burger();
        addObject(burger4,464,150);
        Burger burger5 = new Burger();
        addObject(burger5,98,333);
        Burger burger6 = new Burger();
        addObject(burger6,149,394);
        burger5.setLocation(80,326);
        burger6.setLocation(156,368);
        Pig pig = new Pig();
        addObject(pig,272,269);
        pig.setLocation(268,276);
        pig.setLocation(160,211);
        burger2.setLocation(140,150);
        burger.setLocation(28,25);
        burger2.setLocation(80,82);
        pig.setLocation(159,206);
        Snake snake = new Snake();
        addObject(snake,507,330);
        snake.setLocation(509,335);
    }
}
