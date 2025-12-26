package com.nhnacademy.Arithmetic_Operator.practice_problems_4;

public class Main {
    public static void main(String[] args) {
        //문제 4: 다음 코드의 출력 결과를 작성하시오.

        int a = 7;
        int b = 2;
        System.out.println(a / b);
        System.out.println(a / 2.0);
        System.out.println((double) a / b);

        //정답 : 3, 3.5, 3.5
        /*
        설명:

        int / int = int (소수점 버림)
        int / double = double
        (double) int / int = double
         */
    }
}
