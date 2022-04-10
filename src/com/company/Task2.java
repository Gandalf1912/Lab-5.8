package com.company;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        int a, b, c, d, e;
        a = n%10;
        b = n%100/10;
        c = n/100;
        d = Math.max(c,b);
        e = Math.max(d,a);
        System.out.println("Найбільша цифра числа " + n + " є: " + e);


    }
}