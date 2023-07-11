package home_work.hw5;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа: ");
        System.out.print("первое -> ");
        int firstNumber = scanner.nextInt();
        System.out.print("второе -> ");
        int secondNumber = scanner.nextInt();
        System.out.print("третье -> ");
        int thirdNumber = scanner.nextInt();
        int max = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        System.out.println("Максимальное число: " + max);
    }
}


// Реализуйте программу, которая попросит пользователя ввести три
// целых числа (используйте сканер) и напечатает максимум из трех чисел.