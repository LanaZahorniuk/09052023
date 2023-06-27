package practice.lesson1;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        System.out.println(data.count);


        System.out.println(data.example());
        System.out.println(data.secondExample());
        System.out.println(data.secondCount);

        Data.staticExample(); // вызов переменной из статической функции
    }
}
