public class Lineaar_Search {
    // code
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    public static int linear_search(int[] arrr, int target){
        if(arrr.length == 0){
            return -1;
        }

        // run the loop
        for (int i = 0; i < arrr.length; i++) {
            int element = arrr[i];
            if(element == target){
                return i;
            }
        }
        // hence will execute if the none of the above statement get execute
        // hence the target not found
        return -1;
    }

    // search the target and return the element
    public static int linear_SEarch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run the Advanced loop
        for (int element : arr) {
            if (element== target){
                return element;
            }
        }
        return -1;
    }

    // search the target and return true or false
    public static boolean linear_Search3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
//    Linear Search (also called sequential search) is a method of finding a target value within a list by checking each element
//    one by one until the desired element is found or the list ends.
//   - Works on unsorted arrays/lists.
//   - Time complexity: O(n) (worst case, you may check all elements).
//   - Space complexity: O(1) (no extra memory needed).

        // calling the linear search
        int[] arr = {10,23,34,35,45,47,50,67};
        int target = -1;
        int ans = linear_search(arr,target);
        System.out.println(ans);
       boolean ans1 =  linear_Search3(arr,target);
        System.out.println(ans1);
    }
}
