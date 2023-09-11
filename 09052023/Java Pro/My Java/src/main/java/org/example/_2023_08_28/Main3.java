package org.example._2023_08_28;
/*
сложить значения четных индексов массива, сложить значения не четных индексов массива, и вычесть разницу
*/
public class Main3 {

    public static void main(String[] args) {
        Main3 main = new Main3();
        int[] arr = {15, 45, 4, 78, 29, 4, 84, 74}; /*132-201=-69*/

        System.out.println(main.sumArray(arr));
    }

    public int sumArray(int[] array) {
        int sumOdd = 0;
        int sumEven = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + array[i];
            } else {
                sumOdd = sumOdd + array[i];
            }
        }

        sum = sumEven - sumOdd;

        return sum;
    }

}
