package Sapthagiri1;
abstract class Shape12 {
    abstract double area();
}
class Circle12 extends Shape12 {
    double radius;
    Circle12(double r) {
        radius = r;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle12 extends Shape12 {
    double length, width;
    Rectangle12(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
}
public class Main1 {
    public static void main(String[] args) {
        Circle12 c = new Circle12(5);
        Rectangle12 r = new Rectangle12(4, 6);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}