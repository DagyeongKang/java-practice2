package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application8 {

    public static void main(String[] args) {

        /*
            1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

            ex.
            정수를 하나 입력하세요 : 8
            1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	    */

        System.out.print("정수를 하나 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = 0;
        System.out.print("1");

        for (int j = 2; j <= a; j++) {

            for (int b = 0; b == 0; b++) {
                sum += j;
            }
            System.out.print("+");
            System.out.print(j);


        }
        System.out.print("=" + (sum + 1));
    }
}
