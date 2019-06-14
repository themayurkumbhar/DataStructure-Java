package leetcode;

import java.util.HashSet;

public class LongestSubString {

    public static void main(String[] args) {

        String str = " ";
        System.out.println(temp(str));

    }

    private static int temp(String s){

        char [] a = s.toCharArray();

        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int result = 1;
        if (s.length() == 0) {
            result = 0;
        }
        int i = 0, j = 0;
        int n = a.length;
        while (i < n && j < n) {

            if (set.add(a[j++])) {
                count = Math.max(count, j - i);
            } else {
                set.remove(a[i++]);
            }
        }
        if (count > result) {
            result = count;
        }
        return result;
    }
}
