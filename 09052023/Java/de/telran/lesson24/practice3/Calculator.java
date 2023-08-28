package de.telran.lesson24.practice3;

import java.util.Arrays;
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
    public static final int HISTORY_SIZE = 3;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для того чтоюы принимал точку при введении значений
        String needNextCalculation;
        String[] resultsHistory = new String[HISTORY_SIZE]; // Массив для запоминания истории 5 последних вычислений

        do {

            int argumentsNumber;

            do {
                System.out.print("Введите количество аргументов (2 или более): ");
                argumentsNumber = scanner.nextInt();
            } while (argumentsNumber < 2);

            double[] arguments = new double[argumentsNumber];
            char[] signs = new char[argumentsNumber -1];


            for (int i = 0; i < arguments.length; i++) {
                System.out.println(String.format("Введите значение %d аргумента (разделитель целой и дробной части - точка): ", i+1));
                arguments[i] = scanner.nextDouble();
                if(i < arguments.length -1){
                    do {
                        System.out.println("Введите знак математической операции (+, -, *, /, %): ");
                        signs[i] = scanner.next().charAt(0);
                    } while (signs[i] != PLUS_SIGN && signs[i] != MINUS_SIGN && signs[i] != MULTIPLY_SIGN
                            && signs[i] != DIVIDE_SIGN && signs[i] != REST_SIGN);
                    }

                }

            double result = arguments[0];
            for (int i = 1; i < arguments.length; i++) {
                switch (signs[i-1]) {
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
                if(i<arguments.length-1) resultMessenger.append(signs[i]);
            }
            resultMessenger.append("=").append(String.format("%.2f",result));

            // Освобождаем первую ячейку массива для сохранения последнего результата работы программы, сдвигая значения на 1 ячейку вперёд, начиная с конца
            for (int i = resultsHistory.length - 1; i > 0; i--) {
                resultsHistory[i] = resultsHistory[i - 1];
            }
            resultsHistory[0] = resultMessenger.toString(); //заносим в историю результат текущего выражения

            System.out.println("История выполненных вычислений:");
            System.out.println(Arrays.toString(resultsHistory)); //вывожу на экран историю результатов
            System.out.println();


            do {
                System.out.println("Выполнить еще одно вычисление? (Y/N): ");
                needNextCalculation = scanner.next();
            } while (!ANSWER_YES.equalsIgnoreCase(needNextCalculation) && !ANSWER_NO.equalsIgnoreCase(needNextCalculation)); //можно ввести только Y ИЛИ N

        } while (ANSWER_YES.equalsIgnoreCase(needNextCalculation));
    }
}



/*
выполнить рефакторинг программного кода "Калькулятора" таким образом, чтобы каждый логический шаг алгоритма был бы реализован в отдельном методе.
создать отдельные методы для выполнения следующих шагов:
1) String inputExpression() - для ввода строки (вычисляемого математического выражения) с клавиатуры
2) double[] parseArguments(String expression) - для получения из строки математического выражения значений аргументов
3) char[] parseSigns(String expression) - для получения из строки математического выражения знаков математических операций
4) double calculate(double argumentOne, char sign, double argumentTwo) - для выполнения математической операции над парой аргументов
5) void printResult(String expression, double result) - для вывода результата вычисления на экран
Убедитесь, что приложение работает корректно.
Соберите дистрибутив приложения (calculator.jar), согласно инструкции:
https://www.jetbrains.com/help/idea/compiling-applications.html#package_into_jar
запустите полученный дистрибутив из командной строки своей операционной системы командой:
 java -jar calculator.jar
*/