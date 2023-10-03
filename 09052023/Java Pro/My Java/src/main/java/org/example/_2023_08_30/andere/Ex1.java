package org.example._2023_08_30.andere;

public class Ex1 {

    static String string;

    @Override
    public String toString() {
        return "Ex1{" +
                "age=" + age +
                '}';
    }

    int age;
    public static void main(String[] args) {
        string = "String";
        new Ex1().age = 10;

        System.out.println(new Ex1().toString());

    }
}
