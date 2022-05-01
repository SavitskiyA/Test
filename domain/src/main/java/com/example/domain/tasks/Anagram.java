package com.example.domain.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * n squared
 * Time complexity O(2n^2+n)
 */
public class Anagram {
    public static void main(String[] arg) {
        String str1 = "df";
        String str2 = "fd";
        System.out.println(isAnagram(str1, str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        char[] ar = str1.toCharArray();

        for (char c : ar) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                counter++;
                map.put(c, counter);
            } else {
                map.put(c, 1);
            }
        }

        char[] ar2 = str2.toCharArray();
        for (char c : ar2) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                counter--;
                map.put(c, counter);
            } else {
                map.put(c, 1);
            }
        }

        Object[] counters = map.values().toArray();
        for (Object counter : counters) {
            int a = (int) counter;
            if (a != 0) return false;
        }
        return true;
    }
}
