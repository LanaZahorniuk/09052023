package practice.lesson4;

import practice.lesson4.holder.SwitchHolder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(SwitchHolder.hold("Security"));
        System.out.println(SwitchHolder.hold("Password"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("User123"));
        System.out.println(SwitchHolder.hold("Lalalalala"));

        Scanner scanner = new Scanner(System.in);

        String[] answer = SwitchHolder.checkName(scanner.nextLine());
        int index = 0;

        while (true) {
            if (index < answer.length) {
                System.out.println(answer[index]);
                index++;
            } else {
                break;
            }
        }
    }
}
