package Oops;

public class Student {
    public int id;
    public int age;
    public String name;
    public int nos;

// default constructor // attr -> garbage
//    public Student(){
//        System.out.println(" Srudent defalt constructot");
//    }

    // Parameterised constructor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student paramterised constructor");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }
    // Copy Constructor
    public Student(Student src_obj){// src_obj-> A
        System.out.println("Student copy  constructor");
        this.id = src_obj.id;
        this.age = src_obj.age;
        this.name = src_obj.name;
        this.nos = src_obj.nos;
    }


    // methods / behaviour

    public void study (){
        System.out.println(name + "Studing");
    }
    public void sleep(){
        System.out.println(name + "Sleeping");
    }
}
