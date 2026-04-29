public class BinaryQuestions {

    static int Ceiling_Number(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        while (start < end) {
            int mid = start + (end - start)/ 2;
            if (target == mid){
                return mid;
            }
            if (isAsc){
                if (target < mid) {
                    end = end - 1;
                }else {
                    start = start + 1;
                }
            } else {
                if (target > mid){
                    end = end - 1;
                } else {
                    start = start + 1;
                }
            }
        }
        return start;
    }

    public static void main(String[] args) {
        // ceiling of  a Number
        int[] arr = {2,3,4,6,8,12,14,16};
        int target = 14;
        int result = Ceiling_Number(arr,target);
        System.out.println("ceiling number:"+result);

    }
}
