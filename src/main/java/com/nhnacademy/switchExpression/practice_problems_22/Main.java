package com.nhnacademy.practice_problems_22;

public class Main {
    public static void main(String[] args) {
        //####문제 22: 다음 코드의 출력 결과를 작성하시오.
        int month = 2;
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> -1;
        };
        System.out.println(month + "월은 " + days + "일");

        // 정답 : 2월은 28일
    }
}
