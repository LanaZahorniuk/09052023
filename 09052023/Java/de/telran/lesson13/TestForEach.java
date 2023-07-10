package de.telran.lesson13;

public class TestForEach {
    public static void main(String[] args) {
        int [] arr = {1,8,3,4,5};
        for (int val : arr) {
            System.out.println(val);
            if(val == 3) break;
        }
    }
}
