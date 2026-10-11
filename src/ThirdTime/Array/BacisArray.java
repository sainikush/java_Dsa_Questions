package ThirdTime.Array;

import java.util.Arrays;

public class BacisArray {
    public static int Average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int size = arr.length;
        int average = sum/ size;

        return average;
    }
    // Multiply by 10

    public static int[] Multiply(int[] arr){
        int n = arr.length;
        int[] newArray = new int[n];

        for (int i = 0; i < n ; i++) {
            newArray[i] = arr[i] * 10;

        }
        return newArray;
    }

    // Search an element in an Array
    public static boolean Search(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]== target){
                return true;
            }
        }
        return false;
    }

    // Find the Maximum element in Array
    public static int Maximum(int [] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // find Sum of Positive and Negative Numbers
    public static int[] PositiveNegative(int [] arr){
        int posSum = 0;
        int negSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                posSum +=  arr[i];
            }else {
                negSum += arr[i];
            }
        }
        int[] ans = {posSum, negSum};
        return ans;
    }

    // Count the no. of zeros and Ones in Array
    public static int[] ZeroesOnes(int[] arr){
        int zero = 0;
        int one = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zero++;
            }else {
                one++;
            }
        }
        int[] ans = {zero, one};
        return ans;
    }
// find the first unsorted Array Element in Array
    public static int UnsortedElenent(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i + 1] <= arr[i]) {
                return arr[i+1];
            }

        }
        return -1;

    }



    public static void main(String[] args) {
        int[] arr = {2,3,-4,5,56,-6,-5, -3};
        int target = 88;
        System.out.println("Sum is :"+Average(arr)) ;
        System.out.println("Multiply is :"+ Arrays.toString(Multiply(arr))) ;
        System.out.println("Search is : "+ Search(arr,target));
        System.out.println("Maximum is : " + Maximum(arr));
        System.out.println("PositiveNegative : "+ Arrays.toString(PositiveNegative(arr)));
        System.out.println("Zeroes and Ones are : " + Arrays.toString((ZeroesOnes(arr))));
        System.out.println("First unSorted Element : "+ UnsortedElenent(arr));

    }
}
