import javax.swing.*;
import java.util.Scanner;

public class Arrays_Basics {
    public static void update(int marks[]) {
        for(int a = 0; a < marks.length; a++) {
            marks[a] = marks[a] + 1;
        }
    }
public static int LinearSearch(int numbers[], int key) {
        for(int b = 0; b < numbers.length; b++) {
            if( numbers[b] == key){
                return b;
            }
        }
        return -1;
}

    public static int LinearSearch1(String fruits[], String key1) {
        for(int c = 0; c < fruits.length; c++) {
            if( fruits[c] == key1){
                return c;
            }
        }
        return -1;
    }

    // To Print the Largest and Smallest of the  Numbers in Array
    public static int Largest(int num[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // + infinity

        for(int c = 0; c < num.length; c++) {
            if(largest < num[c]) {
                largest = num[c];
            }
            // Smallest
            if(smallest > num[c]) {
                smallest = num[c];
            }
        }
        System.out.println("smallest value is : " +smallest);
        return largest;
    }

// Binary Search
    public static int Binary_Search(int count[], int key2){
         int start = 0, end = count.length - 1;

         while (start <= end) {
             int mid = (start + end) / 2;

             // comparisons
             if (count[mid] == key2) {
                 return mid;
             }
             if(count[mid] < key2) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }
         }
         return -1;
    }


    // Reverse of an Array
    public static void Reverse_Array(int numbers2[]) {
       int first = 0, last = numbers2.length - 1;

       while(first < last) {
           // swap
//           int temp = numbers2[last];
//           numbers2[last] = numbers2[first];
//           numbers2[first] = temp;
           int temp = numbers2[first];
           numbers2[first] = numbers2[last];
           numbers2[last] = temp;

           first++;
           last--;
       }
    }

    // Pairs in a Array
    public static void Pairs(int numbers3[]) {
        int tp = 0;
        for(int i = 0; i < numbers3.length; i++) {
            int curr = numbers3[i];// 2,4,6,8..

            for (int j = i + 1; j < numbers3.length; j++) {
                System.out.print("(" + curr + "," + numbers3[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total Pairs : " +tp);
    }

// Print Sub-Arrays
  public static void SubArray(int number4[]) {
        int ts = 0;
        for(int i = 0; i < number4.length; i++) {

            for(int j=i; j < number4.length; j++) {

                for (int k=i; k <= j; k++) {
                    System.out.print(number4[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
      System.out.println("Total subarray : " +ts);
  }


  // Max SUb ARray Sum :- Brute Force
    public static void Max_Sub_Array(int number5[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number5.length; i++) {
            for(int j = i; j < number5.length; j++) {
                 currSum = 0;
                for(int k = i; k <= j; k++) {
                    currSum += number5[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum="+maxSum);

    }

    // Print the Max Sub Array Sum : Prefix Array
    public static void PrefixArray(int num6[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num6.length];

        prefix[0] = num6[0];
        // calculate Prefix array
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num6[i];
        }

        for (int i = 0; i < num6.length; i++) {
            for (int j = i; j < num6.length; j++) {

                currSum = i == 0 ? prefix[j] : prefix[j] -prefix[i - 1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(" max sum = " +maxSum);

    }

//    To Print the Kadane's Algorithm
    public static void kadanes(int num7[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < num7.length; i++) {
            cs = cs + num7[i];
            if(cs < 0) {
                cs = 0;
            }
            maxSum = Math.max(cs, maxSum);
        }
        System.out.println("Our Max SubArray sum is :" +maxSum);
    }

    // To Print the Kadane's Algorithm :- Special CAse
    public static int KadanesSpecail(int num8[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num8.length; i++) {
            currSum += num8[i];

            if ( currSum > MaxSum) {
                MaxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return MaxSum;
    }


    // to print the Trapping RainWater
    public static int trappedWater(int height[]) {
        int n = height.length;
        //  to calculate the leftMax boundry - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1] );
        }

        //  to calculate the Right Max boundry - array
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for (int i = n-2; i >= n; i--) {
            RightMax[i] = Math.max(height[i],RightMax[i + 1] );
        }
        int trappedWater = 0;
        // Loop
        for (int i = 0; i < n; i++) {
      //  waterLevel = min(leftMax boundry, RightMax Boundry)
      int waterLevel = Math.min(leftMax[i], RightMax[i]);

      // Trapped water = waterlevel - height[i]
            trappedWater += waterLevel - height[i];

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        String fruits[] = {"mango", "litchi", "banana", "Apple"};
        String key1 = "litchi";
        int index1 = LinearSearch1(fruits,key1);
        if(index1 == -1) {
            System.out.println("Not found :");
        }else {
            System.out.println(" index found :" + index1);
        }


        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = LinearSearch(numbers, key);
        if( index == -1) {
            System.out.println(" Not found");
        } else {
            System.out.println("Key is at index : " +index);
        }

        System.out.println();

        // to Print the Largest Numbers
        int num[] = {1,2,3,9,6,4};
        System.out.println("Largest number is : " +Largest(num));


        // Binary Search :
        int count[] = {2,4,6,8,10,12,14,16};
        int key2 = 12;
        System.out.println("index for key is : " +Binary_Search(count,key2));

        // REverse Of an array
        int numbers2[] = {2,4,6,8,10,12,13};
        Reverse_Array(numbers2);
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]+" ");
        }
        System.out.println();

        // Pairs in Array
        int numbers3[] = {2,4,6,8,10,12};
        Pairs(numbers3);

        // Print SubArrays
        int numbers4[] = {2,4,6,8,10};
        SubArray(numbers4);

        //   Print the MAX SubArray Sum
       int numbers5[] = {2,4,5,6,7,10,14};
       Max_Sub_Array(numbers5);

       // Print the Max SUbArray Sum :- Prefix Method
        int num6[] = {1,-2,6,-1,3};
        PrefixArray(num6);

        // Kadane's Algorithm
        System.out.println("--------- kadanes algorithm ---------- ");
        int num7[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(num7);

// To Print the Kadane's Algorithm
        System.out.println("--------- kadanesSpecial case -------------");
        int num8[] = {-2,-5,-8,-6};
        int maxsum = KadanesSpecail(num8);
        System.out.println("Maximun Subarray sum :- " +maxsum);

        // To print the Trapping rainWater
        int height[] = {4,2,0,6,3,2,5};
        trappedWater(height);
    }
}


























//        int marks[] = new int[40];
//        int numbers[] = {1,2,3,4,5};
//        String fruits[] = {"apple", "mango", "moringa"};

//   int marks[] = new int[100];

// Input
//        Scanner sc = new Scanner(System.in);
//
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();
//        System.out.println("physics:" + marks[0]);
//        System.out.println("maths:" +marks[1]);
//        System.out.println("sci :" +marks[2]);
//
//        // marks[2] = 23;
//        marks[2] = marks[2] + 4;
//        System.out.println("sci : " +marks[2]);
//
//        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//        System.out.println("percentage = " + percentage + "%");

// Passing array as an argument :- Call by reference
//        int marks[] = {34,57,67};
//        update(marks);

//  Print our marks
//        for(int a = 0; a < marks.length; a++) {
//            System.out.print(marks[a]+" ");
//        }
//        System.out.println();