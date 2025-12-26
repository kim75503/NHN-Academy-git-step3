package com.nhnacademy.practice_problems_15;

public class Main {
    public static void main(String[] args) {
        //####문제 15: 점수에 따른 학점을 출력하는 코드를 완성하시오.

        int score = 75;
        String grade;
        
        if(score >= 90){
            grade = "A";
        }else if (score >= 80) {
            grade = "B";
        }else if (score >= 70){
            grade = "C";
        }else if(score >= 60){
            grade = "D";
        }else 
            grade = "F";
        // 여기에 코드 작성
        // 90 이상: A, 80 이상: B, 70 이상: C, 60 이상: D, 그 외: F

        System.out.println("학점: " + grade);

        
    }
}
