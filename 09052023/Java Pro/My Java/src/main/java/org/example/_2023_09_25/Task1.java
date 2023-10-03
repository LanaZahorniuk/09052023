/* package org.example._2023_09_25;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {



    }

    private static boolean isPalindrome(String word) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }
        ListIterator<Character> listForward = list.listIterator();
        ListIterator<Character> listBack = list.listIterator(list.size());

        while (listForward.hasNext() && listBack.hasPrevious()){
            char start = listForward.next();
            char and = listBack.previous();
        }
    }
} */
