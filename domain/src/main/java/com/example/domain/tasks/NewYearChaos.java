package com.example.domain.tasks;

import java.util.List;

public class NewYearChaos {
    public static int[] ar = new int[]{2, 1, 5, 3, 4};

    public static void main(String[] arg) {
        minimumBribes(ar);
    }

    public static void minimumBribes(int[] ar) {
        int swapCount = 0;

        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] != i + 1) {
                if ((i - 1) >= 0 && (ar[i - 1] == (i + 1))) {
                    swapCount++;
                    swap(ar, i - 1, i);
                } else if ((i - 2) >= 0 && (ar[i - 2] == (i + 1))) {
                    swapCount += 2;
                    swap(ar, i - 2, i - 1);
                    swap(ar, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swapCount);
    }

    public static void minimumBribes(List<Integer> ar) {
        int swapCount = 0;

        for (int i = ar.size() - 1; i >= 0; i--) {
            if (ar.get(i) != i + 1) {
                if ((i - 1) >= 0 && (ar.get(i - 1) == (i + 1))) {
                    swapCount++;
                    swap(ar, i - 1, i);
                } else if ((i - 2) >= 0 && (ar.get(i - 2) == (i + 1))) {
                    swapCount += 2;
                    swap(ar, i - 2, i - 1);
                    swap(ar, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swapCount);
    }

    public static void swap(int[] ar, int first, int sec) {
        int t = ar[first];
        ar[first] = ar[sec];
        ar[sec] = t;
    }

    public static void swap(List<Integer> ar, int first, int sec) {
        int t = ar.get(first);
        ar.set(first, ar.get(sec));
        ar.set(sec, t);
    }

}
