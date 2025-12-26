package com.nhnacademy.practice_problems_18;

public class Main {
    public static void main(String[] args) {
        //####문제 18: 다음 코드의 출력 결과를 작성하시오. (break 누락 주의!)

        int num = 2;
        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }
            // 정답 : Two, Three
    }
}
