 abstract class Shape {
    final float Pi = 3.14f;
    abstract void calArea();
    abstract void calVolume();
}

class Sphere extends Shape {
    int r;
    Sphere() {}
    Sphere(int r) {
        this.r = r;
    }
    void calArea() {
        float area = 4 * Pi * r * r;
        System.out.println("area of sphere is " + area);
    }
    void calVolume() {
        float volume = 4/3 * Pi * r * r * r;
        System.out.println("volume of sphere is " + volume);
    }
}

class Cone extends Shape {
    int r,h;
    Cone() {}
    Cone(int r, int h) {
        this.r = r;
        this.h = h;
    }
    void calArea() {
        float area = Pi * r * (r + (float)Math.sqrt(h*h + r * r));
        System.out.print("area of cone " + area);
    }
    void calVolume() {
        float volume = Pi * r * r * (h/3);
        System.out.print("volume of cone " + volume);
    }
    public static void main(String[] args) {
        Shape s;
        s = new Sphere(4);
        s.calArea();
        s.calVolume();
        System.err.println();
        s = new Cone(4,6);
        s.calArea();
        s.calVolume();
    }
}
