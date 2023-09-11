package org.example._2023_08_28;
/*
найти минимальное значение в массиве
*/
public class Main1 {
    public static void main(String[] args) {
        int[] arr = {15, 45, 4, 78, 29, 4, 84, 74};
        Main1 main = new Main1();
        System.out.println(main.returnMin(arr));
    }

    public int returnMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]){
                min = arr[i];
            }
        }
        return min;
    }

}




