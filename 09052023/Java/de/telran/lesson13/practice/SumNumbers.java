package de.telran.lesson13.practice;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println("Сумма чисел от 0 = "+ sumMaxNumbers(3,4));
    }

    static int sumMaxNumbers(int num1, int num2) {
        int sum = 0;
        int maxNumber = (num1 > num2) ? num1 : num2;
        //аналог
        /* if(numb1 > numb2) maxNumb = numb1;
        else maxNumb = numb2;*/
        for (int val = 1; val <= maxNumber; val++) sum += val; // sum = sum + val;
        return sum;
    }
}
