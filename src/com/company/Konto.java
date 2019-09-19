package com.company;

import java.util.UUID;

public class Konto {
    private int saldo = 0;

    public Konto(int einzahlen) {
        saldo = einzahlen;
    }

    public void verzinsen(double zinsSatz) {
        this.saldo += saldo * zinsSatz;
    }

    public String toString() {
        return "Saldo: " + saldo;
    }

    public void print() {
        System.out.println(toString());
    }

    public int getSaldo() {
        return saldo;
    }
}
