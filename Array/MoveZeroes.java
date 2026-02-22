package Array;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                  
                if (i != lastNonZeroFoundAt) {
                    nums[i] = 0;
                }
                lastNonZeroFoundAt++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        MoveZeroes obj = new MoveZeroes();
        obj.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
