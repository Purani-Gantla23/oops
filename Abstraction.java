import java.util.*;
abstract class Animal
{
    abstract void makesound();
}
class Birds extends Animal
{
    void makesound()
    {
        System.out.println("Birds are nice");
    }
}
public class Abstraction {
    public static void main(String args[])
    {
        Animal b = new Birds();
        b.makesound();
    } 
    
}