package de.telran.lesson16;

public class TestClass {
    public static void main(String[] args) {
/*        Box box1; //null
        box1 = new Box(); //box1 объект класса Box
        box1.width = 5;  //объект это "изделие" на основе "чертежа"
        box1.height = 10;
        box1.length = 3;
        System.out.println(box1.calcVolume());*/

        Box box2 = new Box(5,4,3); //box2 объект класса Box
        System.out.println(box2.calcVolume());//без параметров присвяевается значение null

    }
}

    class Box { //класс - это "чертеж"
        int width, height, length; //переменные принадлежащие классу


        //конструктор
        public Box() {
        }

        public Box(int width, int height, int length){ // конструктор формирует объект
            this.width = width; //через this обращаемся к переменным класса Box
            this.height = height;
            this.length = length;
        }

        // метод
        int calcVolume() { //метод
            return width * height * length;
        }

        void create(int width, int height, int length) { //метод
            System.out.println("Создана коробка объемом - " + calcVolume());
        }
    }

