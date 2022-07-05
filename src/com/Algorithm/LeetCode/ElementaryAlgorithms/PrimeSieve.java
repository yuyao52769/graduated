package com.Algorithm.LeetCode.ElementaryAlgorithms;

public class PrimeSieve {

    /**
     * 埃氏筛
     * 要得到自然数n以内的全部素数，必须把不大于根号n的所有素数的倍数剔除，剩下的就是素数。
     * 给出要筛数值的范围n，找出以内的素数。先用2去筛，即把2留下，把2的倍数剔除掉；
     * 再用下一个质数，也就是3筛，把3留下，把3的倍数剔除掉；接下去用下一个质数5筛，把5留下，把5的倍数剔除掉；不断重复下去…
     * @param n
     * @return 不大于该整数n的所有质数数目
     */
    public int countPrimes(int n) {
        // 首先建立数组，将每个数都标记出为质数，后面在进行筛选
        // 从2开始，因为1不是质数，直接排除
        boolean[] isPrimeArray = new boolean[n+1];
        for (int i = 2; i <= n; i ++) {
            isPrimeArray[i] = true;
        }

        for (int i = 2; i * i <= n; i ++) {
            if (isPrimeArray[i]) {
                int temp = i;
                // 筛网开始剔除合数
                while (temp * i <= n) {
                    isPrimeArray[temp * i] = false;
                    temp++;
                }
            }
        }

        // 最后统计数组中的true数目，得到便是质数数目
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimeArray[i]) {
                result ++;
            }
        }
        return result;
    }
}
