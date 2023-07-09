package practice.lesson3;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите первое слово");
        String firstWord = scanner.nextLine();

        System.out.println("введите второе слово");
        String secondWord = scanner.nextLine();

        if(firstWord.length() % 2 !=0) { //если делится число без остатка
            System.err.println("firstWord не четное");
        } else if (secondWord.length() % 2 !=0) {
            System.err.println("secondWord не четное");
        } else {
            System.out.println(
                    cutTwoWordsInHalfAndMerge(firstWord,secondWord)
            );
        }

    }

    public static String cutTwoWordsInHalfAndMerge(String firstWord, String secondWord){
        String firstHalf = firstWord.substring(0, firstWord.length()/2);
        String secondHalf = secondWord.substring(0, secondWord.length()/2);
        return firstHalf + secondHalf;
    }
}
