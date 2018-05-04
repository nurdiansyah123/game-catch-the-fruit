import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pisang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pisang extends benda
{
    /**
     * Act - do whatever the pisang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+6); //posisi objek banana, kecepatan banana = +6
        pisangFall(); //lakukan method BananaFall
    } 
    
    public void  pisangFall() //method BananaFall
     {
         if (atWorldEdge()) //jika objek banana berada di bawah world
         {
             getWorld().removeObject(this); // remove objek banana
             Greenfoot.playSound("lemonfall.wav"); // mainkan sound bananafall.wav
         }
     }
}
