package org.example._2023_08_30.enumExample.bank;

public class BankAccount {
    long numAccount;
    String nameOwner;
    String lastNameOwner;
    StatusAccount status;

    public BankAccount(long numAccount, String nameOwner, String lastNameOwner, StatusAccount status) {
        this.numAccount = numAccount;
        this.nameOwner = nameOwner;
        this.lastNameOwner = lastNameOwner;
        this.status = status;
    }


    public long getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(long numAccount) {
        this.numAccount = numAccount;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getLastNameOwner() {
        return lastNameOwner;
    }

    public void setLastNameOwner(String lastNameOwner) {
        this.lastNameOwner = lastNameOwner;
    }

    public StatusAccount getStatus() {
        return status;
    }

    public void setStatus(StatusAccount status) {
        this.status = status;
    }
}

