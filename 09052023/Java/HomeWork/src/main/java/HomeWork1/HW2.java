package HomeWork1;

// Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5

public class HW2 {
    public static void main(String[] args) {
        int myInt = 345;
        System.out.println(myInt / 100);
        System.out.println((myInt % 100) - 41);
        System.out.println(myInt % 10);

        System.out.println("Число 345 -> "+(myInt / 100)+","+((myInt % 100) - 41)+","+(myInt % 10));
    }
}
