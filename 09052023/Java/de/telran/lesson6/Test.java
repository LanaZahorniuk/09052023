package de.telran.lesson6;

public class Test {
    static int myIntStatic;
    public int myIntTest;

    public Test(){
        System.out.println("started Constructor Test()");
        myIntTest = 1;
    }

    public Test(int myInt) {
        System.out.println("started Test(int = myInt)");
        myIntTest = myInt;
    }

    public void run() {
        myIntTest = myIntTest + 2;
        this.myIntTest = this.myIntTest + 2;
        System.out.println("Test -> run()"+myIntTest);
    }
}