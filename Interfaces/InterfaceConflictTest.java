// 1. First Interface with default method
interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

// 2. Second Interface with conflicting default method
interface Fourwheeler {
    default void message() {
        System.out.println("Inside Fourwheeler");
    }
}

// 3. Class implementing both interfaces must resolve the conflict
class Car implements Vehicle, Fourwheeler {
    @Override
    public void message() {
        // Explicitly calling the message method of the Vehicle interface using super
        Vehicle.super.message();
    }
}

// 4. Execution class
public class InterfaceConflictTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        // Invoking the overridden method
        myCar.message(); 
        // Expected Output: Inside Vehicle
    }
}
