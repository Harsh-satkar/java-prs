import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(1); 
        ls.add(2); 
        ls.add(3); 
        ls.add(4); 
        ls.add(5); 
        for(int i = ls.size()-1; i >= 0; i--) {
            System.out.println(ls.get(i));
        }
    }
}
