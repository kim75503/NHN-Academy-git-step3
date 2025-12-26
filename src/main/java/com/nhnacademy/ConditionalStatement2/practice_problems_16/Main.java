package com.nhnacademy.ConditionalStatement2.practice_problems_16;

public class Main {
    public static void main(String[] args) {
        //####문제 16: 세 수 중 가장 큰 수를 출력하는 코드를 작성하시오.

        int a = 15, b = 27, c = 12;
        int max;

        if(a >= b && a >= c)
            max = a;
        else if ( b >= a && b >= c)
            max = b;
        else 
            max = c;

        // 여기에 코드 작성 (if-else if-else 사용)
        System.out.println("가장 큰 수: " + max);
    }
}
