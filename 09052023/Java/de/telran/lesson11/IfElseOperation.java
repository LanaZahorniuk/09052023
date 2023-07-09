package de.telran.lesson11;

import java.util.Random;

public class IfElseOperation {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(200) - 100;//интервал от -100 до +100
        System.out.println("число = " + number);
        if (number > 0) {
            System.out.println("Temperatura Celsiy " + (number - 273));
        } else {
            System.out.println("Kan not Celsiy  ");
        }
        System.out.println("---------------------");


        // Alternative
        if (number > 0) {
            System.out.println("Temperatura Celsiy " + (number - 273));
        }
        if(!(number > 0)) { //ahalog number <= 0
            System.out.println("Kan not Celsiy  ");
        }
        System.out.println("---------------------");

        // если исключить ноль из проверки
        if(number > 0){
            System.out.println("Temperatura Celsiy " + (number - 273));
        }
        if (number < 0) {
            System.out.println("Kan not Celsiy  ");
        }
        if(number == 0){
            System.out.println("Temperatura null  ");
        }
    }

}

