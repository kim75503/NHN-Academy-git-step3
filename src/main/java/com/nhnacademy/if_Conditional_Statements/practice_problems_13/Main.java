package com.nhnacademy.if_Conditional_Statements.practice_problems_13;

public class Main {
    public static void main(String[] args) {
        //####문제 13: 다음 코드의 출력 결과를 작성하시오.
        int x = 10;
        int y = 5;
        if (x > 5 && y > 3) {
            System.out.println("조건1 만족");
        }
        if (x > 15 || y > 3) {
            System.out.println("조건2 만족");
        }
        if (!(x < 5)) {
            System.out.println("조건3 만족");
        }

        // 정답 : 조건1 만족
        //       조건2 만족
        //       조건3 만족
    }
}
