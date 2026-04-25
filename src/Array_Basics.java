public class Array_Basics {

    public static void main(String[] args) {
        // defination of an array
        // list opf elemnets of the same type palced in a contigous memory location

        // Key Characteristics of Arrays
//        - Homogeneous elements: All elements must be of the same type (e.g., all int, all String).
//        - Fixed size: The length is defined at creation and cannot be changed later.
//                - Indexed access: Elements are accessed using indices starting at 0.
//                - Stored in heap: Arrays are objects, so memory is allocated on the heap.
//        - Default initialization:
//        - Numeric types → 0
//                - Boolean → false
//                - Object references → null

//        Declaring and Initializing Array
        int[] arr; // preferred style

        // Allocation
        arr = new int[5]; // Creates an array of 5 integers

        // Initialization with values
         int[] arr1 = {1,2,3,65,4};

         //  Example: Primitive Arra
        int[] number = {1,2,3,4,63,5};
        for (int i = 0; i < number.length; i++) {
            System.out.println("element at index: "+ i + ":"+ number[i]);
        }

//                  Analogy
//     Think of an array as a row of lockers:
//  - Each locker has a number (index).
//  - All lockers are side by side (contiguous).
//  - You can jump directly to locker #3 without opening lockers #1 and #2.

        // Common Array Operations
        //  1. Traversal (Accessing elements)
        // Going through each element one by one.
        // used when you want display all the elements or read.
        int[] arr2 = {10,30,20,34,34};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("elements at index :" + i + arr2[i]);
        }

        // 2. Insertion
        // . Adding a new element at a specific position.
        // . Since arrays are fixed-size, you can only replace existing elements, not expand
        int[] arr3 = new int[5];
        arr[0] = 10;  // inserting at index 0
        arr[1] = 20;  // inserting at index 1


        // 3. Updation (Modification)
        //- Changing the value at a given index.
        arr[2] = 99;  // updates the 3rd element

//        4. Deletion
//  - Arrays cannot shrink in size.
//  - Deletion usually means setting the value to a default (like 0 or null).
        arr[1] = 0;   // "deletes" element at index 1


    }

}
