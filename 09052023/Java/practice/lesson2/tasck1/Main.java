package practice.lesson2.tasck1;

public class Main {
    public static void main(String[] args) {
        NotMain notMain = new NotMain();
        System.out.println(notMain.size);

        increaseSize(notMain);

        System.out.println(notMain.size);

        NotMain secondNotMain = new NotMain();

        increaseSize(secondNotMain);
        increaseSize(secondNotMain);

        System.out.println("notMain "+notMain.size);
        System.out.println("secondNotMain "+secondNotMain.size);


    }

    private static void increaseSize (NotMain innerNotMain){
        innerNotMain.size++;
        innerNotMain.size = innerNotMain.size + 1;

    }
}
