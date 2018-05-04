import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom extends benda
{
    /**
     * Act - do whatever the bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(), getY()+5);
       meledak();
    }    
    
    public void meledak() //method meledak
    {
         if (canSee(kereta.class)) //bila melihat kelas kereta
         {
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(-1); //kelas Count dikurangi sebanyak 1 poin
             Greenfoot.playSound("bomb.wav"); //Mainkan sound boom.wav
         }
         
         if (atWorldEdge())  //bila objek berada di bawah world
         {
             getWorld().removeObject(this); //remove object
         }
    }
        
}
