import java.util.Arrays;

public class BinaryQuestions {

    static int Ceiling_Number(int[] arr, int target){
        // return the index of the smallest  no >= target
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;
       while (start <= end){
       int mid = start + (end - start) / 2;
        if (target < arr[mid]){
             end = mid -1;
             } else if (target > arr[mid]) {
             start = mid + 1;
             }else {
            return mid;
        }
       }
        return start;
    }

    // floor of the number
    public static int Floor_Number(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return end;
    }

    // leet code 744 : Find the smallest letter Greater than target
 // note : letters wrap around : means if nothing find return the start index

    // logic
    // code same as ceiling number
    // Ignore the target = what we are looking for
    // arr = ['c','d','f', 'j'] target = 'j' but there is no character larger than j so here comes the
    // wrap conditons which says return the index of first element of array.

    public static char Leetcode744(char[]letters, char target){
        // find the smallest letter greater than target
        //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
      int start = 0;
      int end = letters.length - 1;
       while (start < end) {
           int mid = start + (end - start)/ 2;

           if (target < letters[mid]){
               end = end - 1;
           } else {
               start = mid + 1;
           }
       }
       return letters[start % letters.length] ;
    }




    // leetcode 34:  Find First and Last Position of Element in Sorted Array
// link: http://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public static int[] LetCode34(int[]nums, int target){

        int[] ans = {-1,-1};

        // check for the Occurence if target first
    int start = searchIndex(nums, target,true);
    int end = searchIndex(nums,target,false);

    ans[0] = start;
    ans[1] = end;
    return ans;

}
// leetCode34 : 2nd function
    // this function just returns the index value of target
    public static int searchIndex(int[] nums, int target, boolean findStartIndex){

        // potential answer

        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if(findStartIndex){ // findStartIndex is true
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // ceiling of  a Number
        int[] arr = {2,3,4,6,8,12,14,16};
        int target = 14;
        int result = Ceiling_Number(arr,target);
        System.out.println("ceiling number:"+result);


        System.out.println("---------floor of the number-----");

        int[] arr1 = {2,3,5,9,15,16,18};
        int target1 = 10;
        int result2 = Floor_Number(arr1,target1);
        System.out.println("floor Number : "+result2);

        System.out.println("-----Leetcode744---");
        char[] letters = {'c','f','j'};
        char target3 = 'a';
        char result3 = Leetcode744(letters,target3);
        System.out.println(result3);

        System.out.println("-----leetCode34-----");
        int[] nums = {5,7,7,7,8,8,8,8,10};
        int target4 = 8;
        int[] result4 = LetCode34(nums,target4);
        System.out.println(Arrays.toString(result4));
    }
}
