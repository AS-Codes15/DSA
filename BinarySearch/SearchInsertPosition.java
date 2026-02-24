package BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
      int low = 0;
        int high = nums.length - 1;
        
        while(low <= high) {
            
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return low;   // insertion position  
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }
}
