package com.gmail.vladaavekin.aud;


import java.util.Scanner;

public class Tasc3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println("\n" + sum);
    }

}
