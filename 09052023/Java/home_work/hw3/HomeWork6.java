package home_work.hw3;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scannerForSum = new Scanner(System.in);
        System.out.println("Сложение +");
        System.out.println("введите первое целое число: ");
        int firstNumberForSum = scannerForSum.nextInt();
        System.out.println("введите второе целое число: ");
        int secondNumberForSum = scannerForSum.nextInt();
        System.out.println("Сумма чисел = "+sumNumbers(firstNumberForSum, secondNumberForSum));

        System.out.println("--------------------------------");

        System.out.println("Вычитание -");
        System.out.println("введите первое целое число: ");
        int firstNumberForSubtraction = scannerForSum.nextInt();
        System.out.println("введите второе целое число: ");
        int secondNumberForSubtraction = scannerForSum.nextInt();
        System.out.println("Разница чисел = "+subtractionNumbers(firstNumberForSubtraction, secondNumberForSubtraction));

        System.out.println("--------------------------------");

        System.out.println("Умножение *");
        System.out.println("введите первое целое число: ");
        int firstNumberForMultiplication = scannerForSum.nextInt();
        System.out.println("введите второе целое число: ");
        int secondNumberForMultiplication = scannerForSum.nextInt();
        System.out.println("Произведение чисел = "+multiplicationNumbers(firstNumberForMultiplication, secondNumberForMultiplication));

        System.out.println("--------------------------------");

        System.out.println("Деление /");
        System.out.println("введите первое целое число: ");
        int firstNumberForDivision = scannerForSum.nextInt();
        System.out.println("введите второе целое число: ");
        int secondNumberForDivision = scannerForSum.nextInt();
        System.out.println("Деление чисел = "+divisionNumbers(firstNumberForDivision, secondNumberForDivision));


    }


    public static int sumNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static int subtractionNumbers(int firstNumber, int secondNumber){
        int subtraction = firstNumber - secondNumber;
        return subtraction;
    }

    public static int multiplicationNumbers(int firstNumber, int secondNumber){
        int multiplication = firstNumber * secondNumber;
        return multiplication;
    }

    public static int divisionNumbers(int firstNumber, int secondNumber){
        int division = firstNumber / secondNumber;
        return division;
    }
}
