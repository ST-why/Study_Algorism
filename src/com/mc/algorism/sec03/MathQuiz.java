package com.mc.algorism.sec03;

public class MathQuiz {

    public static void main(String[] args) {
        System.out.printf("소수입니까?: %s \n", isPrime(11));
        System.out.printf("12, 18 최대공약수: %d \n", gcd(12, 18));
        System.out.printf("12, 18 최대공배수: %d \n", lcm(12, 18));
        System.out.printf("5!: %d\n", factorial(5));
        System.out.printf("5!: %d\n", factorial2(5, 1));
    }

    private static int factorial(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("음수 펙토리얼은 존재하지 않습니다.");
        }
        if (i <= 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    // 꼬리재귀함수
    // 반환부에 연산이 없는 재귀함수
    // 컴파일러가 내부적으로 반복문으로 최적화 / 자바 x
    private static int factorial2(int i, int j) {
        if (i < 0) {
            throw new IllegalArgumentException("음수 펙토리얼은 존재하지 않습니다.");
        }
        if (i <= 1) {
            return j;
        }
        j = i * j;
        return factorial2(--i, j);
    }


    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 약수
    // n % m = 0;
    // 약수의 특징: 약수는 곱해서 피제수 (나누어지는 수)가 되게끔 하는 쌍이 반드시 존재
    // ex): 12 => 1,2,3,4,6,12
    private static boolean isPrime2(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt((n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int gcd(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return -1;
    }

    private static int lcm(int a, int b) {
        int min = Math.min(a, b);
        int c, d;
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                c = a / i;
                d = b / i;
                return i * c * d;
            }
        }

        return -1;
    }

}