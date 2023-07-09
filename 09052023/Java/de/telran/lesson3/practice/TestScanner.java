package de.telran.lesson3.practice;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {

        // целое число
        Scanner myScanner = new Scanner(System.in);
        int myInt;
        System.out.print("Input number = ");
        myInt = myScanner.nextInt();
        System.out.println("Output number = "+myInt);

        // строка
        Scanner myScannerString = new Scanner(System.in);
        String myStr;
        System.out.print("Input string = ");
        myStr = myScannerString.nextLine();
        System.out.println("Output string = "+myStr);

        // boolean - только true или false
        Scanner myScannerBoolean = new Scanner(System.in);
        boolean myBool;
        System.out.print("Input boolean = ");
        myBool = myScannerBoolean.nextBoolean();
        System.out.println("Output string = "+myBool);

        // long
        Scanner myScannerLong = new Scanner(System.in);
        long myLong;
        System.out.print("Input long = ");
        myLong = myScannerLong.nextLong();
        System.out.println("Output long = "+myLong);

        // double
        Scanner myScannerDouble = new Scanner(System.in);
        double myDouble;
        System.out.print("Input double format(XX,X) = ");
        myDouble = myScannerDouble.nextDouble();
        System.out.println("Output long = "+myDouble);

        // char
        Scanner myScannerChar = new Scanner(System.in);
        char ch;
        System.out.print("Input char = ");
        myStr = myScannerString.nextLine();
        ch = myStr.charAt(0);
        System.out.println("Output s = "+ch);

    }

}
