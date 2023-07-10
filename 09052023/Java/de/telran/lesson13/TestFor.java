package de.telran.lesson13;

import java.util.Scanner;

public class TestFor {
    public static void main(String[] args) {
        printWord(5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("введите любое целое число: ");
        printNumber(scanner.nextInt());
    }

    static void printNumber(int number) {
        for (;;){ // вечный цикл for || for (int i = 0; i >= 0; i++) так лучше не писать! нужно писать for (;;)
            System.out.println(number % 10);
            number = number / 10;
            if (number == 0) break;
        }
    }

    static void printWord(int count) {
        int i;
        for (i = 0; i < count; i++) // 5 < 5 ложь, выходим из цикла
        {
            System.out.println("Hello word! " + i);
        }
        System.out.println("i = "+i);
    }
}
