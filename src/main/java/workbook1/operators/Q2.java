package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a1 = ++num;
        int a2 = num++;
        // TODO: 전위 증가와 후위 증가 결과 출력
        System.out.println(a1+" "+" "+a2);
    }
}
