package obj;

class Shape {
    void draw() {
        System.out.println("shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("square");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("triangle");
    }
}

public class overridingdemo {
    public static void main(String[] args) 
    {
    	Shape obj = new Shape();
        Circle obj1 = new Circle();
        Square obj2 = new Square();
        Shape obj3 = new Triangle();
        obj.draw();
        obj1.draw(); 
        obj2.draw(); 
        obj3.draw();
    }
}

