package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
         * Application5의 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
         *   “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
         *	ex.
         *	1이상의 숫자를 입력하세요 : 4			1이상의 숫자를 입력하세요 : 0
         *	1 2 3 4 							1 이상의 숫자를 입력해주세요.
         *										1이상의 숫자를 입력하세요 : 8
         *										1 2 3 4 5 6 7 8
         *
         *
         * */

        Application6 a = new Application6();
        a.first();

    }


    public int first() {
        System.out.print("1 이상의 숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 1) {
            for (int i = 1; i <= a; i++) {
                System.out.print(i);
                System.out.print(" ");
            }
        } else {
            System.out.println(" ");
            System.out.println("1 이상의 숫자를 입력해주세요");
            Application6 c = new Application6();
            c.second();

        }
        return a;
    }

    public void second() {

        Application6 b = new Application6();
        b.first();
    }
}



