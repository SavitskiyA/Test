package com.example.domain.tasks;

import com.sun.tools.javac.comp.Todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountTriplets {
    public static List<Long> LIST = new ArrayList<>();

    public static void main(String[] arg) {
        LIST.add(1L);
        LIST.add(3L);
        LIST.add(9L);
        LIST.add(9L);
        LIST.add(27L);
        LIST.add(81L);

    }

    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Integer> prevMap = new HashMap<>();
        Map<Long, Integer> nextMap = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < arr.size(); i++) {
            Long key = arr.get(i);

            if (nextMap.containsKey(key)) {
                int value = nextMap.get(key);
                value++;
                nextMap.put(key, value);
            } else {
                nextMap.put(key, 1);
            }

        }

        List<Long> keys = new ArrayList<>(nextMap.keySet());

        for (int i = 0; i < keys.size(); i++) {
            Long key = keys.get(i);
            Long prev = key / r;
            Long next = key * r;

            if()
        }
    }

    public static boolean isMemberOfGeometricProgression(Long base, Long value, Long r) {
        return ((value / r) == base && (value % r) == 0) || ((base / r) == value && (base & r) == 0);
    }
}
