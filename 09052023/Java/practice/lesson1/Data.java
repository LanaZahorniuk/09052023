package practice.lesson1;

class Data {
    public int count = 500;
    public static int secondCount = 1000;

    // public void example() { // void ничего нам не отдает
    public String example() {
        String myName = "Lana";
        System.out.println("эта переменная вызвана из функции myName");

        return myName;
    }

    public String secondExample(){
        return "это значение переменной экземпляра count: " + count;
    }

    public static void staticExample(){
        System.out.println("вызов переменной из статической функции");
        System.out.println(secondCount);
    }
}