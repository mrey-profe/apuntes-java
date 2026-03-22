package org.example;

public class Main {
    public static void main(String[] args) {
        String[] galego = {"xaneiro", "febreiro", "marzo", "abril", "maio", "xuño", "xullo", "agosto", "setembro", "outubro", "novembro", "decembro"};
        String[] english = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};

        for (int i = 0; i < galego.length; i++) {
            System.out.println(galego[i] + " - " + english[i]);
        }
    }
}