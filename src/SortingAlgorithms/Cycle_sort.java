package SortingAlgorithms;

import java.util.Arrays;

public class Cycle_sort {
    public static void Cycle_sort12(int[]arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }

        }
    }
    public static int swap(int[]arr, int first,int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        Cycle_sort12(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------");
    }

}
