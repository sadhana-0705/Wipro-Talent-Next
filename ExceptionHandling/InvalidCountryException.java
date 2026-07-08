// Step 1 & 2: User defined exception class with overloaded constructors
class InvalidCountryException extends Exception {
    
    // Constructor 1: Default No-Argument Constructor
    public InvalidCountryException() {
        super();
    }

    // Constructor 2: Overloaded Parameterized Message Constructor
    public InvalidCountryException(String message) {
        super(message);
    }
}
