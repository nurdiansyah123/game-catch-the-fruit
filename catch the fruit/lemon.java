import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lemon extends benda
{
    /**
     * Act - do whatever the lemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+6); //posisi objek banana, kecepatan banana = +6
        LemonFall(); //lakukan method BananaFall
    } 
    
    public void  LemonFall() //method BananaFall
     {
         if (atWorldEdge()) //jika objek banana berada di bawah world
         {
             getWorld().removeObject(this); // remove objek banana
             Greenfoot.playSound("lemonfall.wav"); // mainkan sound bananafall.wav
         }
     }
}
