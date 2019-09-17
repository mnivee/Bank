package com.company;

import java.util.UUID;

public class Konto {
    private int saldo = 0;
    private String iban;

    public Konto(int startKapital) {
        saldo = startKapital;
        iban = UUID.randomUUID().toString();
    }

    public void verzinsen(double zinsSatz) {
        this.saldo += saldo * zinsSatz;
    }

    public String toString() {
        return "IBAN: " + iban + " | Saldo: " + saldo;
    }

    public void print() {
        System.out.println(toString());
    }

    public int getSaldo() {
        return saldo;
    }
}
