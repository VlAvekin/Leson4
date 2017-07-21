package com.gmail.vladaavekin;

// В массиве хранится информация о численности книг в каждом
// из 35 разделов библиотеки. Выяснить, верно ли, что общее
// число книг в библиотеке есть шестизначное число.


import java.util.Scanner;

public class Tasc1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Araay[][];

        System.out.print("Введите количество кгин в разделе = ");
        int col = scanner.nextInt();

        int res = col *35;

        if (res > 1_000_000)
            System.out.println(res);
        else
            System.out.println("меньше 1 000 000 > " + res);


    }

}
