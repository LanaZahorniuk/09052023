package de.telran.lesson21.practice;

public class Accounts {
    static boolean isValidAccountNumber(String accountNumber) {
        if(accountNumber==null || accountNumber.isEmpty())
        return false;

        if(accountNumber.length()!=14)
        return false;

        if(accountNumber.equals("00000000000000"))
            return false;

        return true;
    }
}
