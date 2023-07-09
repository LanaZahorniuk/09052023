package de.telran.lesson4;

public class StackHeap {
    public static void main(String[] args) {
    int myInt1 = 10;
    long myLong = 10L;
    Test test1 = new Test();


    String myStr1 = new String("My String"); // аналогичный способ создания String
    String myStr2 = "My String"; // аналогичный способ создания String
    myStr2 = "Новая строка";
    myStr2 = new String("Новая строка");
        System.out.println(myStr2);
        System.out.println(myStr2.length()); //длина строки
        System.out.println(myStr2.charAt(10)); //получить символ из строки по индексу
        System.out.println(myStr2.charAt(myStr2.length()-1));//получить последний символ из строки по индексу
        System.out.println(myStr2.substring(0,5)); // substring откусывание текста по индексу
        String myStr3 = myStr2.substring(6);
        System.out.println(myStr3);

        System.out.println("My String \n"+myStr3); // \n для переноса на новую строку
        System.out.println("My \t String \n"+myStr3); // \t несколько пробелов поставить



        char c = 'r';
        System.out.println(c);
        System.out.println(Character.hashCode(c));

        c = '\n';
        System.out.println(c);
        System.out.println(Character.hashCode(c));


        /* char d = 'ü';
        System.out.println(d);
        System.out.println(Character.hashCode(d));

        char e = 'ї';
        System.out.println(e);
        System.out.println(Character.hashCode(e)); */












        /* int myInt2 = myInt1; //переменная примитивного типа
        System.out.println(myInt1 + "---------------" + myInt2);
        myInt2 = 20;
        System.out.println(myInt1 + "---------------" + myInt2);

        Test test2 = test1; //переменная объектного типа (не примитивного)
        System.out.println(test1.myIntTest + "---------------" + test2.myIntTest);

        test1.myIntTest = 55;
        System.out.println(test1.myIntTest + "---------------" + test2.myIntTest);

        test2.myIntTest = 99;
        System.out.println(test1.myIntTest + "---------------" + test2.myIntTest);
*/
    }
}
