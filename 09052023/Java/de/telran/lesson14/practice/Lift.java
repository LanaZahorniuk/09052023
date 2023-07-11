package de.telran.lesson14.practice;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        int h, n, m;
        Scanner scanner = new Scanner(System.in);
        do {


            System.out.print("Введите этажность дома -> ");
            h = scanner.nextInt();

            System.out.print("Введите шаг подъема -> ");
            n = scanner.nextInt();

            System.out.print("Введите шаг спуска -> ");
            m = scanner.nextInt();
            if (m >= n) System.err.println("Введите корректное значение.");
        } while (m > n);
        int currentFloor = 0;
        int i = 1;
        while (currentFloor < h) {
            System.out.println(i+" Текущий этаж - " + currentFloor);
            currentFloor = numberLift(currentFloor, n, m);
            i++;
        }
        System.out.println("Мы достигли последнего этажа: " + h+ ".  за кол-во иттераций - "+i);

    }

    static int numberLift(int floor, int stepUp, int stepDown) {
        return floor + stepUp - stepDown;
    }
}
