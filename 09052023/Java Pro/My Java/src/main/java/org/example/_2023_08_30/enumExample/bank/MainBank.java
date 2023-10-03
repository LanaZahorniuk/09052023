package org.example._2023_08_30.enumExample.bank;

import org.example._2023_08_30.enumExample.bank.BankAccount;

import java.util.Arrays;

public class MainBank {
    public static void main(String[] args) {
        BankAccount account001 = new BankAccount(780121345,
                "Lana",
                "Zahorniuk",
                StatusAccount.ACTIVE);
        BankAccount account002 = new BankAccount(789012345,
                "Lara",
                "Kroft",
                StatusAccount.BLOCKED);
        BankAccount account003 = new BankAccount(789087445,
                "Leon",
                "Sharp",
                StatusAccount.CLOSED);
        BankAccount account004 = new BankAccount(780333345,
                "Ludwig",
                "Wallow",
                StatusAccount.ACTIVE);
        BankAccount account005 = new BankAccount(789018355,
                "Ada",
                "Bingo",
                StatusAccount.ACTIVE);
        BankAccount account006 = new BankAccount(780347445,
                "Lidia",
                "Kun",
                StatusAccount.CLOSED);
        BankAccount account007 = new BankAccount(789366445,
                "Paulo",
                "Carl",
                StatusAccount.BLOCKED);

       BankAccount bankAccountArr[] = {account001, account002, account003,account004, account005, account006,account007};
        for (BankAccount account : bankAccountArr) {
            if (account.getStatus() == StatusAccount.ACTIVE) {
                System.out.println(account.lastNameOwner + " " + account.nameOwner);
            }
        }

        StatusAccount status = StatusAccount.valueOf("ACTIVE"); // получает значение
        System.out.println("valueOf " + status);



        StatusAccount[] statusAccounts = StatusAccount.values(); //возвращает массив который содержит все элементы enum
        System.out.println(Arrays.toString(statusAccounts));
    }
}
