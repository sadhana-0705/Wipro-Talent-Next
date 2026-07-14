import java.util.ArrayList;
import java.util.List;

// Define the Student class
class Student {
    private int rollNo;
    private String name;
    private int mark;

    // Parameterized constructor to initialize properties
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{RollNo=" + rollNo + ", Name='" + name + "', Mark=" + mark + "}";
    }
}

public class StreamFilterStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // 1. Add five Student objects into an ArrayList
        students.add(new Student(1, "John", 45));
        students.add(new Student(2, "Sarah", 78));
        students.add(new Student(3, "David", 50));
        students.add(new Student(4, "Emma", 32));
        students.add(new Student(5, "Michael", 85));

        // 2. Filter students who cleared the test with minimum 50 marks
        System.out.println("Students who cleared the test (>= 50 marks):");
        students.stream()
                .filter(std -> std.getMark() >= 50)
                .forEach(System.out::println);

        // 3. Get the count of how many have cleared and print it
        long passedCount = students.stream()
                .filter(std -> std.getMark() >= 50)
                .count();

        System.out.println("\nTotal count of students who cleared: " + passedCount);
    }
}
