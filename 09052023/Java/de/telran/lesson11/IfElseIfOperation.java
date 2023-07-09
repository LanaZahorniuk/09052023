package de.telran.lesson11;

import java.util.Random;

public class IfElseIfOperation {
    public static void main(String[] args) {
        Random random = new Random();
        float number = random.nextFloat() + random.nextInt(10);
        System.out.println("сгенирированное число = " + number);

        if (number > 0 && number < 2) System.out.println("Начался дождь");
        if (number > 2 && number < 5) System.out.println("Сильный дождь");
        if (number >= 5 && number < 7) System.out.println("Ливень");
        if (number >= 7) System.out.println("Шторм!");
        System.out.println("---------------------------------------");

        //Alternative
        if (number < 2) System.out.println("Начался дождь");
        else if (number < 5) System.out.println("Сильный дождь");
        else if (number < 7) System.out.println("Ливень");
        else System.out.println("Шторм!");


        // альтернатива 2
        if (number < 2) {
            System.out.println("Начался небольщой дождик");
        } else if (number < 5) {
            System.out.println("Сильный дождик");
        } else if (number < 7) {
            System.out.println("На улице ливень!");
        } else {
            System.out.println("Потоп! Сидите дома!");
        }

        //работа со строками
        isDarkOrLight("white");

        boolean bVal = true;
        if(bVal) System.out.println("Истина");
    }

    static void isDarkOrLight(String color) {
        if (color.equalsIgnoreCase("white")) {
            System.out.println(color + " - light");
        } else if (color.equalsIgnoreCase("black")) {
            System.out.println(color + " - dark");
        } else if (color.equalsIgnoreCase("grin"))
        {
            System.out.println(color + " - light");
        } else if (color.equalsIgnoreCase("braun")) {
            System.out.println(color + " - dark");
        } else {
            System.out.println(color + " - not");
        }
    }
}
