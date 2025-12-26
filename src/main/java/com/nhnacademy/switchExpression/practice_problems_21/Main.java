package com.nhnacademy.switchExpression.practice_problems_21;

public class Main {
    public static void main(String[] args) {
        //###연습: switch expression (Java 14+)
        //####문제 21: 다음 switch 문을 switch expression으로 변환하시오.

        /*
        int day = 3;
        String type;
        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                type = "평일";
                break;
            case 6: case 7:
                type = "주말";
                break;
            default:
                type = "잘못된 입력";
        }
        System.out.println(type);
         */

        int day = 3;
        String type = switch (day) {
            case 1,2, 3, 4,5 -> "평일";
            case 6, 7 -> "주말";
            default -> "잘못된 입력";
        };
        System.out.println(type);
    }

}
