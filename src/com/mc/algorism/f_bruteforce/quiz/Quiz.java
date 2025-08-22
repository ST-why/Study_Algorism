package com.mc.algorism.f_bruteforce.quiz;

import java.util.ArrayList;

public class Quiz {

    public static void main(String[] args) {
        q1(5);
        q2();
    }

    private static void q2() {

    }

    private static void q1(int i) {
        int end = 666;
        int cnt = 0;
        int result;

        while (cnt < i) {
            end++;
            if(Integer.toString(end).contains("666")){
                cnt++;
            }
            System.out.println();
        }
        result = end;
        System.out.println(result);
    }


}
