package ThirdTime.Array;

import java.util.Arrays;

public class ArrayLeetCode {
    // two sum : 481
    public static int[] TwoSum(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i< n -1; i++){
            for (int j = i + 1; j <n ; j++) {
                if(arr[i] + arr[j] == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int[] ans1 = {};
        return ans1;
    }

    // leet code 15 Three Sum

    public static void main(String[] args) {
        // two sum
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ints = TwoSum(arr, target);
        System.out.println("Two sum index values :"+ Arrays.toString(ints) );

    }
}
