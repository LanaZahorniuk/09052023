package home_work.hw4;

import java.util.Locale;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("введите первое число: ");
        float m = scanner.nextFloat();
        System.out.print("введите второе число: ");
        float n = scanner.nextFloat();
        int o = 10;
        float p = Math.abs(o-n);
        float r = Math.abs(o-m);

        if (p == r) {
            System.out.println("Оба введенные вами числа одинаково близки к " + o);
        }
        if (p < r) {
            System.out.println("Число " + n + " ближе к " + o);
        }
        if (p > r) {
            System.out.println("Число " + m + " ближе к " + o);
        }
    }

}
//    Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.