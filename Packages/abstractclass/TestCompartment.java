import java.util.Random;

// 1. Abstract Base Class
abstract class Compartment {
    // Abstract function signature as requested
    public abstract String notice();
}

// 2. Subclass: FirstClass
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class: Executive seating. Silence requested.";
    }
}

// 3. Subclass: Ladies
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Class: Reserved exclusively for female passengers.";
    }
}

// 4. Subclass: General
class General extends Compartment {
    @Override
    public String notice() {
        return "General Class: Open public seating. Unreserved.";
    }
}

// 5. Subclass: Luggage
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Class: Heavy baggage storage only. Passengers prohibited.";
    }
}

// 6. Test Class with Main Function
public class TestCompartment {
    public static void main(String[] args) {
        // Declare an array of Compartment of size 10
        Compartment[] trainCoaches = new Compartment[10];
        Random rand = new Random();

        // Populate array with random compartments using random numbers from 1 to 4
        for (int i = 0; i < trainCoaches.length; i++) {
            // rand.nextInt(4) gives 0-3, adding 1 gives 1-4
            int randomType = rand.nextInt(4) + 1; 

            switch (randomType) {
                case 1:
                    trainCoaches[i] = new FirstClass();
                    break;
                case 2:
                    trainCoaches[i] = new Ladies();
                    break;
                case 3:
                    trainCoaches[i] = new General();
                    break;
                case 4:
                    trainCoaches[i] = new Luggage();
                    break;
            }
        }

        // Check the polymorphic behavior by iterating and calling the notice method
        System.out.println("=== Train Composition Notices ===");
        for (int i = 0; i < trainCoaches.length; i++) {
            System.out.println("Coach " + (i + 1) + " -> " + trainCoaches[i].notice());
        }
    }
}
