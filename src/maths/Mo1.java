package maths;

public class Mo1 {
    // print digits of the number
    static void printDigits(int num){
    while (num != 0){
        int digit = num%10;
        System.out.println(digit);
        num = num/10;
        }
    }

    // count digits of the number
    static int CountofDigits(int num){
        int count = 0;
        while (num != 0){
            int digit = num%10;
            count++;

            num = num/10;
        }
        return count;
    }

    // sum of the digits
    static int sumofDigits(int num){
        int sum = 0;
        while (num != 0){
            int digit = num%10;
            sum = sum + digit;

            num = num/10;
        }
        return sum;
    }
    // Reverse a number
    static int reverseNum(int num){
        int revNum = 0;

        while ( num != 0){
            int digit = num % 10;
            revNum = revNum*10 + digit;
            num = num / 10;

        }
        return revNum;
    }
    // Reverse a number
    static int re2verseNum(int num){
        int revNum = 0;

        while ( num != 0){
            int digit = num % 10;
            revNum = revNum*10 + digit;
            num = num / 10;

        }
        return revNum;
    }


     static void main(String[] args) {
//        int num = 5241544;
//         printDigits(num);
//         int ans = CountofDigits(num);
//         System.out.println("coutn of digit : "+ans);
//
//         int sum = sumofDigits(num);
//         System.out.println(sum);

         int num = 23434;
         int rwvnum = reverseNum(num);
         System.out.println(rwvnum);

    }
}
