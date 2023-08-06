package de.telran.lesson17;

import java.util.Arrays;
import java.util.Random;

public class TestArray {
    int elemClass;

    public static void main(String[] args) {
        int [] arrInt; // null
        arrInt = new int [10]; // первый вариант
        for (int val : arrInt) System.out.println(val); // foreach

        Random random = new Random();
        for (int i=0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(100); //arrInt[0], arrInt[1]...
            System.out.println("arrInt [" + i + "] = " + arrInt[i]);
        }

        arrInt[5] = 333; // явное изменение
        arrInt[arrInt.length-1] = 999; // явное изменение
        for (int val : arrInt) System.out.println(val);// foreach

        System.out.println("--------------  arrInt размер 15 ---------------");

        // ручное увеличение массива до 15 того же массива arrInt
        arrInt = copyArray(arrInt,15);
        for (int val : arrInt) System.out.println(val); // val значение элемента массива

        System.out.println("-----------  arrInt размер 20 ---------------");

        // аналогичное увеличение массива на 20 с помощью библиотечной функции copyOf
        arrInt = Arrays.copyOf(arrInt, 20);
        for (int val : arrInt) System.out.println(val);


        // копирование массива в другой объект

        //библиотечным методом
        int[]newArrInt = Arrays.copyOf(arrInt, arrInt.length); // для создания копии массмва, создаст такойже массив

        //ручным методом
        int[] newArrInt1 = copyArray(arrInt, arrInt.length);



        System.out.println("***************  newArrInt  ********************");
        for(int val : newArrInt) System.out.println(val);

        for (int i=0; i<newArrInt.length; i++) newArrInt[i] = -1;  //меняем все значения на -1 в копии
        System.out.println("***************  newArrInt -1 (это копия) ********************");
        for(int val : newArrInt) System.out.println(val);

        System.out.println("--------------- arrInt -- оригинал --------------------------");
        for (int val : arrInt) System.out.println(val); //foreach  val - значение элемента массива

// сортировка
        System.out.println("--------------- arrInt -- сортировка --------------------------");
        Arrays.sort(arrInt);
        for (int val : arrInt) System.out.println(val);


       /* String [] arrString  = new String[5];
        for (String val : arrString) System.out.println(val); // foreach

        int [] arrIntInt = {88,2,3,4,5,6,7}; // литерал массива- new int[7] = ...
        for (int val : arrIntInt) System.out.println(val); // foreach


        System.out.println(arrInt);*/
    }

    // копирование массива в массив большего размера
    static  int [] copyArray (int [] oldArr, int newSize) {
        if(oldArr.length>newSize) return null;

        int [] newArr = new int [newSize];
        for (int i=0; i<oldArr.length; i++) newArr[i] = oldArr[i];
        return newArr;
    }
}
