package ru.dataart.academy.java;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        int length = checkString.length();
        int result = 0;
        if (checkString.length() <= 0) return 0;
        if (checkString.length() == 1) return 1;
        Map<Character, Integer> pointer = new HashMap<>();
        pointer.put(checkString.charAt(0), 0);
        int[] lengthAt = new int[checkString.length()];
        lengthAt[0] = 1;
        for (int i = 1; i < length; i++) {
            char c = checkString.charAt(i);
            if (pointer.containsKey(c)) {
                lengthAt[i] = Math.min(lengthAt[i - 1] + 1, i - pointer.get(c));
            } else {
                lengthAt[i] = lengthAt[i - 1] + 1;
            }
            result = Math.max(result, lengthAt[i]);
            pointer.put(c, i);
        }
        return result;
    }
}
