package Strings;

import java.util.Set;

public class CountCharacter {

    public static void count(String s){
        System.out.println("Total number of characters are: "+s.length());

        int count = 0;

        Set<Character> vowels = Set.of('a','e','i','o','u','A','I','E','O','U');
        for (char ch : s.toCharArray()) {
            if(vowels.contains(ch)){
                count ++;
            }
        }

        System.out.println("Total number of vowels are: "+count);
    }
    public static void main(String[] args) {
        String s = "ENGINEERING";

        count(s);

    }
}
 