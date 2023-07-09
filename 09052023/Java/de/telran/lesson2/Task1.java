package de.telran.lesson2;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Hello Lana");
        System.out.println(". 1234567890");

        int myInt = 3;
        int myInt2 = 10;
        int resultInt = myInt + myInt2;

        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(resultInt);


        System.out.println(myInt + myInt2);
        System.out.println(myInt - myInt2);
        System.out.println(myInt * myInt2);
        System.out.println(myInt2 / myInt);
        System.out.println(myInt2 % myInt); // остаток от деления


        double resultDouble = (double)myInt2 / myInt; //(double) для отображения десятых
        System.out.println(resultDouble);

        double myDouble = 3.0;
        double myDouble2 = 7;
        System.out.println(myDouble2 / myDouble);


        runFast(); // вызов метода


        int myInt3 = 1;
        byte myByte = 66;
        float myFloat = 33.01F; // F для указания десятых в float
        System.out.println(myInt3); //отобразить в консоле
        System.out.println(myFloat);


        myInt = 6;
        System.out.println(myInt);

    }
    static void runFast() {  // метод. метод это действие
        System.out.println("Runner!!!");
    }
}

/*
boolean - Логический тип данных представляет только (true, false) - один бит информации: либо истина, либо ложь
byte - представляет собой число (-128 to 127) - 8 bits.
short - представляет собой число (-32 768 до 32 767) – 16 bits
int - представляет собой число (-2147483648 до 2147483647) – 32 bits.
long – большое целое число (-9223372036854775808 до 9223372036854775807) – 64 bits.
float - число с плавающей запятой (до 7 десятичных цифр) – 32 bits.
double - число с плавающей запятой (до 16 десятичных цифр) – 64 bits.
char - символ Unicode (от '\u0000' (0) до '\uffff' (65535)) – 16 bits.
 */