package org.example._2023_08_30.extendsExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Ex2 {

    public static void main(String[] args) {

        Men men = new Men("Raymond", 42, 'm', Cat.cat1);

        System.out.println(men);
        System.out.println(Men.men1);
        System.out.println(Men.men2);
        System.out.println(Women.women1);
        System.out.println(Children.children1);

        System.out.println("имя питомца ребенка - " + Children.children1.animal.name);

    }
}

class Human {
    String name;
    int age;
    char gender;
    Animal animal;

    public Human(String name, int age, char gender, Animal animal) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.animal = animal;
    }
}



class Men extends Human {
    public Men(String name, int age, char gender, Animal animal) {
        super(name, age, gender, animal);
    }

    public static Men men1 = new Men("John", 35, 'm', Dog.dog1);
    public static Men men2 = new Men("Alex", 24, 'm',Dog.dog2);

    @Override
    public String toString() {
        return "Men: " + name + ", age - " + age + " *** " + animal;
    }

}

class Women extends Human {
    public Women(String name, int age, char gender, Animal animal) {
        super(name, age, gender, animal);
    }

    public static Women women1 = new Women("Lisa", 25, 'w', Cat.cat2);
    @Override
    public String toString() {
        return "Women: " + name + ", age - " + age + " *** " + animal;
    }
}

class Children extends Human{
    public Children(String name, int age, char gender, Animal animal) {
        super(name, age, gender, animal);
    }

    public static Children children1 = new Children("Billi", 10, 'm', Parrot.parrot1);

    @Override
    public String toString() {
        return "Children: " + name + ", age=" + age + " *** " + animal;
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public static Dog dog1 = new Dog("Bim", 5);
    public static Dog dog2 = new Dog("Jorgee", 13);

    @Override
    public String toString() {
        return "Dog 1: " + name + ", age - " + age;
    }
}



class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    public static Cat cat1 = new Cat ("Tom", 2);
    public static Cat cat2 = new Cat("Luisa", 6);

    @Override
    public String toString() {
        return "Cat: " + name + ", age - " + age;
    }
}



class Parrot extends Animal{
    public Parrot(String name, int age) {
        super(name, age);
    }

    public static Parrot parrot1 = new Parrot("Jacko", 1);

    @Override
    public String toString() {
        return "Parrot: " + name + ", age - " + age;
    }
}



