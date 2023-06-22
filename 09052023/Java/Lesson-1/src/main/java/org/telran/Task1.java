package org.telran;

public class Task1 {
    public static void main(String[] args) {
        int myInt = 3;
        int myInt2 = 10;
        int resultInt = myInt+myInt2;

        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(resultInt);
        System.out.println(myInt+myInt2);
        System.out.println(myInt-myInt2);
        System.out.println(myInt*myInt2);
        System.out.println(myInt2/myInt);
        System.out.println(myInt2%myInt); // остаток от деления

        double resultDouble = (double)myInt2/myInt; //(double) для отображения десятых
        System.out.println(resultDouble);

        /* byte myByte = 66;
        float myFloat = 33.01F; // F для указания десятых в float
        myInt = 3;
        myByte = 88;
        System.out.println(myInt); //отобразить в консоле
        System.out.println(myFloat);
        System.out.print("Hello Lana");
        System.out.println(". 1234567890");
        myInt = 6;
        System.out.println(myInt);
        runFast();*/
    }
static void runFast() {

    System.out.println("Runner!!");
}
}

