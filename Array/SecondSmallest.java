package Array;

public class SecondSmallest {

    public static int findSecondSmallest(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < first){
                second = first;
                first = nums[i];
            } else if(nums[i] < second && nums[i] > first){
                second = nums[i];
            }
        }

        return second;
    }
    public static void main(String[] args) {
        int[] nums = {7, 2, 9, 1, 5};

        System.out.println("Second smallest: "+findSecondSmallest(nums));
    }
}
