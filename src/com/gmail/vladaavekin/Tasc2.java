package com.gmail.vladaavekin;

import java.util.Scanner;

//  В массиве хранится информация о баллах, полученных
// спортсменомдесятиборцем в каждом из десяти видов спорта.
// Для выхода в следующий этап соревнований общая сумма
// баллов должна превысить некоторое известное значение.
// Определить, вышел ли данный спортсмен в следующий этап соревнований.

public class Tasc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Бал для прохода до(100) = ");
        float Bal = scanner.nextFloat();

        float Araay[] = new float[10];

        float sum = 0;

        for (int i = 0; i < Araay.length; i++) {
            System.out.print("Введите " + (i + 1) + " бал = ");
            Araay[i] = scanner.nextFloat();
            sum += Araay[i];
        }

        if (sum >= Bal) {
            System.out.println("Вы прошли!!!");
            System.out.println(sum);
        } else {
            System.out.println("Вы лузер, ваш бал ниже проходного )))");
            System.out.println(sum);
        }



    }

}