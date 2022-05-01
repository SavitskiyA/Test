package com.example.domain.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSort {
    public static int[] ar = new int[]{4,3,1,2};

    public static void main(String[] arr) {
        minSort(ar);
    }

    public static int minSort(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<len;i++)
            map.put(nums[i], i);

        Arrays.sort(nums);

        // To keep track of visited elements. Initialize
        // all elements as not visited or false.
        boolean[] visited = new boolean[len];
        Arrays.fill(visited, false);

        // Initialize result
        int ans = 0;
        for(int i=0;i<len;i++) {

            // already swapped and corrected or
            // already present at correct pos
            if(visited[i] || map.get(nums[i]) == i)
                continue;

            int j = i, cycle_size = 0;
            while(!visited[j]) {
                System.out.println("j="+j);
                visited[j] = true;
                System.out.print(Arrays.toString(visited));
                System.out.println("");

                // move to next node
                j = map.get(nums[j]);
                cycle_size++;
                System.out.print("j="+j);
                System.out.println("");
                System.out.print("cycle_size="+cycle_size);
                System.out.println("");
            }

            // Update answer by adding current cycle.
            if(cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }
        return ans;
    }

}
