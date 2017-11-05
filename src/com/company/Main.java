package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Часть 1");
        outRandomRowsInt(20);
        System.out.println("\nЧасть 2");
        outRandomCol(10);
        System.out.println("\nЧасть 3");
        String strText= "Съешь ещё этих мягких французских булок, да выпей же чаю";
        outStringFromSpace(strText);
        System.out.println("\nРабота завершена");
       }

    static void outRandomRowsInt (int count) {
        Random rand = new Random();

        System.out.print("[");
        for (int i = 1; i <= count; i++){
            System.out.print(rand.nextInt(100) + 1);
            if (i != count) {
                System.out.print(" ");
            }
            else System.out.println("]");
        }
    }

    static void outRandomCol (int count) {
        Random rand = new Random();

        for (int i = 1; i <= count; i++) {
            System.out.printf("%.3f %n", (rand.nextDouble() + rand.nextInt(49) + 25));
        }
    }

    static void outStringFromSpace (String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
