package BinarySearch;

public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int peak = nums[0];
        int index = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] > peak){
                peak = nums[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println("Index of peak element: "+ findPeakElement(nums));
    }
}
