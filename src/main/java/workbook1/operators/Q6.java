package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // TODO: x와 y 중 큰 값에 5를 곱해 출력
        System.out.println((x>y?x:y)*5);
        //삼항연산자:를 해맸다가 조건보고 사용
    }
}