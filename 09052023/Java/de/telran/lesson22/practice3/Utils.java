package de.telran.lesson22.practice3;

import java.util.Scanner;

public class Utils {
    public static int[] getUserLotteryNumber() {
        Scanner scanner = new Scanner(System.in);
        int [] userNumbers = new int[Constants.COUNT_SET_SIZE];
        for(int i=0; i < Constants.COUNT_SET_SIZE; i++){
            do {
               System.out.print("Введите" +(i+1)+ "-й номер: ");
                userNumbers[i] = scanner.nextInt();
            } while (userNumbers[i] <= 0 || userNumbers[i] > 50); // чтобы не вводить более 50
        }
        return userNumbers;
    }

    public static int compareWinnerNumbers(int[] lotteryNumbers, int[] userNumbers) {
       int count = 0;
        for(int valUser : userNumbers) {
            for(int valLottery : lotteryNumbers){
                if(valUser == valLottery) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
