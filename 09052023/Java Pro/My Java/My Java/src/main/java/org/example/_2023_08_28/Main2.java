package org.example._2023_08_28;
/*
найти второе минимальное значение в массиве
*/
public class Main2 {
    public static void main(String[] args) {
        Main2 main = new Main2();
        int[] arr = {15, 45, 4, 78, 29, 4, 84, 74};

        System.out.println(main.returnMinValue(arr));
    }

    public int returnMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
            } else if (array[i] != min && array[i] < min2) {
                min2 = array[i];
            }
        }

        return min2;
    }

}

