package ThirdTime.Array;

public class ArrayBasics {
    public static void main(String[] args) {
// Sum of Elements
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum is : "+ sum);

        // Product of Elements
        int[] arr1 = {2, 3, 10, 30};
        int ans = 1;
        for(int i = 0; i < arr.length; i++){
            ans *= arr[i];
        }
        System.out.println("Product is : "+ans);

        // Maximum Element
        int[] arr2 = {3, 2, -5, 21, 10};
        int maxval = arr2[0];
        for(int i = 0; i < arr2.length; i++){
            if(arr[i] > maxval){
                maxval = arr2[i];
            }
        }
        System.out.println("Maximum element : "+maxval);

        // Minimum element
        int[] arr3 = {3,2,-5,21,10};
        int minVal = arr3[0];
        for(int i = 0; i < arr.length; i++){
            if(arr3[i] < minVal){
                minVal = arr3[i];
            }
            System.out.println("Minimum element : "+ minVal);
        }
    }

}
