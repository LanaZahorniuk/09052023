package de.telran.lesson3.practice;

public class PracticeMain {

    static int myValueClass = 3;
    // экземпляр класса, для того чтобы обратиться к
    // нему в любом участке кода


    public static void main(String[] args) {
        int myInt2 = 2; // локальная переменная
        our();
        System.out.println(myInt2);
        System.out.println(myValueClass+1);

        Test myTest = new Test();  // переменная объектного типа
        myTest.run();
        System.out.println(myTest.myIntTest + " - " + Test.myIntStatic);
        Test.myIntStatic = 999;

        Test myTest1 = new Test();
        myTest1.myIntTest = 88;
        System.out.println(myTest1.myIntTest + " - " + Test.myIntStatic);

        Test myTest2 = new Test();
        myTest2.myIntTest = 99;
        System.out.println(myTest2.myIntTest + " - " + Test.myIntStatic);

        System.out.println(myTest.myIntTest + " - " + Test.myIntStatic);
    }
   static void  our() { // метод
        int myInt = 1; // локальная переменная
       System.out.println("I method our()");
       System.out.println(myInt);
       System.out.println(myValueClass+2);
   }
}
