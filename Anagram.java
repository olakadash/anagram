import java.util.*;
import java.io.*;
public class Anagram {


    public static void main (String[] args) {
        
        isAnagram("cat","tac");
    }

    public    static void isAnagram(String stringOne, String stringTwo) {

        if (stringOne.length() != stringTwo.length()) {
            System.out.println(stringOne + " and " + stringTwo + " are not anagrams.");
            return;
        }

        HashMap mapOne = createMapKeys(stringOne);
        HashMap mapTwo = createMapKeys(stringTwo);
        if (mapOne.equals(mapTwo)) {
            System.out.println(stringOne + " and " + stringTwo + " are anagrams");
        } else {
            System.out.println(stringOne + " and " + stringTwo + " are not anagrams.");
        }
    }
    public static HashMap createMapKeys(String str) {
        HashMap map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = (int) map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            } else {
                map.put(str.charAt(i), 0);
            }
        }
        return map;
    }
}