class Data {
    int a,b;
    Data() {
        this.a = 0;
        this.b = 0;
    }
    Data(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Data(Data d) {
        this.a = d.a;
        this.b = d.b;
    }
    void display() {
        System.out.print(this.a + " " +this.b);
    }
}
class CopyC {
    public static void main(String[] args) {
        Data d1 = new Data(2,3);
        Data d2 = new Data(d1);
        System.out.print("object d1: ");
        d1.display();
        System.out.print("object d2: ");
        d2.display();
    }
}