package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean a1;
        if (num > 0) {
            System.out.println("양수");
        } else if (num == 0) {
            System.out.println(0);
        } else {
            System.out.println("음수");
        }

        // TODO: num의 부호를 판단하여 출력
        //부호 판단이요..?음수 양수 판단이구나...
        //중간에 0을 판단할떄 sout 안넣고 어디가 틀린지 고민함...
    }
}
