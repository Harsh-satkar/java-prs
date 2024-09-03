import java.util.*;
public class Emp {
    String name;
    Emp(String name) {
        this.name = name;
    }
    static void sort(Emp[] ob) {
        ArrayList<String> names = new ArrayList<>();
        for (Emp e : ob) {
            names.add(e.name);
        }
        Collections.sort(names);
        System.err.println(names);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp[] e = new Emp[4];
        for(int i = 0; i < 4; i++) {
            String n = sc.next();
            e[i] = new Emp(n);
        }
        sort(e);
        sc.close();
    }
}
