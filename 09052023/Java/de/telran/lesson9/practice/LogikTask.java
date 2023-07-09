package de.telran.lesson9.practice;

public class LogikTask {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=0;

        // False in if
        if(( a < b ) && (b == c)) { //1<2 && 2==3
            d = a+b+c;
            System.out.println("Summa d = "+d);
        }
        else {
            System.out.println("False! ");
        }

        // True in if
        if(( a < b ) || (b == c)) { //1<2 || 2==3
            d = a+b+c;
            System.out.println("Summa d = "+d);
        }
        else {
            System.out.println("False! ");
        }
        }
    }

