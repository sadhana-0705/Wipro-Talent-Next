import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        // Using Number as the upper bound constraint
        ArrayList<Number> numberList = new ArrayList<>();

        // Adding various numerical types
        numberList.add(10);        // Integer
        numberList.add(20.5f);     // Float
        numberList.add(3.14159);   // Double
        numberList.add(100L);      // Long

        // Compilation Error Example (Uncommenting this line will cause a syntax error)
        // numberList.add("Hello"); 

        System.out.println("Stored Numbers:");
        for (Number num : numberList) {
            System.out.println(num + " (Type: " + num.getClass().getSimpleName() + ")");
        }
    }
}
