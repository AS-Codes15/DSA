package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false ;
        }

        char[] a = str1.toCharArray(); // Convert string to char array 
        char[] b = str2.toCharArray();  // Convert string to char array 

        Arrays.sort(a);  // Sort the first string's characters
        Arrays.sort(b);  // Sort the second string's characters

        return Arrays.equals(a,b); // Compare the sorted strings
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";

        boolean result = isAnagram(str1, str2);
        System.out.println("Are the strings anagrams? " + result);   // Output: true
    }
}
