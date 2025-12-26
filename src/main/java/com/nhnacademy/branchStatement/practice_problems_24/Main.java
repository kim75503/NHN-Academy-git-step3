package com.nhnacademy.branchStatement.practice_problems_24;

public class Main {
    public static void main(String[] args) {
        //###연습: 분기문 (break, continue, return)
        //문제 21: 다음 출력 결과가 나오도록 while문 내부를 완성하시오.

        int i = 0;

        while (i < 5) {
            
            i ++;
            System.out.println(i);
            if(i>= 2)
                break;
          
        }
        System.out.println("종료");
    }
}
