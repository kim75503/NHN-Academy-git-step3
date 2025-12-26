package com.nhnacademy.last_practice_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        구현 목표: TODO 앱의 메뉴가 반복 출력되고, 선택에 따라 분기 처리할 수 있다.

        구현할 기능 (기능 명세서 4. 메뉴 구성, 5.10 종료 참조):

        - BufferedReader로 사용자 입력 받기
        - 메뉴 반복 출력
        - 메뉴 선택에 따른 분기 처리
        - 0 입력 시 프로그램 종료

        실행 예시:

        === TODO 앱 ===
        1. 등록
        2. 조회
        0. 종료
        선택 > 1
        [등록] 메뉴 선택됨

        === TODO 앱 ===
        1. 등록
        2. 조회
        0. 종료
        선택 > 0
        프로그램을 종료합니다.
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        boolean run= true;
        while(run){
            System.out.println();
            System.out.println("=== TODO앱 ===");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
            input = reader.readLine();

            switch(input){
                case "1" : 
                    System.out.println("[등록] 메뉴로 선택됨" );
                    break;
                case "2" : 
                    System.out.println("[조회] 메뉴로 선택됨" );
                    break;
                case "0" : 
                    System.out.println("프로그램을 종료합니다." ); 
                    run = false;   
                    break;
                default:
                    System.out.println("잘못된 입력 입니다." ); 
            }
                
            
        }
        
    }
}
