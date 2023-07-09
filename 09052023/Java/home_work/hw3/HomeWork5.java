package home_work.hw3;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое слово: ");
        String firstWord = scanner.nextLine();

        System.out.println("введите второе слово: ");
        String secondWord = scanner.nextLine();

        if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
            int halfFirstWord = firstWord.length() / 2;
            int halfSecondWord = secondWord.length() / 2;

            String result = firstWord.substring(0, halfFirstWord) + secondWord.substring(halfSecondWord);
            System.out.println("Результат: " + result);
        } else {
            System.err.println("Ей, введённые вами слова содержат нечётное количество букв!");
        }
    }
}


//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв
// (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова.
// распечатать на консоль.
