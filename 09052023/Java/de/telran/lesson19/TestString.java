package de.telran.lesson19;

public class TestString {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s1;
        s3 = s3.intern(); //положили в String Pool

        System.out.println(s1 + " "+s2+" "+s3);

        System.out.println("s1==s2 - " + (s1==s2)); //"s1==s2 - Cat" == "Cat"
        System.out.println("s1==s3 - " + (s1==s3));
        System.out.println("s2==s3 - " + (s2==s3));
        System.out.println("s1==s4 - " + (s1==s4));

        System.out.println("s1.equals(s2) - "+ s1.equals(s2));
        System.out.println("s1.equals(s3) - "+ s1.equals(s3));
        System.out.println("s2.equals(s3) - "+ s1.equals(s3));
    }
}
