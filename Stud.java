import java.util.*;
public class Stud {
    int rollno;
    String name;
    float per;
    Stud(int rollno, String name, float per) {
        this.rollno = rollno;
        this.name = name;
        this.per = per;
    }
    public void display() {
        System.out.println("rollno: " + this.rollno);
        System.out.println("name: " + this.name.toString());
        System.out.println("per: " + this.per);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many students: ");
        int n = sc.nextInt();
        Stud[] s = new Stud[n];
        for(int i=0;i<n;i++) {
            System.out.print("enter student " + i + "details");
            int roll;
            float per;
            String name;
            System.out.print("rollno: ");
            roll = sc.nextInt();
            System.out.print("name: ");
            name = sc.next();
            System.out.print("percantage: ");
            per = sc.nextFloat();
            s[i] = new Stud(roll,name,per);
        } 
        for(int i=0;i<n;i++) {
            s[i].display();
            System.out.println();
        }
        sc.close();
    }
}
