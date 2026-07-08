// 1. Parent Class
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// 2. Child Class inheriting from Animal
class Bird extends Animal {
    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println("Bird is pecking at seeds to eat...");
    }

    // Overriding the sleep method
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping safely in its nest...");
    }

    // New method unique to Bird
    public void fly() {
        System.out.println("Bird is soaring through the sky!");
    }
}

// 3. Main Testing Class
public class TestAnimals {
    public static void main(String[] args) {
        System.out.println("--- Testing Animal Instance ---");
        Animal genericAnimal = new Animal();
        genericAnimal.eat();
        genericAnimal.sleep();

        System.out.println("\n--- Testing Bird Instance ---");
        Bird smallBird = new Bird();
        smallBird.eat();    // Invokes overridden method
        smallBird.sleep();  // Invokes overridden method
        smallBird.fly();    // Invokes unique child method
    }
}
