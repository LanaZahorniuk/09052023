package de.telran.lesson8.practice;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах по цельсию = ");
int tempNumber = scanner.nextInt();
        System.out.println("температура в Kelvin = "+runKelvinConventer(tempNumber));
        System.out.println("температура в Fahrenheit = "+runFahrenheitConventer(tempNumber));
    }

    static double runKelvinConventer(double baseValue) {
        return baseValue + 273;
    }

    static double runFahrenheitConventer (double baseValue) {
        return 1.8 *  baseValue +32;
    }
}
