package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
        int X = (int)x;
        int Y = (int)y;
        int Z = (int)z;

        float average = (float)((X+Y+Z) /3);

        System.out.println("\n"+average);



    }
}
