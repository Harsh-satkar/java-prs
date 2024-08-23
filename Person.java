import java.util.*;
public class Person {
    int id,age;
    String name, gender;

    Person() {
        this.id = 0;
        this.age = 0;
        this.name = "name";
        this.gender = "";
    }
    Person(int id, int age, String name, String gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void display() {
        System.out.println("pid: "+ this.id);
        System.out.println("age: " + this.age);
        System.out.println("name: " + this.name);
        System.out.println("gender: " + this.gender);
    }
    public static void main(String[] args) {
            Person p[] = new Person[5];
            Scanner sc = new Scanner(System.in);
            for(int i =0;i<5;i++) {
                System.out.println("enter person" + i + "details: ");
                System.out.println("enter id: ");
                int id = sc.nextInt();
                System.out.println("enter age: ");
                int age = sc.nextInt();
                System.out.println("enter name: ");
                String name = sc.next();
                System.out.println("enter gender: ");
                String gender = sc.next();
                p[i] = new Person(id,age,name,gender);
            }
            for(int i =0;i<5;i++) {
                System.out.println("details of person " + i + 1);
                p[i].display();
            }
            sc.close();
    }
}