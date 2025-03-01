import java.util.*;

public class Inheritance {
    
    // Define Animal as a static inner class
    static class Animal{
        void cat()
        {
            System.out.println("cat says meow");
        }
    }
    
    // Define Birds as a static inner class
    static class Birds extends Animal{
        void parrot()
        {
           System.out.println("parrot has cute red beak");
        }
    
    }
    
    public static void main(String args[])
    {
        Birds myobj = new Birds();
        myobj.cat();
        myobj.parrot();
    }

}