package de.telran.lesson8;

import java.util.Random;

public class StudentGenerator {
    public static void main(String[] args) {
        // генерация номера студента
        Random random = new Random();
        int numbStudent = random.nextInt(25)+1;
        System.out.println("номер студента = "+numbStudent);

        System.out.println("сумма номера студента = "+sumTwoNumbers(numbStudent, 5));
        System.out.println("поделим номер студента = "+divideTwoNumbers(numbStudent, 2));
        System.out.println("поделим номер студента через Double = "+divideTwoDoubleInt(numbStudent, 2));
       // System.out.println("поделим номер студента на 0 = "+numbStudent/0);
        findEvenOdd(2);
        findEvenOdd(5);
        findEvenOdd(numbStudent);


    }
    static int sumTwoNumbers(int arg1, int arg2){
        int sumLocal =  arg1 + arg2;
        return sumLocal;
    }

    static double divideTwoNumbers(int arg1, int arg2){
        double divLocal = (double) arg1 / arg2;
        return divLocal;
    }

    static double divideTwoDoubleInt(double arg1, int arg2){
        double divLocal = arg1 / arg2;
        return divLocal;
    }

    static void findEvenOdd(int arg) {
        if(arg % 2 == 0) {
            System.out.println(arg+" четное");
        }
        else {
            System.out.println(arg+" нечетное");
        }
    }
    }

