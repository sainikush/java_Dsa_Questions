import java.util.Arrays;

public class BinaryLeetCodePratice {

    // leet code Problem 744
    // find the smallest letter greater than target
    public static char greatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end){// made mistake not put = , and gives c for target value d which is wrong
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid -1;
            } else if (target > letters[mid]){
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }

    // leet code 34
    // find first and last element in a sorted array
    // arr = [2,3,4,4,5,5,5,5,6,8,9]
    // target = 5
    // answers should be = [4,7]
    public static int SearchIndex(int[] arr, int target, boolean SearchStartIndex) { // helper function
        int ans = -1; // dfault ans
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {// made mistake here if not put = sign then it gives [5,6] as output
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (SearchStartIndex) { // checks if SearchStartIndex == true
                    // checks whehter there is the value other than mid
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static int[] Range_In_Window(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = SearchIndex(arr,target,true);
        int end = SearchIndex(arr,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // Amazon Interview Questions:
    //    Searching in a Infinite Sorted Array..
    // We cant use arr.length -1;
    //
    public static int infinite_Search(int[]arr, int target,int start,int end){

        int ans =-1;
        while (start <= end){
            int mid = start + (end -start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return ans;
    }
public static int Start_End(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > end){
            int Newstart = end + 1;
            end = end + (end - start)*2;// doubling the window size after every iteration
            start = Newstart;
        }
        return infinite_Search(arr,target,start,end);
}

// leetCode 162,852;
    public static int PeakIndex(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }


    public static void main(String[] args) {
        char[] letters ={'c','f','j'};
        char target = 'd';
        System.out.println(greatestLetter(letters,target));

        int[] arr = {2,3,4,4,5,5,5,5,6,8,9};
        int target1 = 5;
        System.out.println(Arrays.toString(Range_In_Window(arr,target1)));

        int[] arr2 = {2,3,4,4,5,5,5,5,6,8,9,10,11,12,13,15,16,17,20,25,30,81};
        int target3 = 8;
        System.out.println(Start_End(arr2,target3));

        int[] arr3  = {1,2,3,4,5,6,7,8,5,4,3,1,0};
        int result = PeakIndex(arr3);
        System.out.println(result);
    }

}
