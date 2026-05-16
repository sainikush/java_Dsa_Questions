package TwoPointers;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void sortColors(int[]arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n -1;

        while(mid <= high){
            if (arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static int swap(int[]arr, int first, int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;

        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
