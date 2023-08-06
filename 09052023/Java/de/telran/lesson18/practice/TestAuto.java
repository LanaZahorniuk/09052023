package de.telran.lesson18.practice;

import java.util.Arrays;
import java.util.Comparator;

public class TestAuto {
    public static void main(String[] args) {
        Car[] cars = {  new Car(30000, "BMW"),
                        new Car(20000, "Wolkswagen Golf"),
                        new Car(50000, "Tesla"),
                        new Car(15000, "Nissan Leaf")};
        System.out.println("Наш массив без сортировки = " + cars.length);
        for (Car car : cars) System.out.println(car); //напечатать массив


// Компаратор через анонимный класс
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (o1.getPrice() < o2.getPrice()) ? -1 : ((o1.getPrice() == o2.getPrice()) ? 0 : 1);
            }
        };
        Arrays.sort(cars, comparator);
        System.out.println("После стандартной сортировки по цене: ");
        for (Car car : cars) System.out.println(car); //напечатать массив

// Компаратор через функциональный интерфейс
        Arrays.sort(cars, (o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        System.out.println("После стандартной сортировки модели: ");
        for (Car car : cars) System.out.println(car); //напечатать массив


//Сортируем по цене утилитным методом
        Utils.sortBubblePrice(cars);
        System.out.println("После сортировки по цене: ");
        for (Car car : cars) System.out.println(car); //напечатать массив

//Сортируем по первой букве модели утилитным методом
        Utils.sortBubbleName(cars);
        System.out.println("После сортировки по марке: ");
        for (Car car : cars) System.out.println(car); //напечатать массив
    }
}
