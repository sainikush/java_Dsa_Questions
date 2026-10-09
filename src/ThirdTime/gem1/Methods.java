package ThirdTime.gem1;

public class Methods {


    public static void greet(String name){
        System.out.println("Hello " + name);
    }
    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void multiply(int a, int b){
        System.out.println(a*b);
    }

public static String greet1(String name){
        return "hello "+ name;
}

public static int add1(int a, int b){
        return a + b;
}

public static int mult(int a, int b){
        return a*b;
}
    public static void main(String[] args) {
     greet("Vivek");
     greet("Ayush");
     greet("Aman");
     add(4,50);
     multiply(4,5);

     String result = greet1("Vivek");
        System.out.println(result);
     int result1 = add1(4,50);
        System.out.println(result1);
        int result2 = mult(4,5);
        System.out.println(result2);

        int result3 = add1(mult(4,6),10);
        System.out.println(result3);

    }
}


