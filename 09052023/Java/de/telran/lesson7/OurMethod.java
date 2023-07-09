package de.telran.lesson7;

public class OurMethod {
    public static void main(String[] args) {
        sumConsole(1, 2); //вызов метода
        sumConsole(10, 25);
        sumConsole(10,25 * 2 +30); // 10+(25*2)+30=90

        int sum = sumReturnResult(12,3); //обращаемся к static int sumReturnResult(int arg1, int arg2) - 26 строка
        System.out.println(sum);
        System.out.println(sumReturnResult(10,25)); //это тоже самое что строки 8,9

   int sumTwoMethods = sumReturnResult(2,6) - sumReturnResult(17,8);
        sumTwoMethods = sumTwoMethods+10;
        sumTwoMethods = sumTwoMethods*2;
        System.out.println(sumTwoMethods);
    }

    static void sumConsole(int arg1, int arg2) { //метод sumConsole. void ничего не отдаёт выполняет запрос внутри себя
        int sum = arg1 + arg2;
        //String sOut = "Sum = " +sum;
        //System.out.println(sOut);   //это тоже самое что строка 17
        System.out.println("Sum = " + sum);
    }

    static int sumReturnResult(int arg1, int arg2) { // метод sumReturnResult. int возвращаемое значение
        int sum = arg1 + arg2;
        return sum; //для возвращения результата
    }
}
