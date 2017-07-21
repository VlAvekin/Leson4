package com.gmail.vladaavekin;

//  Оценки, полученные спортсменом в соревнованиях по
// фигурному катанию (в баллах), хранятся в массиве
// из 18 элементов. В первых шести элементах записаны
// оценки по обязательной программе, с седьмого по
// двенадцатый — по короткой программе, в остальных — по
// произвольной программе. Выяснить, по какому виду программы
// спортсмен показал лучший результат.

import java.util.Scanner;

public class Tasc3 {

    final static int col = 18;

    static int oPog = 0;
    static int cPog = 0;
    static int pPog = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float Araay[] = new float[18];

        for (int i = 0; i < Araay.length; i++) {
            System.out.print("Введите " + (i + 1) + " бал = ");
            Araay[i] = scanner.nextFloat();
        }

        for (int i = 0; i < Araay.length; i++) {
            if(i < 6) oPog += Araay[i];
            if(i > 6 && i <= 12) cPog += Araay[i];
            if(i > 12 && i < 18) pPog += Araay[i];
        }

        System.out.println(oPog);
        System.out.println(cPog);
        System.out.println(pPog);

        int numArr[] = {oPog, cPog, pPog};
        int c = max(numArr);

        System.out.print("Cпортсмен показал лучший результат = ");
        System.out.print(c + " балов");

        if (c == oPog)
            System.out.println("  обязательной программе.");
        if (c == cPog)
            System.out.println("  короткой программе.");
        if (c == pPog)
            System.out.println("  произвольной программе.");

    }

    public static int max(final int a[]) {
        int m;
        if (a[0] > a[1] && a[0] > a[2]) {
            m = a[0];
        } else if (a[1] > a[0] && a[1] > a[2]) {
            m = a[1];
        } else {
            m = a[2];
        }
        return m;
    }

}
