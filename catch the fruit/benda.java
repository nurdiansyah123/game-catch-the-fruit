import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class benda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class benda extends Actor
{
    /**
     * Act - do whatever the benda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public boolean atWorldEdge()
    {
         if(getX() < 10 || getX() > getWorld().getWidth() - 10)
         return true;
         if(getY() < 10 || getY() > getWorld().getHeight() - 10)
         return true;
         else
         return false;
     }
    
     /**
     * true bila kita dapat melihat objek 'clss' class dari Object
     * false bila tidak ada object
     */
    public boolean canSee(Class clss)
     {
         Actor actor = getOneObjectAtOffset(0, 0, clss);
         return actor != null;
     }  
    
    /**
     * Method untuk memakan objek dari kelas 'clss'. Method 'eat' akan dilakukan bila
     * objek yang dimaksud ada. Selain objek tersebut, method tidak dilakukan
     */
     public void eat(Class clss)
     {
         Actor actor = getOneObjectAtOffset(0, 0, clss);
         if(actor != null) 
         {
             getWorld().removeObject(actor);
         }
   
    }
     //public void act() 
   // {
        // Add your action code here.
    //}    
}
