package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Виберіть: Вгору / Вниз || ");
        String a = scan.nextLine();
        System.out.print("Виберіть поверх: 1 / 9 || ");
        int f = scan.nextInt();

        if (a.equals("Вгору"))
        {
            if (f == 1) {
                System.out.println("Ви піднялись на " + f + " поверх");
            } else if (f == 2) {
                System.out.println("Ви піднялись на 3 поверх у зв'язку із поломкою на 2 поверсі");
            }
            else if (f == 3) {
                System.out.println("Ви піднялись на " + f + " поверх");
            }
            else if (f == 4) {
                System.out.println("Ви піднялись на " + f + " поверх");
            }
            else if (f == 5) {
                System.out.println("Ви піднялись на " + f + " поверх");
            }
            else if (f == 6) {
                System.out.println("Ви піднялись на " + f + " поверх");
            }
            else if (f == 7) {
                System.out.println("Ви піднялись на " + f + " поверх");
            }
            else if (f == 8) {
                System.out.println("Ви піднялись на " + f + " поверх");
            }
            else if (f == 9) {
                System.out.println("Ви піднялись на " + f + " поверх");
            }
        }else if(a.equals("Вниз")){
            if (f == 1) {
                System.out.println("Ви спустились на " + f + " поверх");
            }
            else if (f == 2) {
                System.out.println("Ви спустились на 1 поверх у зв'язку із поломкою на 2 поверсі");
            }
            else if (f == 3) {
                System.out.println("Ви спустились на " + f + " поверх");
            }
            else if (f == 4) {
                System.out.println("Ви спустились на " + f + " поверх");
            }
            else if (f == 5) {
                System.out.println("Ви спустились на " + f + " поверх");
            }
            else if (f == 6) {
                System.out.println("Ви спустились на " + f + " поверх");
            }
            else if (f == 7) {
                System.out.println("Ви спустились на " + f + " поверх");
            }
            else if (f == 8) {
                System.out.println("Ви спустились на " + f + " поверх");
            }
            else if (f == 9) {
                System.out.println("Ви спустились на " + f + " поверх");
            }












        }
    }
}
