package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cycle_sort_Interview {
// leetcode 264
    // Mising of number
    public static int swap(int[]arr, int first, int last){
       int temp = arr[first];
       arr[first] = arr[last];
       arr[last] = temp;

       return temp;
    }

    public static int missingNumber(int[]arr){
        int i = 0;
        while (i < arr.length){
            int corrctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[corrctIndex]){
                swap(arr, i , corrctIndex);
            }else {
                i++;
            }
        }
        // missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]  != index){ // correction
                return index;
            }
        }
        return arr.length;
    }

    // leetCode :
    //                     find all the numbers disappered in an Array
//    Given an array nums of n integers where nums[i] is in the range [1, n],
//    return an array of all the integers in the range [1, n] that do not appear in nums.

//    Example 1:
//    Input: nums = [4,3,2,7,8,2,3,1]
//    Output: [5,6]
//             Example 2:
//    Input: nums = [1,1]
//    Output: [2]
    public static List<Integer> DisappearedNum(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i, correctIndex);
            }else {
                i++;
            }
        }
        // finding disappered no
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }


//  287. Find the Duplicate Number

//Given an array of integers nums containing n + 1 integers where
// each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and using
// only constant extra space.

//Example 1:
//Input: nums = [1,3,4,2,2]
//Output: 2
//Example 2:
//
//Input: nums = [3,1,3,4,2]
//Output: 3
//Example 3:
//
//Input: nums = [3,3,3,3,3]
//Output: 3

    public static int FindDuplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else {
                i++;
            }
        }
        // find the duplicate numbers
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return nums[index];
            }
        }
        return nums.length;
    }

    //442. Find All Duplicates in an Array

    //Given an integer array nums of length n where all the integers of nums are in the range [1, n]
    // and each integer appears at most twice, return an array of all the integers that appears twice.
    //
    //You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
    //
    //Example 1:
    //
    //Input: nums = [4,3,2,7,8,2,3,1]
    //Output: [2,3]
    //Example 2:
    //
    //Input: nums = [1,1,2]
    //Output: [1]
    //Example 3:
    //
    //Input: nums = [1]
    //Output: []
    public static  List<Integer> AllDuplicates(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
        // find all the duplicates numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]  != index){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    //645. Set Mismatch
    //Easy
    //Topics
    //premium lock icon
    //Companies
    //You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
    // one of the numbers in s got duplicated to another number in the set,
    // which results in repetition of one number and loss of another number.
    //
    //You are given an integer array nums representing the data status of this set after the error.
    //
    //Find the number that occurs twice and the number that is missing and return them in the form of an array.
    //

    //Example 1:
    //
    //Input: nums = [1,2,2,4]
    //Output: [2,3]
    //Example 2:
    //
    //Input: nums = [1,1]
    //Output: [1,2]

    public static int[] FindErrors(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
        // find the missing and duplicates numbers
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return new int[]{arr[index],index + 1};
            }
        }
        return new int[]{-1,-1};
    }



//41. First Missing Positive

//Given an unsorted integer array nums.
// Return the smallest positive integer that is not present in nums.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//Example 1:
//
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//Example 2:
//
//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.
//Example 3:
//
//Input: nums = [7,8,9,11,12]
//Output: 1
//Explanation: The smallest positive integer 1 is missing.

    // same as miising number no but some changes
    public static int PoisiitveNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
        // find the missinmg postive number;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }


    public static void main(String[] args) {
        int[] arr = {3,0,1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("-- numbers disappered in an Array---- ");
        int[] arr2 = {4,3,2,7,8,2,3,1};
        DisappearedNum(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("==== Duplicate Number ====");
        int[] arr3 = {1,3,4,2,2};
        FindDuplicate(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("==== All Duplicate Number ====");
        int[] nums2 = {4,3,2,7,8,2,3,1};
        AllDuplicates(nums2);
        System.out.println(Arrays.toString(nums2));

        System.out.println("== ==  Set Mismatch == ==");
        int[] arr4 = {1,2,2,4};
        FindErrors(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("== == Poistive number == ==");
        int[] arr5 = {1,2,0};
        PoisiitveNumber(arr5);
        System.out.println(Arrays.toString(arr5));



    }
}
