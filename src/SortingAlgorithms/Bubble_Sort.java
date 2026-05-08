package SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble_Sort {

  public   static void bubble(int[]arr){
      boolean swapped;
        // outer loop for the passes
        for (int i = 0; i < arr.length; i++) {
            swapped =false;
            // for each step , max item will come on last step
            for (int j = 1; j < arr.length - i; j++) { // arr.lenth - i
                // swaps the number
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if no swapped happen then break the loop
            if (!swapped){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }



}
