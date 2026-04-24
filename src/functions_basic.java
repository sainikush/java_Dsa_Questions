public class functions_basic {
    public static int factorial(int n ){
        int f = 1;
        for (int i = 1; i <= n ; i++) {
            f = f*i;
        }
        return f;
    }

    // to print the binomial functions
       public static int bino_coeff(int a, int r){
        int bino_n = factorial(a);
        int bino_r = factorial(r);
        int bino_nmr = factorial(a-r);

        int bino_coeff = bino_n / (bino_r*bino_nmr);
        return bino_coeff;
       }
       // to check if a number is prime or not
    public static boolean is_prime(int b){
        boolean isPrime = true;
        for (int i = 2; i<= b-1;i++){
            if (b%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // Optimised  Approach : to check if the no is Prime or not.
    public static boolean Opti_isPrime(int n){
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
// to Print the ranges of Prime no
    public static void primeInRange(int n){
        for (int i = 2; i <=n ; i++) {
            if (Opti_isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    // convert binary to decimal
    public static void BintoDec(int n){
        int Binnum= n;
        int pow = 0;
        int decNum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            n = n/10;
        }
        System.out.println("decimal of "+ Binnum + "="+decNum);
    }

    // convert decimal to binary
    public static void Dec_to_Bin(int n){
        int Dec_NO  = n;
        int pow = 0;
        int Bin_Num  = 0;
        while (n > 0) {
            int reminder_no = n % 2;
            Bin_Num = Bin_Num + (reminder_no * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary of"+Dec_NO+ "="+Bin_Num);
    }

    public static void main(String[] args) {
        System.out.println("factorial is :"+factorial(5));
        System.out.println("Binomial_factorial is :" + bino_coeff(7,5));
        System.out.println("isPrime :"+ is_prime(56));
        System.out.println("Optimized isPrime :"+ Opti_isPrime(3));
       primeInRange(29);
       BintoDec(101);
       Dec_to_Bin(10);

    }
}
