import java.util.Scanner;
interface Integer {
    String check();
}
public class Num implements Integer{
    int n;
    Num() {}
    Num(int n) {
        this.n = n;
    }
    public String check() {
        if(this.n > 0) {
            return "positive";
        }
        return "negative";
    } 
    public static void main(String[] args) {
        Num n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to check negative or positive");
        int num = sc.nextInt();
        n = new Num(num);
        System.out.println("the number is " + n.check());
        sc.close();

    }
}
