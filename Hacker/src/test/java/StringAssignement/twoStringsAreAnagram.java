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
        String str2 = "wbubc";
        int flag = 0;
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
            Set<Character> keys = hm.keySet();
            for (Character q : keys) {
                if (hm.get(q) != 0) {
                    //System.out.println("Two string are anagram of each other");
                    flag ++;
                }

            }


            if (flag > 0) {
                System.out.println("Two string are m anagram of each other");
            } else {
                System.out.println("Two string are  anagram of each other");
            }
        }
        else
        {
            System.out.println("Two string are not anagram of each other");
        }

    }
}
