package SlidingWindow;

public class MinSizeSubArray {
    //209. Minimum Size Subarray Sum

    //Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
    //
    //Example 1:
    //
    //Input: target = 7, nums = [2,3,1,2,4,3]
    //Output: 2
    //Explanation: The subarray [4,3] has the minimal length under the problem constraint.
    //Example 2:
    //
    //Input: target = 4, nums = [1,4,4]
    //Output: 1
    //Example 3:
    //
    //Input: target = 11, nums = [1,1,1,1,1,1,1,1]
    //Output: 0

    public static int minSubArray(int[]arr, int target){
        int low = 0;
        int high = 0;
        // always rembere : jab bhi apko kuch minimum return krno ho toh result ko max rkho
        // agr apka result Min ho toh matlab apko max return krna h

        int result = Integer.MAX_VALUE;
        int sum = 0;

        while (high < arr.length){
            sum = sum + arr[high];
            while (sum >= target){
                int length = high - low + 1;
                result = Math.min(result,length);
                sum = sum - arr[low];
                low++;
            }
            high++;
        }
        return result == Integer.MAX_VALUE ? 0: result;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4};
        int target = 7;
        int result = minSubArray(arr,target);
        System.out.println(result);

    }
}
