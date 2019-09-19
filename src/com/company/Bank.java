package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    static double zinsSatz = 0.01;
    private List<Konto> kontos = new ArrayList<>();


    public Konto kontoErstellen(int saldo) {
        Konto konto = new Konto(saldo);
        kontos.add(konto);
        return konto;
    }

    public void verzinsen() {
        for (int i = 0; i < kontos.size(); i++) {
            kontos.get(i).verzinsen(Bank.zinsSatz);
        }
    }

    public void printKontos() {
        for (Konto konto : kontos) {
            konto.print();
        }
    }

    public String toString() {
        return "Zins-Satz: " + zinsSatz;
    }

    void print() {
        System.out.println(toString());
    }


}
