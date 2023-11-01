package org.example.HW_8;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.add(2,5)); //7
        System.out.println(calc.subtract(10,3)); //7
        System.out.println(calc.multiply(10,10)); //100
        System.out.println(calc.divide(21,3)); //7
        System.out.println(calc.power(10, 2)); //100
        System.out.println(calc.factorial(6)); //720
        System.out.println(calc.isEven(7)); //false

        int [] arr = {10,-20,100,5};
        System.out.println(calc.findMax(arr)); //100

        System.out.println(calc.isPrime(5)); //true
        System.out.println(calc.toBaseString(100,16)); //64
        System.out.println(calc.sqrt(144)); //12
        System.out.println(calc.reverseString("Hallo World!"));
        System.out.println(calc.isPalindrome("заказ")); //true
        System.out.println(calc.gcd(100,8)); //4

        int [] arr2 = {3,4,46,6,5,6};
        System.out.println(calc.productOfArray(arr2)); //99360

        System.out.println(calc.lengthOfLongestWord("Willkommensveranstaltung für Neubürgerinnen und Neubürger"));
        System.out.println(calc.celsiusToFahrenheit(25)); //77
        System.out.println(calc.containsSubstring("Willkommensveranstaltung für Neubürgerinnen und Neubürger", "für"));
        System.out.println(calc.sumOfDigits(111)); //3
        System.out.println(calc.isLeapYear(2024)); //true
    }
}
