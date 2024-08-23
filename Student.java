//import java.util.*;
public class Student {
    int rno,m1,m2,m3;
    String name;
    Student(String name, int rno, int m1,int m2,int m3) {
        this.name = name;
        this.rno = rno;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    class Result {
        int total;
        float per;
        Result() {
            this.total = m1 + m2 + m3;
            this.per = total / 300.0f * 100.0f;
        }
        public void display() {
            System.out.println("rno: " + rno);
            System.out.println("name: " + name);
            System.out.println("m1: " + m1);
            System.out.println("m2: " + m2);
            System.out.println("m3: " + m3);
            System.out.println("total: " + this.total);
            System.out.println("per: " + this.per);
        }
    }
    public static void main(String[] args) {
        Student s = new Student("harsh",3,70,70,70);
        Student.Result a = s.new Result();
        a.display();
    }
}
