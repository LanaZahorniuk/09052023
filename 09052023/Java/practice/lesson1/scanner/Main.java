package practice.lesson1.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // выводит то, что вводится на клавиатуре
        System.out.println("This is from keyboard - " + scanner.nextLine());
    }
}
