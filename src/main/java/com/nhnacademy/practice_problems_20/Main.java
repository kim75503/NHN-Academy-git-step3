package com.nhnacademy.practice_problems_20;

public class Main {
    public static void main(String[] args) {
        //####문제 20: switch-case로 계산기를 구현하시오.

        int a = 10, b = 3;
        String op = "/";
        int result = 0;

        switch (op) {
            case "+" :
                result = a + b;
                break;
            case "-" :
                result = a - b;
                break;
            case "*" :
                result = a * b;
                break;
            case "/" :
                result = a / b;
                break;
            default:
                System.out.println("지원하지 않은 연산자");
            // "+": 덧셈, "-": 뺄셈, "*": 곱셈, "/": 나눗셈
        }

        System.out.println(a + " " + op + " " + b + " = " + result);
    }
}
