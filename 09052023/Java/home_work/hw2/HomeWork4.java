package home_work.hw2;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num1;
        System.out.print("введите первое число = ");
        num1 = myScanner.nextInt();

        Scanner myScanner2 = new Scanner(System.in);
        int num2;
        System.out.print("введите второе число = ");
        num2 = myScanner.nextInt();

        sumResul(num1,num2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

     static int sumResul(int arg1, int arg2){
        int sum = arg1 + arg2;
        return sum;
        //System.out.println("сумма = "+sum) ;
    }

     static int subtractionResul(int num1, int num2){
        int subtraction = num1 - num2;
        return subtraction;
       // System.out.println("вычитание = "+subtraction) ;
    }

     static int multiplicationResul(int num1, int num2){
        int multiplication = num1 * num2;
        return multiplication;
        //System.out.println("умножение = "+multiplication) ;
    }

     static int degreeResul(int num1, int num2){
        int degree = num1 / num2;
        return degree;
        //System.out.println("деление = "+degree) ;
    }
}



// 1. Создайте методы с математическими операциями +, -, *, /
//
//
//Каждый метод принимает два числа в параметрах и возвращает результат
//
//Вызовите все методы в main
//
//Результат распечатайте в консоль