package practice.lesson2.constructor.animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("начало работы программы");



        Dog namrlessDog = new Dog();

        System.out.println(namrlessDog.name);
        System.out.println("-------------------------------");

        Dog sharik = new Dog("Шарик");
        System.out.println(sharik.name);

        System.out.println("конец работы программы");
    }
}
