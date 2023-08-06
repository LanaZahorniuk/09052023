package home_work.hw4;

public class Test {
    public static void main(String[] args) {
        Test test = new Test(); // Создание экземпляра класса Test
        test.test();
    }

    public void test(){
int idx = 0;
        idx++;
        idx--;
        idx = idx +1 ;
        idx= -1;
        idx = idx % idx;

        if (idx >= 0) {
            --idx;
        } else {
            idx++;
        }
        System.out.println((double) idx);
    }
}
