import java.util.Scanner;

public class while_loops {
    // print numbers from 1 to 20
    public static void main(String[] args) {
//        int num = 0;
//        while(num <= 10){
//            System.out.println(num);
//            num++;
//        }
// print even numbers from  2 to 20
//        int num = 2;
//        while (num <= 20){
//            System.out.println(num);
//            num += 2;
//        }
        // print odd numbers from  1 to 19
//     int num = 1;
//     while (num <= 19){
//         System.out.println(num);
//         num += 2;
//     }
// print 1 to n
//        Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//
//         int count = 1;
//         while (count <= n){
//             System.out.println( count);
//             count++;
//         }

        // print sum of first n natural numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the no : ");
//       int n = sc.nextInt();
//        int sum = 0;
//        int count = 1;
//        while (count <= n){
//            sum += count;
//            count++;
//        }
//        System.out.println("sum is :"+ sum);

        // print reverse of 10 to 1
//        int n = 1;
//        int count = 10;
//        while(count >= n){
//            System.out.println(count);
//            count = count - n;
//        }

        // print the factorial of  numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number : ");
//        int n = sc.nextInt();
//        int fact = 1;
//        while (n > 0){
//            fact = fact*n;
//            n -= 1;
//        }
//        System.out.println(fact);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number : ");
//        int n = sc.nextInt();
//         while ( n > 0){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit + " ");
//             n = n/10;
//         }
//        System.out.println();

        // reverse the no

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0){
            int lastdigit = n % 10;
            rev = (rev*10) + lastdigit;
            n = n/10;
        }
        System.out.println(rev);


    }
}
