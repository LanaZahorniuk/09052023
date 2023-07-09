package de.telran.lesson11;

import java.util.Random;

public class NestedIfOperation {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(200) ;//интервал +200
        System.out.println("число = " + number);

        if(number>100){
            System.out.println("Нарушение - предупреждение");
            if(number>130) {
                System.out.println("Злостное нарушение - штраф!");
                if(number>170) System.out.println("Лишение прав!");
            }
            System.out.println("-------------------------------");
        }
        // использование логических операторов Для задавания диапазона
        if(number>100 && number<=130) System.out.println("Нарушение - предупреждение");
        if(number>130 && number<170) System.out.println("Злостное нарушение - штраф!");
        if(number>170) System.out.println("Лишение прав!");

    }
}
