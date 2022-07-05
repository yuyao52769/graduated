package com.Algorithm.LeetCode;

public class CharPath {

    public String alphabetBoardPath(String target) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < target.length(); i++) {
            if (i == 0) {
                result.append(getPathByTwoPoint2('a', target.charAt(i)));
            } else {
                result.append(getPathByTwoPoint2(target.charAt(i-1), target.charAt(i)));
            }
        }
            return result.toString();
    }

    public StringBuffer getPathByTwoPoint2(char a, char b) {
        int[] positionA = getPosition(a);
        int[] positionB = getPosition(b);
        int i = positionB[0] - positionA[0];
        int j = positionB[1] - positionA[1];
        StringBuffer buffer = new StringBuffer();
        if (i < 0) {
            for (int k = 1; k <= Math.abs(i); k++) {
                buffer.append("U");
            }
        }
        if (j > 0) {
            for (int k = 1; k <= j; k++) {
                buffer.append("R");
            }
        }
        if (j < 0) {
            for (int k = 1; k <= Math.abs(j); k++) {
                buffer.append("L");
            }
        }
        if (i > 0) {
            for (int k = 1; k <= i; k++) {
                buffer.append("D");
            }
        }
        buffer.append("!");
        return buffer;
    }

    public int[] getPosition(char a) {
        int[] position = new int[2];
        int index = (int)a - 97;
        position[0] = index / 5;
        position[1] = index % 5;
        return position;
    }

    public static void main(String[] args) {
        String target = "zdz";
        CharPath charPath = new CharPath();
        System.out.println(charPath.alphabetBoardPath(target));
    }
}

