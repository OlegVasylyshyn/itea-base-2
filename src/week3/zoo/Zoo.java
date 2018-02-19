package week3.zoo;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Cat", "Murzik",
                3, "Black");

        cat = new Cat("Cat", "Murzik",
                3, "Black");

        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.getColor());


        System.out.println("Amount of cats - " + Cat.count);

        // abstraction
        Animal animal = new Cat();
        Dog dog = new Dog();

        feeding(cat);
        feeding(animal);
        feeding(dog);

        System.out.println(cat);
    }

    private static void feeding(Animal animal){
        // polymorphism
        animal.feed();
    }

}
