package home_work.hw2;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println(sumNumbers(10, 15));
        System.out.println(subtractionNumbers(25, 10));
        System.out.println(multiplicationNumbers(10, 10));
        System.out.println(divisionNumbers(100, 5));
    }

    public static int sumNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static int subtractionNumbers(int firstNumber, int secondNumber) {
        int subtraction = firstNumber - secondNumber;
        return subtraction;
    }

    public static int multiplicationNumbers(int firstNumber, int secondNumber) {
        int multiplication = firstNumber * secondNumber;
        return multiplication;
    }

    public static int divisionNumbers(int firstNumber, int secondNumber) {
        int division = firstNumber / secondNumber;
        return division;
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