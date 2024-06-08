public class Polymorphism {
    public static void main(String[] args) {
        Animal animal =new Animal();
        animal.Sounds();

        Dog dog = new Dog();
        dog.Sounds();

        Cat cat = new Cat();
        cat.Sounds();
    }
}

class Animal {
    void Sounds()
    {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal{
    @Override// Change Sounds method with Override for Dog Class
    void Sounds()
    {
        System.out.println("Dog sounds");
    }
}
class Cat extends Animal{
    @Override // Change Sounds method with Override for Cat Class
    void Sounds()
    {
        System.out.println("Cat sounds");
    }
}
