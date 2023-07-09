package de.telran.lesson9;

public class UnaryOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 20;

        System.out.println("Сумма 2х чисел = "+ (val1 + val2));

        System.out.println("Постфиксный Инкремент числа = "+ val1++); //унарная операция инкрементов val1 = val1 + 1;

        System.out.println("Постфиксный Диекремент числа = "+ val2--); //унарная операция декрементов val2 = val2 - 1;

        System.out.println("Префиксный Инкремент числа = "+ (++val1)); //унарная операция инкрементов val1 = val1 + 1;

        System.out.println("Префиксный Декремент числа = "+ (--val2)); //унарная операция декрементов val2 = val2 - 1;


        val1++;
        System.out.println("Печать числа "+ val1);


        System.out.println("меняем число на противоположное значение = " + -val1); // унарный минус
        System.out.println("ещё раз меняем число на противоположное значение = " + (-val1));// унарный минус
        int val3 = -val1;
        System.out.println("val3 = " +val3);
        int val4 = -val3;
        System.out.println("val4 = " +val4);
    }
}
