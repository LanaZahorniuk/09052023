package de.telran.lesson6;

public class TestConstructor {
    public static void main(String[] args) {

        int myInt;
        myInt = 15;

        Test myTest;
        myTest = new Test();
        System.out.println(myTest.myIntTest);
        myTest.run();

        Test myTestWithParametr = new Test(22);
        System.out.println(myTestWithParametr.myIntTest);

        outString("передаваемая строка ");
        String myStr = "Hello Lana!";
        outString(myStr);
        outToValue(myStr, 10);
        outToValue("передаваемая строка ", myInt);

    }

    static void outString(String inStr){
        String localStr = inStr.toLowerCase(); //нижний регистр
        System.out.println("Our string ->  "+inStr);
        System.out.println("localStr ->  "+localStr);
    }

    static void outToValue(String inStr, int intInt){
        String localStr = inStr.toUpperCase(); //верхний регистр
        System.out.println("Our string ->  "+inStr);
        System.out.println("Our number ->  "+intInt);
        System.out.println("localStr ->  "+localStr); //нижний регистр
    }
}
