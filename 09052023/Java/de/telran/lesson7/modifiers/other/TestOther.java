package de.telran.lesson7.modifiers.other;

public class TestOther {
    public static int intStatic = 5; //можно обратиться с другого пакета но обязательно указать класс
    int intDefault = 1; //не объявляется. Доступен в том же классе и пакете, в котором определен.

    public int intPublic = 2; // доступен во всех классах вашего приложения

    private int intPrivate = 3; //доступен только внутри класса, в котором он определен.

    protected int intProtected = 4; //доступен в классе, в котором он определен, и в его подклассах


    public void testMethod(){
        System.out.println("Я testMethod() в классе TestOther");
        System.out.println(intDefault);
        System.out.println(intPublic);
        System.out.println(intPrivate);
        System.out.println(intProtected);
    }
}
