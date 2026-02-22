package Array;

public class SecondLargest {
    public static int findSecondLargest(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > first){
                second = first;
                first = nums[i];
            } else if(nums[i] > second && nums[i] < first ){
                second = nums[i];
            }
        }

        return second;
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 8, 20, 15};

        System.out.println("Second Largest element is "+findSecondLargest(nums));
    }
}
