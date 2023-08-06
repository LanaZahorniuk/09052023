package de.telran.lesson21.practice;

public class TestAccount {
    public static void main(String[] args) {
        String badAccount = "123456712345671234567";
        System.out.println("Account = "+badAccount+" is "
                +Accounts.isValidAccountNumber(badAccount));

        String goodAccount = "12345671234567";
        System.out.println("Account = "+goodAccount+" is "
                +Accounts.isValidAccountNumber(goodAccount));
    }
}
