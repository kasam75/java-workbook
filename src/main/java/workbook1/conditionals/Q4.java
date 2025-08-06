package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 ||year % 400 == 0) {
            System.out.println("윤년입니다.");
        }else System.out.println("년도를 확인하세요");
    }
//            if (year % 4 == 0) {
//            } else if (year % 100 == 0) {
//            } else if (year % 400 == 0) {
//            }
//            System.out.println("윤년입니다.");
}

// TODO: 윤년 판별 로직 구현
//아... 윤년....윤년의 정의를 플로우 차트에서 했는데 잘 모르겠어요...
//일단 박겠습니다.
//자동완성되네요..?

