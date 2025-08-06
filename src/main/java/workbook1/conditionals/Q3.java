package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력

        double average = (double) (s1 + s2 + s3) /3;
        System.out.println("\n"+average);
        if (average >=90 )
        {
            System.out.println("A");
        } else if (average>=80) {
            System.out.println("B");
        }
        else if (average >=70) {
            System.out.println("C");
        }
        else if (average >=60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
//일부로 평균값 추가했음 보통 평균 몇인데 A~F라고 하니까