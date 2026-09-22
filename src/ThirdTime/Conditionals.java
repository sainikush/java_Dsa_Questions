package ThirdTime;

import java.util.Scanner;

public class Conditionals {




    public static void main(String[] args) {
    // Syntax for loops
    //     for (intializtion , condition , increament/ decrement)      {
    // body

    // print no from 1 to 5
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }


        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
        }


    }

}
