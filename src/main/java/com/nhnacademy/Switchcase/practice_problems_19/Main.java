package com.nhnacademy.Switchcase.practice_problems_19;

public class Main {
    public static void main(String[] args) {
        //####문제 19: switch-case로 요일에 따른 메시지(평일, 주말)를 출력하시오.

        int day = 3; // 1:월, 2:화, 3:수, 4:목, 5:금, 6:토, 7:일
        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("평일");
                break;
            case 6: case 7:
                System.out.println("주말");
                break;
            default:
                System.out.println("잘못된 입력");

            
}
    }
}
