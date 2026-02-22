package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for(int i=0; i < arr.length; i++){
            int num = arr[i];
            int diff = target -num;

            if(prevMap.containsKey(diff)){
                return new int[] {prevMap.get(diff), i}; 
            }

            prevMap.put(num,i);
        }

        return new int[] {};

    }
    
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;

        int[] result = twoSum(arr, target);
        System.out.println("The index of the two numbers that add up to " + target + " is: " + Arrays.toString(result)); 
    }
}
