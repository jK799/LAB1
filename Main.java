abstract class Shape {

    // Metoda wyświetlająca nazwę klasy
    public void print() {
        System.out.println("Shape");
    }

    // Abstrakcyjna metoda do obliczenia pola figury
    public abstract double getArea();

    // Abstrakcyjna metoda do obliczenia obwodu figury
    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // Konstruktor klasy Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementacja metody getArea dla prostokąta
    @Override
    public double getArea() {
        return width * height;
    }

    // Implementacja metody getPerimeter dla prostokąta
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Nadpisanie metody print dla klasy Rectangle
    @Override
    public void print() {
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape {
    private double a, b, c;

    // Konstruktor klasy Triangle
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Implementacja metody getArea dla trójkąta (wzór Herona)
    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Implementacja metody getPerimeter dla trójkąta
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    // Nadpisanie metody print dla klasy Triangle
    @Override
    public void print() {
        System.out.println("Triangle");
    }
}


class ShapeDescriber {

    // Metoda opisująca pole i obwód figury oraz wyświetlająca jej nazwę
    public void describe(Shape shape) {
        shape.print(); // Wyświetla nazwę figury
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów Rectangle i Triangle
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(3, 4, 5);

        // Tworzenie obiektu ShapeDescriber
        ShapeDescriber describer = new ShapeDescriber();

        // Opisanie prostokąta
        System.out.println("Rectangle:");
        describer.describe(rectangle);

        // Opisanie trójkąta
        System.out.println("\nTriangle:");
        describer.describe(triangle);
    }
}
