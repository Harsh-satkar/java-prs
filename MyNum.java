public class MyNum {
    private int data;
    MyNum() {
        this.data = 0;
    }
    MyNum(int data) {
        this.data = data;
    }
    public void isNegative() {
        if(this.data < 0) {
            System.out.print("negative");
        } else {
            System.out.print("not negative");
        }
    }
    public void isPositive() {
        if(this.data > 0) {
        System.out.print("positive");
        } else {
            System.out.print("not positive");
        }
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        MyNum n = new MyNum(a);
        n.isNegative();
        n.isPositive();
    }
}
