package de.telran.lesson12;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the day of the week - ");
        String outNameDay = getNameDayOfWeekIfElse(scanner.nextInt());
        System.out.println("day of the week *** "+outNameDay);
        System.out.println("-------------------------------");

        System.out.print("\nWrite the day of the week - ");
        outNameDay = getNameDayOfWeekIfElseSwitchCase(scanner.nextInt());
        System.out.println("day of the week *** "+outNameDay);
    }

    static String getNameDayOfWeekIfElse(int dayOfWeek) {
        if(dayOfWeek<=0 || dayOfWeek>7){
            System.out.println("Not correct  "+dayOfWeek);
            return "Day of Week mast be 1 to 7";
        }
        String nameDayOfWeek = "";
        if(dayOfWeek==1) nameDayOfWeek="Monday";
        else if(dayOfWeek==2) nameDayOfWeek="Tuesday";
        else if(dayOfWeek==3) nameDayOfWeek="Wednesday";
        else if(dayOfWeek==4) nameDayOfWeek="Thursday";
        else if(dayOfWeek==5) nameDayOfWeek="Friday";
        else if(dayOfWeek==6) nameDayOfWeek="Saturday";
        else if(dayOfWeek==7) nameDayOfWeek="Sunday";
        else nameDayOfWeek="Not correct";

        return nameDayOfWeek;
    }

    static String getNameDayOfWeekIfElseSwitchCase(int DayOfWeek){
        if(DayOfWeek<=0 || DayOfWeek>7){
            System.out.println("Not correct  "+DayOfWeek);
            return "Day of Week mast be 1 to 7";
        }
        String nameDayOfWeek = "";
        switch (DayOfWeek){
            case 1: {nameDayOfWeek="Monday"; break;}
            case 2: {nameDayOfWeek="Tuesday"; break;}
            case 3: {nameDayOfWeek="Wednesday"; break;}
            case 4: {nameDayOfWeek="Thursday"; break;}
            case 5: {nameDayOfWeek="Friday"; break;}
            case 6: {nameDayOfWeek="Saturday"; break;}
            case 7: {nameDayOfWeek="Sunday"; break;}
            default:nameDayOfWeek="Not correct";
        }
        return nameDayOfWeek;
    }
}
