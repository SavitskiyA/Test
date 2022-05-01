package com.example.domain.tasks;

import java.util.HashMap;
import java.util.Map;

public class Valleys {
    private static String path = "UDDDUDUU";

    public static void main(String[] args) {
        System.out.println(countingValleys(path.length(), path));
    }

    public static int countingValleys(int steps, String path) {
        int counter = 0;
        int valleys = 0;
        boolean isValley = false;


        for (int i = 0; i < path.length(); i++) {
            int value = replace(path.charAt(i));
            counter += value;
            if (counter < 0 && !isValley) {
                valleys++;
                isValley = true;
            } else if (counter >= 0 && isValley) {
                isValley = false;
            }
        }
        return valleys;
    }

    public static int replace(char c) {
        if (c == 'u'||c == 'U') return 1;
        if (c == 'd'||c == 'D') return -1;
        return 0;
    }
}
