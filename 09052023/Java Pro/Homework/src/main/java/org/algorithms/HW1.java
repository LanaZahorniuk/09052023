package org.algorithms;

import java.util.Arrays;

public class HW1 {

        public static void main(String[] args) {
            int [] arr = {10, 345, -65, 67, 345, 67, -65, 2, 8, 34, 2, 34, 10};
            Arrays.sort(arr);
            System.out.println("Отсортированный массив " + Arrays.toString(arr));
            System.out.println(searchBinary(arr,8));

        }

        public static int searchBinary(int [] arr, int key) {
            int first = 0;
            int last = arr.length -1;
            int center = (last - first) / 2; // (12-0)/2=6

            while ( first <= last) {
                if (arr[center] == key) return center;
                if (arr[center] < key) first = center + 1;
                if (arr[center] > key) last = center - 1;
                center = first + (last - first)/2;
            }
            return -1;
        }
}
