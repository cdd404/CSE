package jo;

import mypack.Circle;

public class Eg {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}




package mypack;

public class Circle {
    public double r = 5.0;

    public void area() {
        System.out.println("Area of the Circle = " + (3.14 * r * r));
    }
}


package mypack;

class Rectangle {
    double l, b;

    void area() {
        System.out.println("Area of the circle = " + (l * b));
    }
}


package mypack;

class Square {
    double s;

    void area() {
        System.out.println("Area of the Square = " + (s * s));
    }
}
