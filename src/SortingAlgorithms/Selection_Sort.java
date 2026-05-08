package SortingAlgorithms;

import java.util.Arrays;

public class Selection_Sort {
 public static void selection(int[]arr){
     for (int i = 0; i < arr.length; i++) {
         int last = arr.length - i - 1;
         int maxIndex = maxIndex(arr,0,last);
          Swap(arr,maxIndex,last);
     }
 }

    private static int maxIndex(int[] arr, int start, int end) {
     int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static  int Swap(int[]arr, int first,int second){
     int temp = arr[first];
     arr[first] = arr[second];
     arr[second] = temp;
     return temp;
    }

    public static void main(String[] args) {
        int[]arr = {4,5,1,3,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

}
