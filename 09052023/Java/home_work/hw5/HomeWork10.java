package home_work.hw5;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год -> ");
        int year = scanner.nextInt();

        if (year <= 1584) {
            System.err.println("введите год не менее чем 1584, так как именно в этот год было введено понятие високосных лет в григорианском календаре. ");
        } if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }
    }
}
//Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.
