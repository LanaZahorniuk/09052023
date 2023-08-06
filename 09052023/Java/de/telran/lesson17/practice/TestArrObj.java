package de.telran.lesson17.practice;


public class TestArrObj {
    public static void main(String[] args) {

 // работа со строками
        String[] arrStr = new String[3];
        arrStr[0] = "Строка 1";
        arrStr[2] = "Строка 3";
        System.out.println("------ arrStr --------");
        for (String val:arrStr) System.out.println(val);

        String[] arrStrLiteral = {"Стр1", "Стр2", "Стр3"};
        System.out.println("------ arrStrLiteral --------");
        for (String val:arrStrLiteral) System.out.println(val);

 // работа с объектами
        Pen[] pens = new Pen[3];
        pens[0] = new Pen();
        pens[0].setColor("blue");

        pens[1] = new Pen("red"); // с помощью конструктора в классе Pen

        Pen pen = new Pen("black"); // через объект и переприсвоение ссылки
        pens[2] = pen;

        System.out.println("------ pens --------");
        for (Pen val:pens) System.out.println(val);
        System.out.println(pens[0].getColor());
        System.out.println(pens[1].getColor());
        System.out.println(pens[2].getColor());

//вывод информации о цветах через for
        System.out.println("------ через for --------");
        for (Pen val:pens) System.out.println(val.getColor());

// создаем новый массив через литерал
        Pen[] pensLiteral = {new Pen("yellow"),
                new Pen("green"),};
        System.out.println("------ Literal --------");
        for (Pen val : pensLiteral) System.out.println(val.getColor());

        System.out.println(pensLiteral); // toString
    }
}
