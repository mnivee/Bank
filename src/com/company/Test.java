package com.company;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.print();
        bank.kontoErstellen(800);
        bank.kontoErstellen(500);
        bank.printKontos();
        bank.verzinsen();
        bank.printKontos();
    }
}
