package com.nhnacademy.ComparisonLogical_Operator.practice_problems_10;

public class Main {
    public static void main(String[] args) {
        //####문제 10: 다음 코드의 출력 결과를 작성하시오.
        
        int age = 25;
        int score = 70;
        System.out.println(age >= 20 && score >= 80);
        System.out.println(age >= 20 || score >= 80);
        System.out.println(!(age < 20));

        // 정답 : false
        //       ture
        //       ture
    }
}
