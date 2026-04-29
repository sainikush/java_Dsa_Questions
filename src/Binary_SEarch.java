public class Binary_SEarch {
    // what is binary search
    //Binary Search is an efficient algorithm for finding an item from a sorted list of items.
    // It works by repeatedly dividing in half the portion of the list that could contain
    // the item until you've narrowed down the possible locations to just one.
public static int Binary_Search(int[] arr, int target){
    int start = 0;
    int end = arr.length -1;

    while( start <= end) {
        // find the middle
        int mid = start + (end - start)/2;
         if(target < arr[mid]){
             end = mid -1;
         } else if (target > arr[mid]) {
             start = mid + 1;
         } else {
             return mid;
         }
    }
    return -1;
}

// order : Agnostic Binary search : what if the arr is in descending order,,
    // then the code will fails.. So what  to do ???
    // check first and last element and compare them
    // if first > last Ascending order
    // else Decreasing order
    public static int Agnostic_Binary_Search(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;

    // find whether the arr is ascending or descending
        boolean isASC = arr[start] > arr[end];

        while (start <= end) {
            // find the middle
            int mid = start + (end - start)/2;

            if (target == arr[mid]){
                return mid;
            }

            if (isASC){
                if (target < arr[mid]){
                    end = mid - 1;
                }else {                 // if (target > arr[mid] )
                    start = mid + 1;
                }
            } else { // for Descending
                if (target < arr[mid]){
                    end = mid - 1;
                }else {        //  if (target > arr[mid])
                    start = mid + 1;
                }
            }
        }
        return -1;
    }





    public static void main(String[] args) {
    int[] arr = {-2,-1,0,2,4,6,8,13,14,15};
    int target = 6;
    int ans = Binary_Search(arr,target);
        System.out.println("Binary_Search"+ans);
        // Agnostic Binary sEarch
        int[] arr1 = {89,56,45,44,34,12,10,9,6,5,3,1};
        int target1 = 12;
        int ans1 = Agnostic_Binary_Search(arr1,target1);
        System.out.println("Agnostic_Binary_Search : "+ans1);

    }

}
