package home_work.hw2;

public class HomeWork3 {
    public static void main(String[] args) {
// Создайте строку через new - I study Basic Java!
        String myString = new String("I study Basic Java!");
        receptionString(myString);

//Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println(myString.charAt(myString.length() - 2));


//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        boolean containsJava = containsString(myString, "Java");
        System.out.println(containsJava);


//Вырезать строку Java c помощью метода String.substring().
        System.out.println(myString.substring(0, 14)+myString.substring(18));


//Заменить все символы “а” на “о”.
        String changeString = replaceCharacters(myString, 'a', 'o');
        System.out.println(changeString);

//Преобразуйте строку к верхнему регистру.
        String uppercaseString = convertToUppercase(myString);
        System.out.println(uppercaseString);

//Преобразуйте строку к нижнему регистру.
        String lowercaseString = convertToLowerCase(myString);
        System.out.println(lowercaseString);
    }

//Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку
    public static void receptionString(String input) {
        System.out.println(input);
    }

 // метод String.contains()
    public static boolean containsString(String input, String substring) {
        return input.contains(substring);
    }

//Заменить все символы “а” на “о”.
    public static String replaceCharacters(String input, char oldChar, char newChar) {
        return input.replace(oldChar, newChar);
    }

//Преобразуйте строку к верхнему регистру.
    public static String convertToUppercase(String input) {
        return input.toUpperCase();
    }

//Преобразуйте строку к нижнему регистру.
    public static String convertToLowerCase(String input) {
        return input.toLowerCase();
    }

}
