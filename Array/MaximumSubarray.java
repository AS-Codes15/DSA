//Using Kadane's Algorithm - O(n) Time and O(1) Space

package Array;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums){

        // Stores the result (maximum sum found so far)
        int res = nums[0];

        // maximum sum of subarray ending at current position
        int maxEnd = nums[0];

        for(int i=0; i<nums.length; i++){
            maxEnd = Math.max(maxEnd + nums[i], nums[i]);
            
            //update result
            res = Math.max(res, maxEnd);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
}
