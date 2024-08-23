import java.util.*;
public class Books {
    String name;
    int qty;
    Books() {
        this.name = "book";
        this.qty = 0;
    }
    Books(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }
    public static int search(Books[] bk,String name) {
        for(int i = 0 ; i < bk.length; i++) {
            if(name == bk[i].name) {
                return bk[i].qty;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Books[] b = new Books[n];
        for(int i = 0 ; i < n; i++) {
            String name;
            int qty;
            System.out.print("enter book name: ");
            name = sc.next();
            System.out.print("enter quantity: ");
            qty = sc.nextInt();
            b[i] = new Books(name, qty);
        }
        System.out.print(search(b,"six"));
        sc.close();
    }
}
