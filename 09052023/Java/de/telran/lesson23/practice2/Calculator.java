package de.telran.lesson23.practice2;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для того чтоюы принимал точку при введении значений

        System.out.println("Введите значение первого аргумента " +
                "(разделитель целой и дробной части - точка): ");
        double argumentOne = scanner.nextDouble();

        System.out.println("Введите знак математической операции (+, -, *, /, %): ");
        String signString = scanner.next();
        char signChar = signString.charAt(0);
        if(signChar != '+' && signChar != '-'&& signChar != '*' && signChar != '/' && signChar != '%') {
            System.out.println(signChar+" указанная операция не поддерживается программой");
            System.exit(0); //return; System.exit системный выход
        }



        System.out.println("Введите значение второго аргумента " +
                "(разделитель целой и дробной части - точка): ");
        double argumentTwo = scanner.nextDouble();
        if(argumentTwo == 0 && (signChar == '/' || signChar == '%')) {
            System.out.println("на 0 делить нельзя");
            System.exit(0);
        }
        double result = 0;

        switch(signChar) {
            case '+' :
                result = argumentOne + argumentTwo;
                break;
            case '-' :
                result = argumentOne - argumentTwo;
                break;
            case '*' :
                result = argumentOne * argumentTwo;
                break;
            case '/' :
                result = argumentOne / argumentTwo;
                break;
            case '%' :
                result = argumentOne % argumentTwo;

        }

        System.out.println(String.format("%.2f %s %.2f = %.2f", argumentOne, signChar, argumentTwo, result));

    }
}




 /*   1) Используйте оператор switch-case вместо оператора if-else
         при обработке введенной математической операции.
      2) К списку арифметических операций, выполняемых калькулятором,
        добавьте поддержку операции деления по модулю (%), возвращающую остаток от деления.
*/