package SlidingWindow;

public class MaxsizeArray {

    //Max Sum Subarray of size K
    //Difficulty: EasyAccuracy: 49.6%Submissions: 283K+Points: 2
    //Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
    //
    //Note: A subarray is a contiguous part of any given array.
    //
    //Examples:
    //
    //Input: arr[] = [100, 200, 300, 400], k = 2
    //Output: 700
    //Explanation: arr2 + arr3 = 700, which is maximum.
    //Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
    //Output: 39
    //Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
    //Input: arr[] = [100, 200, 300, 400], k = 1
    //Output: 400
    //Explanation: arr3 = 400, which is maximum.

    public static int MaxSubArray1(int[]arr, int k){
        int low = 0;
        int high = k -1;
        int sum = 0;
        int result = 0;

        for (int i = low; i <= high ; i++) {
            sum = sum + arr[i];
        }
        while ( high < arr.length){
            result = Math.max(result,sum);
            low++;
            high++;

            if (high == arr.length){
                break;
            }
            sum = sum - arr[low - 1];

            sum = sum + arr[high];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        int result = MaxSubArray1(arr,k);
        System.out.println(result);
    }
}
