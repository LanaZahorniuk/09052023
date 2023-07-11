package home_work.hw5;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите инфо. который сейчас час (от 1 до 24) ... ");
        int time = scanner.nextInt();

        int startEdeka = 8;
        int endEdeka = 21;
        boolean isEdekaOpen = (time >= startEdeka && time <= endEdeka);
        if (!isEdekaOpen) {
            System.err.println("Edeka закрыта :(");
        } else {
            System.out.println("Edeka открыта :)");
        }

        int startRewe = 8;
        int endRewe = 23;
        boolean isReweOpen = (time >= startRewe && time <= endRewe);
        if (!isReweOpen) {
            System.err.println("Rewe закрыт :(");
        } else {
            System.out.println("Rewe открыт :)");
        }
        boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);
    }

    public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}

/*
Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
Реализует логический метод canBuy,  возвращающий boolean
Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
Отобразите строку «Я могу купить еду, это ……» и значение.
*/
