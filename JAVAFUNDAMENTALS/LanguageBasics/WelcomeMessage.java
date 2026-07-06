public class WelcomeMessage {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Error: Please provide a name argument.");
            return;
        }
        
        String name = args[0];
        
        System.out.println("Welcome " + name);
    }
}