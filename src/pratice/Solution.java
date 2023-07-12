package pratice;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean equalFrequency(String word) {
        char[] c = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + 1);
            } else {
                map.put(c[i], 1);
            }
        }

        if (map.values().size() > 2) return false;
        int count = 0;
        for (char i : map.keySet()) {
            count = Math.abs(count - map.get(i));
        }
        if (count != 1) return false;
        return true;
    }

    public static void main(String[] args) {
        String str = "aabc";
        System.out.println(equalFrequency(str));
    }

}
