package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner check = new Scanner (System.in);
        System.out.print("Введіть число: ");
        int a = check.nextInt();
        if (25 <= a & a <= 100){
            System.out.println("Число " +a + " міститься в проміжку (25; 100)");
        }
        else{
            System.out.println("Число " + a + " не міститься в проміжку (25; 100)");
        }

    }
}