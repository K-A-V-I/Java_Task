package inhertance;

class Shape {
    void display() {
        System.out.println("Shapess...");
    }

    double calculateArea() {
        return 0.0;  
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void display() {
        System.out.println("This is a rectangle.");
    }

    double calculateArea() {
        return length * width;
    }
}

class Square extends Rectangle {
    Square(double sidelength) {
        super(sidelength, sidelength);
    }

    void display() {
        System.out.println("This is a square.");
    }
}

public class multilv {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.display(); 
      
        Rectangle rectangle = new Rectangle(5,3);
        rectangle.display();  
        System.out.println("Area: " + rectangle.calculateArea());

        Square square = new Square(4.0);
        square.display();  
        System.out.println("Area: " + square.calculateArea());

    }
}

