import java.util.*;
public class Fact {
    public static int fact(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num to find factorial: ");
        int n = sc.nextInt();
        System.out.println("fact: " + fact(n));
        sc.close();
    }
}
