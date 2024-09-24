// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class GameWonWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class GameWonWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(600, 400, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        showText("winner", 260, 260);
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont(String messge, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLUE);
        bg.drawString(messge, x, y);
        showTextWithBigBlackFont("winner", 180, 200);
    }
}
