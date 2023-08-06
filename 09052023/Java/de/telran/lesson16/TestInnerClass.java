package de.telran.lesson16;

public class TestInnerClass {
    public static void main(String[] args) {
Zoo zoo1 = new Zoo();
        zoo1.open();

        Zoo.Monkey monkey = zoo1.new Monkey();
        monkey.runFood();

        Zoo.Monkey.Banane banane = monkey.new Banane();//new Zoo().new Monkey().new Banane();//zoo1.new Monkey().new Banane();
        banane.getInfo();
    }
}
class Zoo {
    int count = 10; //количество животных
    private String phone = "34567890";
    void open(){
        System.out.println("Zoo open 9 to 18 -> see monkey"+(new Monkey()).name);
    }
    class Monkey { //Вложенный внутренний класс
        String name = "Musya";
        void runFood(){
            System.out.println("Monkey essen and smile."+count+"call for telephone number"+phone);

            class Tail { //Локальные внутренние классы метода
                int length = 4;
                String runHelp(){
                    return (length>3)?"держит хвостом" : "машет хвостом";
                }
            }
            System.out.println((new Tail()).runHelp());
        }

        void runSmile(){
            System.out.println("Smile :) ");
            // new Tail()).runHelp() - не можем использовать в другом методе того же класса
        }

        class Banane { // Вложенный внутренний класс
            String sort = "yellow";

            String getSort(){
                return sort;
            }

            void getInfo(){
                System.out.println(sort+" essen Monkey. it name - "+name);
            }

        }
    }
}
