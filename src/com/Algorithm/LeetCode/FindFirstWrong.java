package com.Algorithm.LeetCode;

import javax.sound.midi.MidiChannel;

public class FindFirstWrong {

    public int solution(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
           int mid = left + (right -left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int n) {
        return (n % 2) == 0;
    }

    public static void main(String[] args) {
        FindFirstWrong findFirstWrong = new FindFirstWrong();
        int solution = findFirstWrong.solution(10);
        System.out.println(solution);
    }
}
