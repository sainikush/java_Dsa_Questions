package ThirdTime;

import java.util.Scanner;

public class First_1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());
//    }

    public static void main(String[] args) {
        // Create Scanner instance wrapping Standard Input Stream
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your roll number: ");
        int rollNo = input.nextInt(); // Reads integer token from stream

        System.out.println("Your roll number is " + rollNo);

        input.close(); // Best practice: release underlying resources
    }
}
