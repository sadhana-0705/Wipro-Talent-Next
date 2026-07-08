// 1. Base Class Shape
class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }
}

// 2. Circle Subclass
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

// 3. Triangle Subclass
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

// 4. Square Subclass
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

// 5. Main Testing Class
public class TestPolymorphism {
    public static void main(String[] args) {
        // Creating objects using runtime polymorphism as requested
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        System.out.println("--- Invoking Circle Methods ---");
        c.draw();
        c.erase();

        System.out.println("\n--- Invoking Triangle Methods ---");
        t.draw();
        t.erase();

        System.out.println("\n--- Invoking Square Methods ---");
        s.draw();
        s.erase();
    }
}
