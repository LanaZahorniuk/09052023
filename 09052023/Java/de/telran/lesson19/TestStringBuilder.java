package de.telran.lesson19;

public class TestStringBuilder {
    public static void main(String[] args) {
        String s1 = "Auto";
        System.out.println(s1);
        s1 = s1+" BMW";
        System.out.println(s1);


        StringBuilder sb1 = new StringBuilder("Auto");
        System.out.println(sb1);
        sb1.append(" BMW");
        System.out.println(sb1);
        sb1.append(" m5");
        System.out.println(sb1);
        sb1.append(" 25");
        System.out.println(sb1);
        System.out.println("capacity = "+sb1.capacity());
        System.out.println("length = "+sb1.length());

        StringBuffer sBuf = new StringBuffer("Auto");
        System.out.println(sBuf);

        sBuf.append(" Wolkswagen Golf");
        System.out.println(sBuf);

        sBuf.append(" 33");
        System.out.println(sBuf);

        System.out.println("capacity = "+sBuf.capacity());
        System.out.println("length = "+sBuf.length());

        sBuf.insert(5, "BF ");
        System.out.println(sBuf);

        char[] charBf = new char[10];
        sBuf.getChars(8, 18, charBf, 0);
        System.out.println(charBf);
    }
}
