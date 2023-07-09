package de.telran.lesson11;

import java.util.Random;

public class IfOperations {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println("число до = "+number);
        if (number>0) number++;
        System.out.println("число после = "+number);

        if (number==0) {
            --number;
        System.out.println("if = 0  "+number);}

        if(number<0) return;
        System.out.println("Temperatura Celsiy - "+(number-273));



    }
}
