import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;

/**
 * Write a description of class Obj1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obj2 extends Numberobjects
{ 
    int number;
    /**
     * Act - do whatever the Obj1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Obj2(int number)
    { 
        this.number=number;
        GreenfootImage img1=new GreenfootImage(30,30);
        img1.setFont(new java.awt.Font("Forte", Font.PLAIN, 25));
        img1.drawString(Integer.toString(number),2,20);
        setImage(img1);
 
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    public int getNumber()
    {
        return number;
    }
}
