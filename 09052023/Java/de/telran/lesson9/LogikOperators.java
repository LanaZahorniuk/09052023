package de.telran.lesson9;

public class LogikOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        System.out.println("10 < 15 " +(val1 < val2));
        System.out.println("10 == 10 " +(val1 == val4));

        // AND &&
        System.out.println("10 < 15 && 10 == 10 "+ ((val1 < val2) && (val1 == val4)));
        System.out.println("10 < 15 && 10 == -5 "+ ((val1 < val2) && (val1 == val3)));
        System.out.println("10 < 15 && 10 == 10 && 10 > -5 "+ ((val1 < val2) && (val1 == val4) && (val1 > val3)));
        System.out.println("------------------------------");

        // ИЛИ ||
        System.out.println("10 < 15 || 10 == 10 "+ ((val1 < val2) || (val1 == val4)));
        System.out.println("10 < 15 || 10 == -5 "+ ((val1 < val2) || (val1 == val3)));
        System.out.println("10 < 15 || 15 == 10 || 10 > -5 "+ ((val1 < val2) || (val2 == val4) || (val1 > val3)));
        System.out.println("10 > 15 || 15 == 10 || 10 <= -5 "+ ((val1 > val2) || (val2 == val4) || (val1 <= val3)));
        System.out.println("------------------------------");

        // NOT !
        System.out.println("10 < 15 "+ (val1 < val2));
        System.out.println("!(10 < 15) "+ !(val1 < val2)); //меняем истину на ложь
        System.out.println("!(10 > 15) "+ !(val1 > val2)); // меняем ложь на истину
        System.out.println("!(10 < 15 && 10 == 10 && 10 > -5) "
                + !((val1 < val2) && (val1 == val4) && (val1 > val3))); //меняем true на false




    }
}
