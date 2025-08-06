package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a += b * c 연산 후 a, b, c 출력

        int result = (a+=b*c);
        System.out.print(result);
        System.out.println ("   "+a+" "+b+" "+c);
    }
}
//a,b,c를 출력해야 하니 14,2,3,4,가 답이 아닌가요..?
