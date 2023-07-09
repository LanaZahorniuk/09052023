package practice.lesson3.TestExample;

public class TestExample {
    public static int sum (int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public static void positiveSumTest() {
        int currantResult = sum(15, 21);
        int expectResult = 36;

        if (currantResult == expectResult) System.out.println("test was successful");
        else System.out.println("test was unsuccessful");
    }
    //}
    //public static void assertNumberEquals(int currentNumber, int expectedNumber) {
    //  if (currentNumber == expectedNumber) System.out.println("This numbers are equal");
    //else {
    //System.err.println("This number aren't equal \n");
    //System.out.println();
    //  System.err.println("Current: " + currentNumber);
    //    System.err.println("Expected: " + expectedNumber);
    //  }

}
