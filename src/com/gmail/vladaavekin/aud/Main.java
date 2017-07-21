package com.gmail.vladaavekin.aud;


import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] banksArrray;

        System.out.print("Введите n = ");
        int n = scanner.nextInt();

        banksArrray = new double[n];

        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < banksArrray.length; i++) {

            banksArrray[i] = 27 + Math.random();

            System.out.print(banksArrray[i] + " ");
        }

        Arrays.sort(banksArrray);
        System.out.println();
        System.out.println("Наелутший банк - " + banksArrray[banksArrray.length - 1]);



    }

}
