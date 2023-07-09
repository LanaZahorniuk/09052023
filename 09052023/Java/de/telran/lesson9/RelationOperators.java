package de.telran.lesson9;

public class RelationOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        //Оператор равно ==
        System.out.println("10 == 15 " +(val1 == val2));
        System.out.println("10 == 10 " +(val1 == val4));

        //Оператор не равно !=
        System.out.println("10 != 15 " +(val1 != val2));
        System.out.println("10 != 10 " +(val1 != val4));

        //Оператор больше >
        System.out.println("10 > 15 " +(val1 > val2));
        System.out.println("10 > 10 " +(val1 > val4));
        System.out.println("10 > -5 " +(val1 > val3));

        //Оператор меньше <
        System.out.println("10 < 15 " +(val1 < val2));
        System.out.println("10 < 10 " +(val1 < val4));
        System.out.println("10 < -5 " +(val1 < val3));

        //Оператор >=
        System.out.println("10 >= 15 " +(val1 >= val2));
        System.out.println("10 >= 10 " +(val1 >= val4));
        System.out.println("10 >= -5 " +(val1 >= val3));

        //Оператор <=
        System.out.println("10 <= 15 " +(val1 <= val2));
        System.out.println("10 <= 10 " +(val1 <= val4));
        System.out.println("10 <= -5 " +(val1 <= val3));

        //сравнение разных типов
        double dbVal = 10.5;
        System.out.println("--------------------------");
        System.out.println("val1 10.0 >= dbVal 10.5 "+ (val1 >= dbVal));
        System.out.println("val1 10.0 <= dbVal 10.5 "+ (val1 <= dbVal));

        System.out.println("val1 10.0 >= (int)dbVal 10.5 "+ (val1 >= (int)dbVal));//явное преобразование
        System.out.println("--------------------------");

        //округление
        System.out.println("округление double dbVal = "+ Math.round(dbVal));
        //преобразование
        System.out.println("преобразование double dbVal = "+ (int)dbVal);
    }
}
