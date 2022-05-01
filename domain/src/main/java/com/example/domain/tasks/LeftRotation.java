package com.example.domain.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    static Integer[] ar = new Integer[]{1, 2, 3, 4, 5,6,7,8};
    static List items = new ArrayList<Integer>();

    public static void main(String[] arg) {
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

    }

    public static List<Integer> move(List<Integer> ar) {
        int t = ar.get(ar.size() - 1);
        for (int i = ar.size() - 1; i > 0; i--) {
            ar.set(i, ar.get(i-1));
        }
        ar.set(0, t);
        return ar;
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List resList = new ArrayList<Integer>();
        resList.addAll(a.subList(0,d));
        resList.addAll(a.subList(d,a.size()));
        return resList;
    }
}
