public class Abstract {
    public static void main(String[] args) {

      //Bird b1 = new Animall();
      //This is wrong.Object of Abstract class cannot be created

        Bird b1 = new Bird();  // This object created by Bird class
        b1.MakeSound();
        b1.eat();
        b1.Fly();


        Animall b2 = new Bird(); // This Object created by abstract class
        b2.MakeSound();
        b2.eat();
      //b2.Fly(); This is wrong. Fly method in only subclass. This object not use subclass


    }
}

abstract class Animall
{
    public abstract void MakeSound();

    public void eat()
    {
        System.out.println("Animals eating");
    }
}

class Bird extends Animall
{
    @Override
    public void MakeSound() // We must be use abstract method in subclass
    {
        System.out.println("Chik");
    }

    public void Fly()
    {
        System.out.println("Bird is Flying");
    }
}