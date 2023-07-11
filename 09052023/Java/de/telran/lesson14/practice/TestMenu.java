package de.telran.lesson14.practice;

import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
        runMenu();
    }

    static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Who you are? ");
            System.out.println("1 - Elf");
            System.out.println("2 - Orc");
            System.out.println("q - Exit");
            System.err.print("Make your choice -> ");

            choice = scanner.next().charAt(0);
        } while (choice != '1' && choice != '2' && choice != 'q' && choice != 'Q');
        System.out.println("your choice: " + choice);

    }

}

