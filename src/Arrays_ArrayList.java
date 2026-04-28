import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int[] arr = new  int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
////            System.out.print(arr[i]+" ");
//        }
//        System.out.println(Arrays.toString(arr));
// for each loop
//        for(int num : arr){// for every element in array , print the element
//          System.out.print(num+ " ");//here num, represent the element of an array
//
//        }

        // array of objects
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        System.out.println(Arrays.toString(arr));

        // array list
        ArrayList<Integer> list = new ArrayList<>(10);

    }
}
