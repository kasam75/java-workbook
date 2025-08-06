package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean result1 = x>y;
        boolean result2 = !(x>y);
        //&gt가 뭔가요..?검색하니 부등호? 이게맞나?

        System.out.println(result1+" "+result2);
        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력
    }
}