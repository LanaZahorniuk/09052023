package de.telran.lesson12;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        int currentTime, start1, end1, start2, end2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Старт работы первого магазина: ");
        start1 = scanner.nextInt(24);
        System.out.print("окончание работы первого магазина: ");
        end1 = scanner.nextInt(24);
        System.out.print("Старт работы второго магазина: ");
        start2 = scanner.nextInt(24);
        System.out.print("окончание работы второго магазина: ");
        end2 = scanner.nextInt(24);

        System.out.println("введите текущее время");
        currentTime = scanner.nextInt(24);

        workingShop1(start1, end1, currentTime);
        workingShop2(start2, end2, currentTime);
    }
    static void workingShop1(int start, int end, int currentTime){
String outMessage;
        if(currentTime >= start && currentTime<=end)
            outMessage = "первый магазин работает";
        else  outMessage = "первый магазин не работает";
        System.out.println(outMessage);
    }
    //тернарный оператор
    static void workingShop2(int start, int end, int currentTime){
        String outMessage = (currentTime>=start && currentTime<=end) ? "второй магазин работает"  : "второй магазин не работает";
        System.out.println(outMessage);
    }
}
