package com.example.domain.tasks;

import java.util.ArrayList;
import java.util.List;

public class Clouds {
    public static ArrayList<Integer> items = new ArrayList();

    public static void main(String[] arg) {
        items.add(0);
        items.add(0);
        items.add(1);
        items.add(1);
        items.add(0);
        items.add(0);
        System.out.println(jumpingOnClouds(items));
    }

    public static int jumpingOnClouds(List<Integer> c) {

        int counter = 0;
        int i = 0;
        int j=0;

        if (c.size() == 0 || c.get(0) != 0 || c.get(c.size() - 1) != 0) return counter;

        while (j < (c.size())) {
            i += 1;
            j = i + 1;
            if (j < (c.size())&&c.get(j) == 0) {
                i = j;
                counter++;
            } else if (i < (c.size())&&c.get(i) == 0) {
                counter++;
            } else {
                return counter;
            }
        }
        return counter;
    }
}
