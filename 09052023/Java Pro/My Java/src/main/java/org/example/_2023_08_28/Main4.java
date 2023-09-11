package org.example._2023_08_28;
/*
складывать значения массива с начала и с конца, двигаясь к середине
*/
public class Main4 {
    public static void main(String[] args) {
        Main4 main = new Main4();
        int[] arr = {15, 45, 4, 78, 29, 4, 84, 74};

        System.out.println(main.sumArray(arr));
        System.out.println(main.sumArraySecond(arr));
        System.out.println(main.returnSum(arr));
    }

    private int sumArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int sum = 0;

        while (left <= right) {
            if (left == right) {
                sum += array[left];
                break;
            } else {
                sum = sum + array[left] + array[right];
                left++;
                right--;
            }
        }
        return sum;
    }

    public int sumArraySecond(int[] array) {
        if (array.length == 0) return 0;

        int sum = 0;
        int length = array.length;
        int counter = 0;

        for (int i = 0; i < length / 2; i++) {
            sum = sum + array[i] + array[length - counter - 1];
            counter++;
        }

        if (length % 2 != 0) {
            sum = sum + array[length - counter - 1];
        }

        return sum;
    }

    public static int returnSum (int[] arr) {
        if (arr.length == 0) return 0;
        int result = 0;

        if (arr.length%2==1){
            result = arr[arr.length/2];
        }

        for (int i = 0; i < arr.length/2; i++) {
            result += arr[i] + arr[arr.length-1-i];
        }
        return result;
    }

}



