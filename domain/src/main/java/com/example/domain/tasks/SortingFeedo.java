package com.example.domain.tasks;

import java.util.Arrays;

public class SortingFeedo {
    public static int[] ar = new int[]{1, 3, 1, 7, 8, 9, 7, 4, 98, 6, 2, 5, 10, 7, 4, 1};

    public static void main(String[] arg) {
        System.out.println(Arrays.toString(sortFeedo(ar, 4)));
    }

    public static int[] sortFeedo(int[] ar, int position) {
        if (position > ar.length - 1) return ar;
        for (int c = 1; c < ar.length; c++) {
            if (c % position == 0) {
                int limit = ((ar.length - c) < position) ? ar.length : c + position;

                for (int i = c; i < limit; i++) {
                    for (int j = c; j < limit-1; j++) {
                        if (ar[j] > ar[j + 1]) {
                            int temp = ar[j];
                            ar[j] = ar[j + 1];
                            ar[j + 1] = temp;
                        }
                    }
                }
                c = limit + 1;
            }
        }
        return ar;
    }
}
