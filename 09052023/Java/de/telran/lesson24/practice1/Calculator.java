package de.telran.lesson24.practice1;

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

            int argumentsNumber;

            do {
                System.out.print("Введите количество аргументов (2 или более): ");
                argumentsNumber = scanner.nextInt();
            } while (argumentsNumber < 2);

            double[] arguments = new double[argumentsNumber];
            for (int i = 0; i < arguments.length; i++) {
                System.out.println(String.format("Введите значение %d аргумента (разделитель целой и дробной части - точка): ", i+1));
                arguments[i] = scanner.nextDouble();
            }


        char sign;
        do {  System.out.println("Введите знак математической операции (+, -, *, /, %): ");
            String signString = scanner.next();
            sign = signString.charAt(0);
        } while (sign != PLUS_SIGN && sign != MINUS_SIGN && sign != MULTIPLY_SIGN && sign != DIVIDE_SIGN && sign != REST_SIGN);

// Это наш технический долг !!! :)
 /*         double argumentTwo;
            do {
                System.out.println("Введите значение второго аргумента " +
                        "(разделитель целой и дробной части - точка): ");
                argumentTwo = scanner.nextDouble();

            } while (argumentTwo == 0 && (signChar == '/' || signChar == '%'));
*/
            double result = arguments[0];
            for (int i = 1; i < arguments.length; i++) {
                switch (sign) {
                    case PLUS_SIGN :
                        result += arguments[i];
                        break;
                    case MINUS_SIGN :
                        result -= arguments[i];
                        break;
                    case MULTIPLY_SIGN :
                        result *= arguments[i];
                        break;
                    case DIVIDE_SIGN :
                        result /= arguments[i];
                        break;
                    case REST_SIGN :
                        result %= arguments[i];
                }
            }

            StringBuilder resultMessenger = new StringBuilder();
            for(int i = 0; i<arguments.length; i++){
                resultMessenger.append(String.format("%.2f",arguments[i]));
                if(i<arguments.length-1) resultMessenger.append(sign);
            }
            resultMessenger.append("=").append(String.format("%.2f",result));

            System.out.println(resultMessenger);

            do {
                System.out.println("Выполнить еще одно вычисление? (Y/N): ");
                needNextCalculation = scanner.next();
            } while (!ANSWER_YES.equalsIgnoreCase(needNextCalculation) && !ANSWER_NO.equalsIgnoreCase(needNextCalculation)); //можно ввести только Y ИЛИ N

        } while (ANSWER_YES.equalsIgnoreCase(needNextCalculation));
    }
}



 /*
1) Обновите функционал до производящего вычисления (+, -, *, /) с произвольным количеством чисел
c дробной частью.
2) Количество аргументов пользователь вводит с клавиатуры. Оно должно быть от 2 и более.
3) Тип данных вводимых аргументов должен быть Double.
4) Далее пользователь последовательно вводит значение каждого из аргументов, а затем - знак математической
операции, которую необходимо выполнить со значениями введенных аргументов.
5) Результат работы программы необходимо вывести в виде вычисляемого выражения и полученного результата
с точностью до двух чисел после запятой.
*/