package com.mc.algorism.sec02;

import java.util.Scanner;

public class start {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        roop1(n);
        roop2(n);
    }

    private static void roop1(int n) {
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void roop2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
