// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverworld extends World
{

    /**
     * Constructor for objects of class GameOverworld.
     */
    public GameOverworld()
    {
        super(600, 400, 1);
        showText("loser", 260, 260);
    }

    /**
     * 
     */
    public void showTextwithBigblackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
        showTextwithBigblackFont("loser ", 180, 200);
    }
}
