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

     static void main(String[] args) {
        int num = 5241544;
         printDigits(num);
         int ans = CountofDigits(num);
         System.out.println(ans);

    }
}
