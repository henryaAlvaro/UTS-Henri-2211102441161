import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeBody extends Block
{
    /**
     * Act - do whatever the SnakeBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SnakeBody()
    {
       GreenfootImage image = getImage();
       image.scale(20, 20);
       setImage(image);
    }  
    public void act()
    {
        
    }
}
