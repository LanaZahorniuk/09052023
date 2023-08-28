package de.telran.lesson23.practice3;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    public static final char PLUS_SIGN = '+';
    public static final char MINUS_SIGN = '-';
    public static final char MULTIPLY_SIGN = '*';
    public static final char DIVIDE_SIGN = '/';
    public static final char REST_SIGN = '%';
    public static final String ANSWER_YES = "y";
    public static final String ANSWER_NO = "n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для того чтоюы принимал точку при введении значений

        String needNextCalculation;

        do {

        System.out.println("Введите значение первого аргумента " +
                "(разделитель целой и дробной части - точка): ");
        double argumentOne = scanner.nextDouble();


        char sign;
        do {  System.out.println("Введите знак математической операции (+, -, *, /, %): ");
            String signString = scanner.next();
            sign = signString.charAt(0);
        } while (sign != PLUS_SIGN && sign != MINUS_SIGN && sign != MULTIPLY_SIGN && sign != DIVIDE_SIGN && sign != REST_SIGN);

        /* if(signChar != '+' && signChar != '-'&& signChar != '*' && signChar != '/' && signChar != '%') {
            System.out.println(signChar+" указанная операция не поддерживается программой");
            System.exit(0); //return; System.exit системный выход
        } */


            double argumentTwo;
            do {
                System.out.println("Введите значение второго аргумента " +
                        "(разделитель целой и дробной части - точка): ");
                argumentTwo = scanner.nextDouble();

            } while (argumentTwo == 0 && (sign == DIVIDE_SIGN || sign == REST_SIGN));


     /* if(argumentTwo == 0 && (signChar == '/' || signChar == '%')) {
            System.out.println("на 0 делить нельзя");
            System.exit(0);
        } */
        double result = 0;

        switch(sign) {
            case PLUS_SIGN :
                result = argumentOne + argumentTwo;
                break;
            case MINUS_SIGN :
                result = argumentOne - argumentTwo;
                break;
            case MULTIPLY_SIGN :
                result = argumentOne * argumentTwo;
                break;
            case DIVIDE_SIGN :
                result = argumentOne / argumentTwo;
                break;
            case REST_SIGN :
                result = argumentOne % argumentTwo;
                
        }

        System.out.println(String.format("%.2f %s %.2f = %.2f", argumentOne, sign, argumentTwo, result));

            do {
                System.out.println("Выполнить еще одно вычисление? (Y/N): ");
                needNextCalculation = scanner.next();
            } while (!ANSWER_YES.equalsIgnoreCase(needNextCalculation) && !ANSWER_NO.equalsIgnoreCase(needNextCalculation)); //можно ввести только Y ИЛИ N

        } while (ANSWER_YES.equalsIgnoreCase(needNextCalculation));
    }
}




 /*
1) Реализации интерактивного меню. После завершения вычислений калькулятор должен спрашивать желает ли
пользователь выполнить еще вычисление. Если пользователь вводит "Y", то калькулятор выполняет новый цикл
работы - запрашивает значения аргументов и знак математической операции, выполняет вычисления и выводит
на экран ответ. После этого снова спрашивает желает ли пользователь выполнить еще вычисление.
Если пользователь вводит "N", то работа программы завершается.

2) Ввода корректного значения выбора пользователя в интерактивном меню - "Y" или "N".
Если пользователь ввёл иной символ - программа должна попросить ввести ответ снова, до тех под,
пока пользователь не введет символ "Y" или "N".

3) Ввода корректного значения второго аргумента (знаменателя), если пользователь выбрал знак деления.
Если пользователь выбрал операцию деления и ввёл значение второго аргумента = 0, то программа должна
запрашивать ввод нового значения аргумента до тех пор, пока оно не будет не равно нулю.

4) Аналогично программа должна повторно запрашивать ввод знака математической операции до тех пор,
пока он не будет введён корректно.

*/