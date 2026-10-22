package Oops;

public class Oops1 {
    public static void main(String[] args) {
        System.out.println("hell");

        // Parameterised constructor
        Student A = new Student(1,14,"rahull",3);
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.nos);

        // copy constructor
        Student B = new Student(A);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.nos);
        B.sleep();
    }
}
