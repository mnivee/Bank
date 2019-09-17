package com.company;

public class Test {
    public static void main(String[] args) {
        Bank ubs = new Bank("UBS", 1890);
        ubs.print();
        ubs.kontoErstellen(800);
        ubs.kontoErstellen(500);
        ubs.printKontos();
        ubs.verzinsen();
        ubs.printKontos();
    }
}