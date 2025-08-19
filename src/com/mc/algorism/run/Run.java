package com.mc.algorism.run;

public class Run {

    public static void main(String[] args) {

        //swap1();
        swap2();

    }

    private static void swap2(){

        int a = 5;
        int b = 6;

        a = a ^ b;
        b = a ^ b;
        a = b ^ a;
        System.out.println(a);
        System.out.println(b);

        //(a ^ b) ^ b = a;
        //(a ^ b) ^ a = b;
    }

    private static void swap1(){
        int a = 1;
        int b = 2;
        int tmp;

        tmp = a;
        a=b;
        b=tmp;

        System.out.println(a);
        System.out.println(b);

    }
}
