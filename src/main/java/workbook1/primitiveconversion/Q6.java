package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력
        int S1 = Integer.parseInt(s1);
        int S2= Integer.parseInt(s2);
        byte S3 = (byte) (S1-S2);

        System.out.println(S3);
    }
}