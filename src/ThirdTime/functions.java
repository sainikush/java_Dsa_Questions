package ThirdTime;

import java.util.Scanner;

public class functions {
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1 :");

        int num1 = sc.nextInt();
        System.out.println("enter no 2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum ="+sum);

    }
    public static void main(String[] args) {
sum();
    }
}
