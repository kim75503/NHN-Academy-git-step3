package com.nhnacademy.practice_problems_23;

public class Main {
    public static void main(String[] args) {
        //####문제 23: switch expression과 yield를 사용하여 점수에 따른 학점을 반환하는 코드를 완성하시오.
        int score = 85;
        String grade = switch (score/10 ) {
            case 10, 9 -> "A";
            case  8 -> "B";
            case 7 -> "C";
            default -> {
                System.out.println("재시험 대상입니다.");
                yield "F";
            }


                // 여기에 코드 작성
                // 90점 이상은 A
                // 80점 이상은 B
                // 70점 이상은 C
                // 나머지는 "재시험 대상입니다." 출력 후 "F" 반환
        };
        System.out.println("학점: " + grade);
    }
}
