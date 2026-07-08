// 1. Base Class
class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    // Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe eating the fruit
    public void eat() {
        System.out.println("Eating fruit: " + name + ". It tastes " + taste + ".");
    }
}

// 2. Apple Subclass
class Apple extends Fruit {
    // Constructor passing default values for Apple
    public Apple(String size) {
        super("Apple", "sweet and crisp", size);
    }

    // Overriding the eat method to represent Apple's specific taste
    @Override
    public void eat() {
        System.out.println("Biting into a crunchy " + size + " Apple. It tastes " + taste + "!");
    }
}

// 3. Orange Subclass
class Orange extends Fruit {
    // Constructor passing default values for Orange
    public Orange(String size) {
        super("Orange", "citrusy and tangy", size);
    }

    // Overriding the eat method to represent Orange's specific taste
    @Override
    public void eat() {
        System.out.println("Peeling a juicy " + size + " Orange. It tastes " + taste + "!");
    }
}

// 4. Main Testing Class
public class TestFruits {
    public static void main(String[] args) {
        // Create instances of Apple and Orange
        Fruit genericApple = new Apple("medium");
        Fruit genericOrange = new Orange("large");

        // Invoke overridden eat methods
        System.out.println("--- Testing Overridden Methods ---");
        genericApple.eat();
        genericOrange.eat();
    }
}
