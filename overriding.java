import java.util.*;
class Animal{
    void makesound(){
        System.out.println("Puppies are cute");

    }
}
class Birds extends Animal{
    void makesounds()
    {
        System.out.println("Birds Chirp");
    }
}
public class overriding
{
    public static void main(String args[])
    {
        Animal b = new Birds();
        b.makesound();
    }
}