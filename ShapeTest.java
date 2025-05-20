interface Shape {
    void draw();      // Abstract method
    double area();    // Abstract method
}

class Circle implements Shape {
    double radius = 5;

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length = 4, width = 3;

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        System.out.println("Area: " + s1.area());

        s2.draw();
        System.out.println("Area: " + s2.area());
    }
}
