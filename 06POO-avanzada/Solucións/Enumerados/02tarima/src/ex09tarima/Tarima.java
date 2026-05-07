/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex09tarima;

/**
 *
 * @author marta
 */
public enum Tarima {
    CARBALLO(40),
    SAPELLY(50),
    NOGUEIRA(60),
    CERDEIRA(70),
    BAMBU(100);
    
    private double prezoCaixa;

    private Tarima(double prezoCaixa) {
        this.prezoCaixa = prezoCaixa;
    }

    public double getPrezoCaixa() {
        return prezoCaixa;
    }
    
    public double importePagar(int numCaixas) {
        return prezoCaixa * numCaixas;
    }
}
