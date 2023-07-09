package de.telran.lesson12;

import java.util.Scanner;

public class WorkDayOrDayOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWrite the day of the week - ");
        String outNameDay = getNameWorkDayOrDayOff(scanner.nextInt());
        System.out.println("day status *** " + outNameDay);

    }

    static String getNameWorkDayOrDayOff(int dayOfWeek) {
        //проверка числа на диапазон 1...7
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Not correct  " + dayOfWeek);
            return "Day of Week mast be 1 to 7";
        }
        // анализ на рабочий день или выходной
        String nameDayOfWeek = "";
        switch (dayOfWeek) {
            case 1: // аналог (dayOfWeek==1 || dayOfWeek==2 || dayOfWeek==3 ...)
            case 2:
            case 3:
            case 4:
            case 5: {nameDayOfWeek = "working day"; break;}
            case 6:
            case 7: {nameDayOfWeek = "day off"; break;} //аналог (dayOfWeek==6 || dayOfWeek==7)
            default: nameDayOfWeek = "Not correct";
        }
        return nameDayOfWeek;
    }
}
