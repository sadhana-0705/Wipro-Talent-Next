import java.util.ArrayList;
import java.util.Iterator;

public class StringListPrint {
    public static void main(String[] args) {
        // Create an ArrayList that restricts data to String only (Generics)
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Java");
        names.add("Python");
        names.add("C++");
        names.add("JavaScript");

        // Call the printall method
        printall(names);
    }

    // Method to print all elements using an Iterator
    public static void printall(ArrayList<String> list) {
        System.out.println("Elements in the list:");
        Iterator<String> it = list.iterator();
        
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }
}
