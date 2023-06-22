package org.telran.praktika;

public class Test {
    public static void main(String[] args) {
        char myChar = 'R';
        byte myByte = 1;
        short myShort = 2;
        int myInt = 3;
        long myLong = 4;

        float myFloat = 5.0f;
        double myDouble = 6.0;

        String myStr = "My String";

        System.out.println("myChar = " +myChar); //    sout на консоль
        System.out.println("myByte = " +myByte);
        System.out.println("myShort = " +myShort);
        System.out.println("myInt = " +myInt);
        System.out.println("myLong = " +myLong);

        System.out.println("myFloat = " +myFloat);
        System.out.println("myDouble = " +myDouble);

        System.out.println("myStr = " +myStr);

        System.out.println("myStr = " +myStr + ", myLong = " +myLong);

        System.out.print("myStr = " +myStr);
        System.out.println(", myLong = " +myLong);
    }
}
