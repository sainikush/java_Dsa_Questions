package ThirdTime.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayManupulation {


    // Reverse an Array
    public static void Reverse(int[] arr){
      int i = 0;
      int j = arr.length - 1;

      while (i <= j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
      }

    }


   // Right shift the value by 1 position
    public static void Shift(int[] arr){
        int n = arr.length;
        int temp = arr[n -1];

        for(int i = n -1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    // Print extreme elements in an Array
    public static void Extreme(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n - 1;

       while (i <= j) {
           if(i == j){
               System.out.println(arr[i]);
               return;
           }else {
               System.out.println(arr[i]);
               i++;
               System.out.println(arr[j]);
               j--;
           }
       }
    }

    // find the mode of Array



    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,9,10,11,3};
       Reverse(arr);
        System.out.println("Reverse array :"+Arrays.toString(arr));
        Shift(arr);
        System.out.println("Shift element by one 1 :"+Arrays.toString((arr)));
        Extreme(arr);
        System.out.println("Extreme elements in Array " + Arrays.toString(arr));

    }

}
