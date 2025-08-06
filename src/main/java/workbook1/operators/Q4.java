package main.java.workbook1.operators;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean a1 = (b > a) && (b < c);
        System.out.println(a1);

    }
    // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력
    //뭔가 뺴먹은 느낌 if를 사용하려다 if 문제가 아니여서 지움
}
