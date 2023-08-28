package de.telran.lesson24.practice2;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorMyVersion {

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
            char[] sign = new char[argumentsNumber -1];

            for (int i = 0; i < arguments.length; i++) {
                System.out.println(String.format("Введите значение %d аргумента (разделитель целой и дробной части - точка): ", i+1));
                arguments[i] = scanner.nextDouble();

                if(i < arguments.length -1) {
                    System.out.println("Введите знак математической операции (+, -, *, /, %): ");
                    String signString = scanner.next();
                    sign[i] = signString.charAt(0);
                }

            }


       /* char sign;
        do {  System.out.println("Введите знак математической операции (+, -, *, /, %): ");
            String signString = scanner.next();
            sign = signString.charAt(0);
        } while (sign != PLUS_SIGN && sign != MINUS_SIGN && sign != MULTIPLY_SIGN && sign != DIVIDE_SIGN && sign != REST_SIGN);
*/
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
                switch (sign[i-1]) {
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
1) Вводить знак математической операции перед вводом каждого следующего аргумента.
Например, пользователь указывает, что хочет выполнить операцию над тремя аргументами. Программа просит последовательно
ввести первый аргумент, знак математической операции, который будет выполнен над значениями первого и второго аргумента,
 значение второго аргумента, знак математической операции, который будет выполнен над результатом операции между первым
 и вторым аргументом и третьим аргументом.

В результате, программа должна позволять вычислить следующее выражение: 3 * 4 - 10.5 + 2 = 3.5

2) Выводить на экран историю последних 5 вычислений.
*/