package SlidingWindow;

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k){
        int n = nums.length;

        // Step 1: sum of first window
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Step 2: sliding window
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;

    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3}; 
        int k = 4;

        System.out.println(findMaxAverage(nums, k));

    }
}
