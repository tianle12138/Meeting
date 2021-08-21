package com.tianle;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            System.out.println(isOdd(scan.nextInt()));
        }
    }

    private static boolean isOdd(int num) {
        //return num % 2 != 0;效率和按位与几乎一样，应为JVM会把对2的取模自动优化成按位与
        return (num & 1) == 1;
    }

}
