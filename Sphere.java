 import java.util.Scanner;
 /**
  * Shape
  */
interface Shape {
    final float Pi = 3.14f;
    float calArea();
    
 }
 class Circle implements Shape{
    //final float Pi = 3.14f;
    float radius;
    Circle() {}
    Circle(float radius) {
        this.radius = radius;
    }
    public float calArea() {
        return Pi * this.radius * this.radius;
    }
}

public class Sphere extends Circle {
    int height; 
    Sphere() {super();}
    Sphere(float radius, int height) {
        super(radius);
        this.height = height;
    }
    public float calArea() {
        return 2 * Pi * radius * (radius + this.height);
    }
    public static void main(String[] args) {
        Circle c;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius: ");
        System.out.print("enter height: ");
        int h = sc.nextInt();
        float r = sc.nextFloat();
        c = new Circle(r);
        System.out.println("area of circle is: " + c.calArea());
        c = new Sphere(r, h);
        System.out.println("area of cylinder is: " + c.calArea());
        sc.close();
    }
}
