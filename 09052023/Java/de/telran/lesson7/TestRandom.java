package de.telran.lesson7;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
    public static void main(String[] args) {
        int myInt = 5; // 5 это литерал
        System.out.println(myInt);

        Scanner scanner = new Scanner(System.in);
        myInt = scanner.nextInt(); // ждёт ввода с клавиатуры
        System.out.println(myInt);

        Random random = new Random();
        myInt = random.nextInt(50); // в скобках указываем пределы До какого числа идёт Рандом
        System.out.println(myInt);

        double myDouble = random.nextDouble(); //генерация дробной части
        System.out.println(myDouble);

        System.out.println(myDouble+myInt);// генерация целой и дробной части

        float myFloat = random.nextFloat();
        System.out.println(myFloat);

        boolean myBoolean = random.nextBoolean();
        System.out.println(myBoolean);
    }
}
