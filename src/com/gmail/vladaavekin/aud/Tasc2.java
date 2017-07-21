package com.gmail.vladaavekin.aud;


import java.security.SecureRandom;
import java.util.Scanner;

public class Tasc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        int n =  scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int k = 0;
        for (int i = 0; k < array.length; i++) {
            System.out.println(array[k] + " индех " + k);
            k = (int)Math.pow(2, i);
        }

    }

}
