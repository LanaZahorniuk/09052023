package de.telran.lesson22.practice3;

import java.util.Arrays;

public class StartLottery {
    public static void main(String[] args) {
        int[] userNumbers = Utils.getUserLotteryNumber();
        System.out.print("Номера пользователя: ");
        System.out.println(Arrays.toString(userNumbers));

        LotteryEngine lottery = new LotteryEngine();
        lottery.runLottery();
        int[] winnerNumbers = lottery.getLuckyNumbers();
        System.out.print("Выигрышные номера: ");
        System.out.println(Arrays.toString(winnerNumbers));

        System.out.println("Совпало номеров: "+Utils.compareWinnerNumbers(winnerNumbers, userNumbers));
    }
}
