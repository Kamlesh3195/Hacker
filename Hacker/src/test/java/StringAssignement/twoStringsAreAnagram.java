package StringAssignement;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class twoStringsAreAnagram
{
/*  “abcd” and “dabc” are an anagram of each other.
    String str1 = "geeksforgeeks";
    String str2 = "forgeeksgeeks";*/
    public static void main(String[] args)
    {
        String str1 = "abcdw";
        String str2 = "wbadcw";
        String flag;
        Map<Character,Integer> hm = new HashMap<>();

        if(str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (hm.containsKey(str1.charAt(i))) {
                    hm.put(str1.charAt(i), hm.get(str1.charAt(i)) + 1);
                } else {
                    hm.put(str1.charAt(i), 1);
                }
            }
            for (int i = 0; i < str2.length(); i++) {
                if (hm.containsKey(str2.charAt(i))) {
                    hm.put(str2.charAt(i), hm.get(str2.charAt(i)) - 1);
                }
            }
            boolean areAnagrams = true;
            for (int count : hm.values()) {
                if (count != 0) {
                    areAnagrams = false;
                    break;
                }
            }
            if (areAnagrams) {
                System.out.println("Two strings are anagrams of each other");
            } else {
                System.out.println("Two strings are not anagrams of each other");
            }



        }
        else
        {
            System.out.println("Two string are not anagram of each other");
        }

    }
}
