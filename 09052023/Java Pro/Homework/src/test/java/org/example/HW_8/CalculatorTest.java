package org.example.HW_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    void addTest() {
        int a = 5;
        int b = 2;
        int expected = 7;
        Assertions.assertEquals(expected, calc.add(a,b));
    }

    @Test
    void subtractTest() {
        int a = 5;
        int b = 2;
        int expected = 3;
        Assertions.assertEquals(expected, calc.subtract(a,b));
    }

    @Test
    void multiplyTest() {
        int a = 5;
        int b = 2;
        int expected = 10;
        Assertions.assertEquals(expected, calc.multiply(a,b));
    }

    @Test
    void dividePositiveTest() {
        int a = 10;
        int b = 2;
        int expected = 5;
        Assertions.assertEquals(expected, calc.divide(a,b));
    }

    @Test
    void divideByZeroTest() {
        int a = 10;
        int b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(a,b));
    }

    @Test
    void powerTest() {
        double a = 10;
        double b = 2;
        double expected = 100;
        Assertions.assertEquals(expected, calc.power(10,2));
    }

    @Test
    void factorialPositiveTest() {
        int f = 0;
        long expected = 1;
        Assertions.assertEquals(expected, calc.factorial(0));

    }

    @Test
    void factorialNegativeTest() {
        int f = -2;
        Assertions.assertThrows(ArithmeticException.class, () -> calc.factorial(f));
    }

    @Test
    void isEvenPositiveTest() {
        int n1 = 2;
        int n2 = 1;
        boolean expected1 = true;
        boolean expected2 = false;
        Assertions.assertEquals(expected1, calc.isEven(2));
        Assertions.assertEquals(expected2, calc.isEven(1));
    }

    @Test
    void findMaxTest() {
        int [] a = {1,2,3,4,-5};
        int expected = 4;
        Assertions.assertEquals(expected, calc.findMax(a));
    }

    @Test
    void isPrimeTest() {
        int a = 1;
        int b = 211;
        boolean expected1 = false;
        boolean expected2 = true;
        Assertions.assertEquals(expected1, calc.isPrime(a));
        Assertions.assertEquals(expected2, calc.isPrime(211));
    }

    @Test
    void toBaseStringPositiveTest() {
        int a = 10;
        int b = 2;
        int c = 8;
        int d = 16;
        String expected1 = String.valueOf(1010);
        String expected2 = String.valueOf(12);
        String expected3 = String.valueOf('a');
        Assertions.assertEquals(expected1, calc.toBaseString(a,b));
        Assertions.assertEquals(expected2, calc.toBaseString(a,c));
        Assertions.assertEquals(expected3, calc.toBaseString(a,d));
    }

    @Test
    void toBaseStringNegativeTest(){
        int a = 10;
        int b = 1;
        int c = 18;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.toBaseString(a,b));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.toBaseString(a,c));
    }

    @Test
    void sqrtPositiveTest() {
        double a = 9;
        double expected = 3;
        Assertions.assertEquals(expected, calc.sqrt(a));
    }

    @Test
    void sqrtNegativeTest() {
        double a = -20;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sqrt(a));
    }

    @Test
    void reverseStringTest() {
        String str = "Start";
        String expected = "tratS";
        Assertions.assertEquals(expected, calc.reverseString(str));
    }

    @Test
    void isPalindromeTest() {
        String str1 = "ротор";
        String str2 = "статор";
        boolean expected1 = true;
        boolean expected2 = false;
        Assertions.assertEquals(expected1, calc.isPalindrome(str1));
        Assertions.assertEquals(expected2, calc.isPalindrome(str2));
    }

    @Test
    void gcdTest() {
        int a = 18;
        int b = 24;
        int expected = 6;
        Assertions.assertEquals(expected, calc.gcd(a,b));

    }

    @Test
    void productOfArrayTest() {
        int [] p = {10, 20, 30};
        int expected = 6000;
        Assertions.assertEquals(expected, calc.productOfArray(p));
    }

    @Test
    void lengthOfLongestWordTest() {
        String str = "Wo ist meine Reisekrankenversicherung?";
        int expected = 25;
        Assertions.assertEquals(expected, calc.lengthOfLongestWord(str));

    }

    @Test
    void celsiusToFahrenheitTest() {
        double c = 232.778;
        double expected = 451.0004;
        Assertions.assertEquals(expected, calc.celsiusToFahrenheit(c));
    }

    @Test
    void containsSubstringTest() {
        String m = "Wo ist meine Reisekrankenversicherung?";
        String s = "meine";
        boolean expected = true;
        Assertions.assertEquals(expected, calc.containsSubstring(m,s));

    }

    @Test
    void sumOfDigitsTest() {
        int a = 245;
        int expected = 11;
        Assertions.assertEquals(expected, calc.sumOfDigits(a));
    }

    @Test
    void isLeapYearPositiveTest() {
        int y = 2023;
        boolean expected = false;
        Assertions.assertEquals(expected, calc.isLeapYear(y));
    }

    @Test
    void isLeapYearNegativeTest() {
        int y = 1580;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.isLeapYear(y));
    }
}
