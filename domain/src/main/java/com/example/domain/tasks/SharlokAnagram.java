package com.example.domain.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharlokAnagram {

    public static String S = "ifailuhkqq";

    public static void main(String[] arr) {
        List<String> s = separateString(S, 3);
        System.out.print(getAnagramCount(toMap(S)));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] ar = s1.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                int value = map.get(ar[i]);
                value++;
                map.put(ar[i], value);
            } else {
                map.put(ar[i], 1);
            }
        }

        char[] ar2 = s2.toCharArray();

        for (int i = 0; i < ar2.length; i++) {
            if (map.containsKey(ar2[i])) {
                int value = map.get(ar2[i]);
                value--;
                map.put(ar2[i], value);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                return false;
            }
        }

        return true;
    }

    public static int anagramCount(List<String> items) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            for (int j = i + 1; j < items.size(); j++) {
                if (isAnagram(items.get(i), items.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static List<String> separateString(String s, int length) {
        List<String> resultList = new ArrayList<>();
        if (length > s.length()) return resultList;
        int startPos = 0;
        while (startPos <= s.length() - length) {
            String sub = s.substring(startPos, startPos + length);
            resultList.add(sub);
            startPos++;
        }
        return resultList;
    }

    public static Map<Integer, List<String>> toMap(String s) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        char[] ar = s.toCharArray();
        for (int i = 1; i < ar.length; i++) {
            resultMap.put(i, separateString(s, i));
        }
        return resultMap;
    }

    public static int getAnagramCount(Map<Integer, List<String>> map) {
        int res = 0;
        int counter = 0;
        while (counter < map.values().size()) {
            counter++;
            List<String> list = map.get(counter);
            res += anagramCount(list);
        }
        return res;
    }
}
