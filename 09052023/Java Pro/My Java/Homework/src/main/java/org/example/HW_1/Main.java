package org.example.HW_1;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 3, -45, 67, 8, 90, -9, 87, 6, 0};
        Main main = new Main();

        System.out.println(main.findArithmeticMeanPositiveArrayElements(array));
        System.out.println(main.findSumElementsArrayDivisibleThreeAndNotDivisibleFive(array));
        System.out.println(main.findLargestSumElementsArray(array));
    }

    /*
    Найти среднее арифметическое положительных элементов массива.
     */
    public int findArithmeticMeanPositiveArrayElements(int[] array) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                num++;
                sum += array[i];
            }
        }
        return sum / num;
    }


     /*
    Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.
    */

    public int findSumElementsArrayDivisibleThreeAndNotDivisibleFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /*
  Найти в массиве наибольшую сумму подряд идущих элементов.
  */
    public int findLargestSumElementsArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            num = Math.max(array[i], num + array[i]);
            max = Math.max(max, num);
        }
        return max;
    }
}

