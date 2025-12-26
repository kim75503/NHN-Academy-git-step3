package com.nhnacademy.practice_problems_26;

public class Main {
    public static void main(String[] args) {
        //####문제 23: 1부터 10까지 중 3의 배수를 건너뛰고 출력하는 코드를 작성하시오.
        int i = 0;
        while (i < 10) {
            i++;
            if(i % 3 == 0)
                continue;
            System.out.println(i);
        }
    }
}
