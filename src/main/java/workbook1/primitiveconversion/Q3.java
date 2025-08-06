package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();
        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력
        long B =b;
        long S = s;
        long I = i;
        long L = l;

        long sum = B + S +I + L ;

        float result  = (float) sum;
        System.out.println(result);



    }
}