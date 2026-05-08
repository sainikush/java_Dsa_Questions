package BinarySearch;

import java.util.Arrays;

public class Binary2D {
    // Binary Search in a Fully Sorted Matrix

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int col = matrix.length - 1;

        while (r < matrix.length && col >= 0){
            if(matrix[r][col] == target){
                return  new int[] {r,col};
            }
            if(matrix[r][col] < target){
                r++;
            } else {
                col--;
            }

        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,40}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
}
