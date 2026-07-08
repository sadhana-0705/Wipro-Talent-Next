import java.util.Optional;

public class OptionalCheck {
    public static void main(String[] args) {
        // Provided code snippet which creates an array filled with null values
        String names[] = new String[5]; 
        
        // Wrap the uninitialized element names[0] inside an Optional container
        Optional<String> checkName = Optional.ofNullable(names[0]);
        
        // Use isPresent() to safely verify if a value exists before finding its length
        if (checkName.isPresent()) {
            System.out.println("Length: " + checkName.get().length());
        } else {
            System.out.println("Value is not present. NullPointerException safely avoided!");
        }
    }
}
