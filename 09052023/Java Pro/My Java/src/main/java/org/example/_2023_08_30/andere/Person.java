package org.example._2023_08_30.andere;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {
    int age;
    String name;
    Dog dog;


    public Person(int age, String name, Dog dog) {
        this.age = age;
        this.name = name;
        this.dog = dog;
    }

    public static void main(String[] args) {
   // тип ссылка = объект конструктор
        Dog dog1 = new Dog("Lab");
        Person person = new Person(25,"Leon", dog1);
        System.out.println(dog1);
        System.out.println(person);

    }
}

class Animal {

}

class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "*** Dog: " + name + " ***";
    }
}

class Cat extends Animal {
    String name;
}


