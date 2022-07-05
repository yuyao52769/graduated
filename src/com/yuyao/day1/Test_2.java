package com.yuyao.day1;
import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] s=sc.nextLine().trim().split(" ");
            int sum=0;
            for(int i=0;i<s.length;i++){
                sum+=Integer.parseInt(s[i]);
            }
            System.out.println(sum);
        }
    }
}
