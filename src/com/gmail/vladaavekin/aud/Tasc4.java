package com.gmail.vladaavekin.aud;

import java.util.Scanner;

/**
 * Created by vlada on 17.07.2017.
 */
public class Tasc4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }

        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                if (array[i] % 9 == 0) {
                    sum *= array[i];
                }
            }
        }

        System.out.println("\n" + sum);

    }

}
