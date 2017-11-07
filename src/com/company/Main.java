package com.company;

import java.util.Random;

public class Main {

    public static final String STR_TEXT = "Съешь ещё этих мягких французских булок, да выпей же чаю";

    public static void main(String[] args) {

        System.out.println("Часть 1");
        outRandomRowsInt(20, 1, 100);
        System.out.println("\nЧасть 2");
        outRandomCol(10, 25, 75);
        System.out.println("\nЧасть 3");
        outStringFromSpace(STR_TEXT);
        System.out.println("\nРабота завершена");
       }

    static void outRandomRowsInt (int count, int min, int max) {
        Random rand = new Random();

        System.out.print("{");
        for (int i = 1; i <= count; i++){
            System.out.print(rand.nextInt(max) + min);
            if (i != count) {
                System.out.print(" ");
            }
            else System.out.println("}");
        }
    }

    static void outRandomCol (int count, int min, int max) {
        Random rand = new Random();

        for (int i = 1; i <= count; i++) {
            System.out.printf("%.3f %n", (rand.nextDouble() + rand.nextInt(max) + min));
        }
    }

    static void outStringFromSpace (String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
