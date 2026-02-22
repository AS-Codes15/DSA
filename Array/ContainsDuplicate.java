package Array;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean hashDuplicates(int[] nums){

        HashSet<Integer> seen = new HashSet<>(); // Create a HashSet to store seen numbers

        for (int num : nums){
            if(seen.contains(num))
                return true; // Duplicate found
            seen.add(num);    
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9};
        System.out.println(hashDuplicates(nums));
    }
}
