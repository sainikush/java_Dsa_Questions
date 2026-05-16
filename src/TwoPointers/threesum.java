package TwoPointers;

import java.util.*;

public class threesum {
    public Iterable<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        int i;  // did this because the left m i pr error aa rha tha
        for ( i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;


            int left = i + 1;
            int right = n - 1;
            int target = -1 * nums[i];

            while (left < right) {
                int currSum = nums[left] + nums[right];

                if (currSum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                } else if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public  void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = (List<List<Integer>>) threeSum1(arr);
        System.out.println(Collections.singletonList(result));

    }


}
