package TwoPointers;

import java.util.Arrays;

public class TripletswithSmallerSum {

    public static int tripletsSum(int[] arr, int sum) {
        Arrays.sort(arr);
        int n = arr.length;
        int   ans = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;


            while (left < right) {
                int curSum = arr[i] + arr[left] + arr[right];

                if (curSum >= sum) {
                    right--;
                } else if (curSum < sum) {
                    ans = ans + (right - left);
                    left++;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 3};
        int sum = 2;
       int result =  tripletsSum(arr,sum);
        System.out.println(result);
    }

}
