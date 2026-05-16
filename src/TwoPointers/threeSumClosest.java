package TwoPointers;

import java.util.Arrays;

public class threeSumClosest {
    public static int ClosetSum (int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int mindiff = Integer.MAX_VALUE;
        int resultSum = 0;

        for (int i = 0; i < n-2 ; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right){
                int currSum = arr[i] + arr[left] + arr[right];
                int currDiff = Math.abs(currSum -  target);

//                if (currSum < mindiff){
//                    mindiff = currDiff;
//                    resultSum = currSum;
//                }

                if (currDiff < mindiff) {
                    mindiff = currDiff;  // Update the record for "closest distance"
                    resultSum = currSum; // Save the sum that gave us this record
                }

                if (currSum < target){
                    left++;
                } else if (currSum > target) {
                    right--;
                }else {
                    return currSum;
                }
            }
        }
        return resultSum;
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
       int result =  ClosetSum(arr,target);
        System.out.println(result);

    }
}
