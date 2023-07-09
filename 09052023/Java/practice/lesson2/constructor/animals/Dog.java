package practice.lesson2.constructor.animals;

public class Dog {

    public String name;

    public Dog(){
        System.out.println("эта конструктор класса Dog");
        System.out.println("объект класса Dog был создан");
    }

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, int age){

    }

}
