package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Contain_Duplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        Boolean b = containsDuplicate(arr);
        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] numbs) {
        Set<Integer> set = new HashSet<>();
        for (int n : numbs) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }


}
