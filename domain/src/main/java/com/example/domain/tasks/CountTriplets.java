package com.example.domain.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

    public static List<Long> LIST = new ArrayList<>();
    public static List<Long> LIST2 = new ArrayList<>();

    public static void main(String[] arg) {
        LIST.add(1L);
        LIST.add(3L);
        LIST.add(9L);
        LIST.add(9L);
        LIST.add(27L);
        LIST.add(81L);

        LIST2.add(1L);
        LIST2.add(2L);
        LIST2.add(2L);
        LIST2.add(4L);

        System.out.println(countTriplets(LIST, 3L));

    }

    public static Long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> prevMap = new HashMap<>();
        Map<Long, Long> nextMap = new HashMap<>();
        long sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            Long cur = arr.get(i);
            nextMap.put(cur, nextMap.getOrDefault(cur, 0L) + 1);
        }

        for (int i = 0; i < arr.size(); i++) {
            Long cur = arr.get(i);
            Long leftCounter = 0L;
            Long rightCounter = 0L;

            nextMap.put(cur, nextMap.getOrDefault(cur, 0L) - 1);

            if (prevMap.containsKey(cur / r) && cur % r == 0) {
                leftCounter = prevMap.get(cur / r);
            }

            if (nextMap.containsKey(cur * r)) {
                rightCounter = nextMap.get(cur * r);
            }

            sum += leftCounter * rightCounter;

            prevMap.put(cur, prevMap.getOrDefault(cur, 0L) + 1);

        }

        return sum;
    }

    public static boolean isMemberOfGeometricProgression(Long base, Long value, Long r) {
        return ((value / r) == base && (value % r) == 0) || ((base / r) == value && (base & r) == 0);
    }
}
