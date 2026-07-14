import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

// Reuse the Employee class structure from Assignment 2
class VectorEmployee {
    int id;
    String name;

    public VectorEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

public class VectorTraversal {
    public static void main(String[] args) {
        // Create a Vector that stores Employee objects
        Vector<VectorEmployee> empVector = new Vector<>();

        // Add employee data
        empVector.add(new VectorEmployee(201, "John Doe"));
        empVector.add(new VectorEmployee(202, "Jane Doe"));
        empVector.add(new VectorEmployee(203, "Mark Evans"));

        // 1. Traverse and print using Iterator
        System.out.println("--- Listing Elements using Iterator ---");
        Iterator<VectorEmployee> it = empVector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        // 2. Traverse and print using Enumeration
        System.out.println("--- Listing Elements using Enumeration ---");
        Enumeration<VectorEmployee> en = empVector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
