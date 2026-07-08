import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Get the size of the array inside the try block
            System.out.println("Enter the number of elements in the array");
            String sizeInput = scanner.nextLine();
            int size = Integer.parseInt(sizeInput);
            
            int[] arr = new int[size];

            // 2. Get the individual elements of the array
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                String elementInput = scanner.nextLine();
                arr[i] = Integer.parseInt(elementInput);
            }

            // 3. Get the specific target retrieval index
            System.out.println("Enter the index of the array element you want to access");
            String indexInput = scanner.nextLine();
            int index = Integer.parseInt(indexInput);

            // 4. Access the element safely
            int element = arr[index];
            System.out.println("The array element at index " + index + " = " + element);
            System.out.println("The array element successfully accessed");

        } catch (NumberFormatException e) {
            // Triggers if ANY non-numeric value (like 'j') is entered at any stage
            System.out.println("java.lang.NumberFormatException");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Triggers if an unavailable array index address is requested
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }

        scanner.close();
    }
}
