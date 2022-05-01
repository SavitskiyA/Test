package com.example.domain.tasks;

public class RepeatedString {

    public static void main(String[] arg) {
        System.out.println(repeatedString("aba", 13));
    }

    public static long repeatedString(String s, long n) {
        long fullBaseCount = n/s.length();
        long baseCounter = baseCounter(s);
        long c1 = fullBaseCount*baseCounter;
        long leftSymbols = n - fullBaseCount*s.length();

        char[] ar = s.toCharArray();
        long c2 = 0;
        for (int i = 0; i < leftSymbols; i++) {
            if (ar[i] == 'a') c2++;
        }
        return (c1 + c2);
    }

    public static long baseCounter(String s) {
        long c = 0;
        char[] ar = s.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 'a') c++;
        }
        return c;
    }
}
