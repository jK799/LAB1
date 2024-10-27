abstract class Shape {
    
    public void print() {
        System.out.println("Shape");
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void print() {
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        System.out.println("Triangle");
    }
}


class ShapeDescriber {

    public void describe(Shape shape) {
        shape.print(); // Wyświetla nazwę figury
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(3, 4, 5);

        ShapeDescriber describer = new ShapeDescriber();

        System.out.println("Rectangle:");
        describer.describe(rectangle);

        System.out.println("\nTriangle:");
        describer.describe(triangle);
    }
}
