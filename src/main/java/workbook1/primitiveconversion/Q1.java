package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double A = a;
        double B = b;

        double sum = A + B;

        int result = (int) sum;
        System.out.println(result);

        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
    }
}