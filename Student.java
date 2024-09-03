//import java.util.*;
public class Student {
    int rno;
    String name;
    static int cnt;
    Student(String name, int rno) {
        this.name = name;
        this.rno = rno;
        cnt++;
        display();
    }
    void display() {
        System.out.print("object " + cnt + "created");
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {
        Student s = new Student("harsh",3);
        System.out.print(s.name + s.rno);
    }
}
