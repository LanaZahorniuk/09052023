package de.telran.lesson21.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {



    @Test
    void isValidAccountNumber_length14() {
        String badAccount1Less14 = "123456789";
        String badAccount2More14 = "123456789123456789";
        assertFalse(Accounts.isValidAccountNumber(badAccount1Less14));
        assertFalse(Accounts.isValidAccountNumber(badAccount2More14));
    }

    @Test
    void isValidAccountNumber_allNumberNot0() {
        String badAccountAll0 = "00000000000000";
        assertFalse(Accounts.isValidAccountNumber(badAccountAll0));
    }

    @Test
    void isValidAccountNumber_notNull_notEmpty() {
        assertFalse(Accounts.isValidAccountNumber(null));
        assertFalse(Accounts.isValidAccountNumber(""));
    }

    @Test
    void isValidAccountNumber_correct() {
        String goodAccount = "12345678912345";
        assertTrue(Accounts.isValidAccountNumber(goodAccount));
    }
}