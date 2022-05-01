package com.example.domain.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Socks {
    static List<Integer> arr = new ArrayList();

    public static void main(String[] args) {
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(5);
        System.out.println(sockMerchant(arr.size(), arr));
    }

    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < ar.size(); i++) {

            int a = ar.get(i);

            if (map.containsKey(a)) {

                int value = map.get(a);

                if (value > 0 && value % 2 != 0) {
                    value -= 1;
                } else {
                    value += 1;
                }

                map.put(a, value);

            } else {
                map.put(a, 1);
            }

        }

        List<Integer> values = new ArrayList<>(map.values());

        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }

        return (ar.size()-sum) / 2;
    }
}
