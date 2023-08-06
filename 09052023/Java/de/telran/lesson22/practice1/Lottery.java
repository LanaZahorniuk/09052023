package de.telran.lesson22.practice1;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int setSize = 5; //кол-во игроков
        int range = 50; //интервал
        int lucky; // счасливое число
        int luckyCount; //угаданное кол-во номеров

        //сгенерируемые номера лотереи
        int lucky1 = 0;
        int lucky2 = 0;
        int lucky3 = 0;
        int lucky4 = 0;
        int lucky5 = 0;

        //номера введенные пользователем
        int userNum1;
        int userNum2;
        int userNum3;
        int userNum4;
        int userNum5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер от 1 до "+range);
        System.out.print("Введите 1-й номер: ");
        userNum1 = scanner.nextInt();

        System.out.print("Введите 2-й номер: ");
        userNum2 = scanner.nextInt();

        System.out.print("Введите 3-й номер: ");
        userNum3 = scanner.nextInt();

        System.out.print("Введите 4-й номер: ");
        userNum4 = scanner.nextInt();

        System.out.print("Введите 5-й номер: ");
        userNum5 = scanner.nextInt();

        Random random = new Random();
        luckyCount = 1;

        for(int i = 0; i < setSize; i++){
            lucky = random.nextInt(range);
            if(luckyCount == 1) {
                lucky1 = lucky;
                luckyCount++;
            } else
            if(luckyCount == 2) {
                lucky2 = lucky;
                luckyCount++;
            } else
            if(luckyCount == 3) {
                lucky3 = lucky;
                luckyCount++;
            } else
            if(luckyCount == 4) {
                lucky4 = lucky;
                luckyCount++;
            } else
            if(luckyCount == 5) {
                lucky5 = lucky;
                luckyCount++;
            }
        }

        System.out.println("Выигрышные номера: "+lucky1+", "+lucky2+", "
                +lucky3+", "+lucky4+", "+lucky5);
        System.out.println("Номера пользователя: "+userNum1+", "+userNum2+", "
                +userNum3+", "+userNum4+", "+userNum5);
    }
}


















