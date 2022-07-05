package com.Algorithm.LeetCode.ElementaryAlgorithms;

import java.util.HashMap;

public class UniqueCharacter {

    public int firstUniqueChar(String s) {
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if ( !map.containsKey(c)) {
                map.put(c, i);
                temp[i] = 1;
            } else {
                Integer index = map.get(c);
                temp[index] += 1;
            }
        }
        for (int i = 0; i < length; i++) {
            if (temp[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
