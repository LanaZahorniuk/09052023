package de.telran.lesson22.practice3;

import java.util.Random;

public class LotteryEngine {
    private int[] luckyNumbers = new int[Constants.COUNT_SET_SIZE];

    public int[] getLuckyNumbers() {
        return luckyNumbers;
    }

    public void runLottery(){

        int range = 50; //интервал
        int lucky; // счасливое число
        int luckyCount; //угаданное кол-во номеров

        Random random = new Random();
        luckyCount = 1;

        for(int i = 0; i < Constants.COUNT_SET_SIZE; i++){
            lucky = random.nextInt(range);
            switch (luckyCount){
                case 1 :
                    luckyNumbers[0] = lucky;
                    luckyCount++;
                    break;
                case  2 :
                    if(luckyNumbers[0] != lucky) { // чтобы не генерил одинаковые числа
                        luckyNumbers[1] = lucky;
                        luckyCount++;
                    }
                    break;
                case  3 :
                    if(luckyNumbers[0] != lucky && luckyNumbers[1] != lucky) {
                        luckyNumbers[2] = lucky;
                        luckyCount++;
                    }
                    break;
                case  4 :
                    if(luckyNumbers[0] != lucky && luckyNumbers[1] != lucky && luckyNumbers[2] != lucky) {
                        luckyNumbers[3] = lucky;
                        luckyCount++;
                    }
                    break;
                case  5 :
                    if(luckyNumbers[0] != lucky && luckyNumbers[1] != lucky && luckyNumbers[2] != lucky && luckyNumbers[3] != lucky) {
                        luckyNumbers[4] = lucky;
                        luckyCount++;
                    }
            }
        }
    }
}
