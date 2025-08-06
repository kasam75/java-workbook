package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("같은값");
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a값이 더큽니다.");
                } else {
                    System.out.println("c값이 더 큽니다.");
                }
            } else {
                if (b > c) {
                    System.out.println("b값이 더큽니다.");
                } else {
                    System.out.println("c값이 더 큽니다.");
                }
            }
        }
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력
    }
}
//        if(a ==b ||a ==c ||b ==c){
//            System.out.println("같은값");
/// /        } else if (a > b) {
/// /            System.out.println("a값이 더큽니다.");
/// /        } else if (b > c) {
/// /            System.out.println("b값이 더큽니다.");
/// /        } else if (c > a) {
/// /            System.out.println("c값이 더 큽니다.");
/// /        }
//            //아 다했는데 중첩 if 문이네...