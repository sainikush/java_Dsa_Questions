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

    // Position of an element in infinite array  : Amazon
    static int Range_Of_window(int[] arr, int target){
        // first find the range
        // first start with a window of size 2
        int start = 0;
        int end = 1;

        // conditions for the target to lie in the range
        while (target > arr[end]){
            int temp = end + 1; // temp is my new start
            // double the window value
            // end = Previous end + sizeof window*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return Infinite_Binary_Search(arr,target,start,end);
    }
    public static int Infinite_Binary_Search(int[]arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // leet code : 852, 162
    // link : http://leetcode.com/problems/find-peak-element/submissions/1992395028/
    // Peak Index In a Mountain Array

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                // you are in decreasing part of array, this may be ans
                // but look at left
                // this is why end != mid -1;
                end = mid;
            }else {
                // you are in ascending part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end start == end and pointing  to largest number because of 2 checks above.
        // start & end are always trying to find max element in the above 2 checks.
        // hence, when they are pointing to just one element, that is the max element due to checks.
        // at every point of time for start & end they have best possible answers at that time
        // ans if we are saying that only one item is remaing, hece cus of above line that is best possible line.
        return start;// return start or end as both are equall.
    }


    // Leetcode 1095:
    // link: https://leetcode.com/problems/find-in-mountain-array/description/
    //      find in Mountain ARRay
// basciallly we will use 3 function 2 helper function and 1 main function
    // 1st peak Mountain Array
    public static int PeakMoutainArrayFunc(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int Agonistic(int[]arr, int target,int start, int end){
        int ans =  -1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

public static int PeakMoutainArray(int[]arr, int target){
        int peak = PeakMoutainArrayFunc(arr);
        int firstry = Agonistic(arr,target,0,peak);
        if (firstry != -1){
            return firstry;
        }
        // try to search in Second half:
    return Agonistic(arr,target,peak+1,arr.length -1);

}

// Search in sorted array
    // we have to find the pivot element
    // what is pivot : largeest no in an array
    // case 1 check if arr[mid] > arr[mid+1]; if yes then return mid
    // case 2 : check if arr[mid] <  arr[mid -1]: if yes then return mid - 1;
    // case 3 : check arr[start] >= arr[mid]; if yes return end = mid -1 else start = mid + 1;
    public static int RotatedBinary(int[]arr, int target,int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
 public static int FindPivot(int[]arr){
        int start = 0;
        int end = arr.length - 1;
         while (start < end){
             int mid = start + (end - start)/2;
             if (arr[mid] > arr[mid+1]){
                 return mid;
             }
             if (arr[mid]<arr[mid - 1]){
                 return mid -1;
             }

             if (arr[start] >= arr[mid]){
                 end = mid - 1;
             }else {
                 start = mid + 1;
             }
         }
         return -1;
 }

// Main funtion
    public static int SearchInArray(int[]arr, int target){
        // if pivot found then check these cases:
        // case1 : if (pivot == -1) return binary search.
        //case 2 : arr[pivot] == target then return pivot;
        // case 3 : arr[pivot] < target then return binary search (arr, target,0,pivot -1;
        //   at end return binary search(arr,target,pivot+1,arr.lenght - 1;
         int pivot = FindPivot(arr);
        if (pivot == -1){
            return RotatedBinary(arr,target,0,arr.length -1);
        }
        // if pivot found you have two asc sorted array
        if (arr[pivot] == target){
            return pivot;
        }
        if (arr[pivot] < target){
            return RotatedBinary(arr,target,0,arr.length - 1);
        }
        return RotatedBinary(arr,target,pivot + 1,arr.length-1);
    }

    // Search in duplicate for duplicate values in sorted roted array
    public static int FindPivotInDuplicate(int[]arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] < arr[mid -1]){
                return mid - 1;
            }
            // case3 what if the start,end and middle value is same
            // then skip the duplicates
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                // now check if start or end are pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if (arr[end] < arr[end -1]){
                    return end -1;
                }
                end--;
            }
            // left side array is sorted so check in the right side
            else if (arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid] >arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Rotation count in the sorted array
    public static int RotationCount(int[] arr){
        int piovt = FindPivot((arr));// use this when array has no duplicate values
//        int pivot = FindPivotInDuplicate(arr);// use this when duplicated value are present
        return piovt + 1;
    }

    // leetCode 410 :
    // Split Array largest Sum
    // check in how many parts you can split the array that is sum is not grater then mid element
    // suppose : [7,2,5,10,8] this array is given so we have to find  split array subarrays
    // there is cacthc your subarray must be less than m . m is total number in which you can split the array
    // approch
    // find the max no in array , and total sum in array : eg 10 is max and total sum of array is 32
    // [10,32]
    // mid = 10 + 32/2 = 21. 21 should be the no in which you have to split he array
    // [7,2,5] and [18,8] their sum is 14 and 18 in which 18 is largest
    // if (piesces <= m) menas end = mid;
    // s = 10 & end = 21;
    // mid = 10+21/2 = 15;
    // [7,2,5] [8] [10] : here pieces = 3
    // start = mid + 1;
    // do it that way till start and end are equall

    // logic
    public static int SplitArray(int[]arr, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]); // will have the max number
            end = end + arr[i]; // will contain the total sum;
        }

        // Binary Search
        while (start < end){
            int mid = start + (end - start)/2;// potenial answer

            int sum = 0;
            int piece = 1;
            for(int arrs : arr){
                if ((sum + arrs) > end){ // you can't add this array
                    sum = arrs;
                    piece++;
                } else {
                    start = start + arrs;
                }
            }
            if (piece >m){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return start; // here start and end are equalls
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

        System.out.println("------Position of an element in infinite array  : Amazon-----");

        int[] arr2 = {2,3,4,5,9,8,11,13,15,17,19,21,22,23,25,28,30};
        int target5 = 11;
        int result5 = Range_Of_window(arr2,target5);
        System.out.println(result5);

        System.out.println("---peakIndexInMountainArray--");
        int[] arr3 = {4,5,6,7,8,3,2,1,0};
        System.out.println(peakIndexInMountainArray(arr3));

    }
}
