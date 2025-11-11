package leetcode.easy;

import java.util.Arrays;

public class Two_Sum_1 {
    public static void main(String[] args) {
        int[] numbs = {2, 7, 11, 15};
        int target = 9;

        int[] sum = sum(numbs, target);
        System.out.println(Arrays.toString(sum));
    }

    public static int[] sum(int[] numbs, int target) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}