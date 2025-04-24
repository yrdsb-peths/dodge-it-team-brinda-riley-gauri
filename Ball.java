import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends Actor
{
    public void act()
    {
        move(-10);
        
        if (getX() <= 0) {
            resetBall();
        }
    }
    
    public void resetBall()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100); 
        } else {
            setLocation(600, 300);
        }
    }
}
