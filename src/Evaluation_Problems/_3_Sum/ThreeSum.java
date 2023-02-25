package Evaluation_Problems._3_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums, int target) {
        // Sort the input array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1};
        int target = 0;
        List<List<Integer>> result = threeSum(nums, target);
        System.out.println("The triplets with sum " + target + " are: ");
        for (List<Integer> triplets : result) {
            System.out.println(triplets);
        }
    }
}
