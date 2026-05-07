package poo;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Marta
 */
public abstract class Empregado {

    private int numEmpregado;
    private String nome;
    private LocalDate dataInicio;
    private double salarioBase;
    private static final double COMPLEMENTO_TRIENIO = 30;

    public Empregado(int numEmpregado, String nome, LocalDate dataInicio, double salarioBase) {
        if (numEmpregado > 0) {
            this.numEmpregado = numEmpregado;
        }
        this.nome = nome;
        if (dataInicio.isBefore(LocalDate.now())) {
            this.dataInicio = dataInicio;
        }
        if (salarioBase > 1000) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 1000;
        }
    }

    public double determinarSalarioReal() {
        Period periodo = Period.between(dataInicio, LocalDate.now());
        int numTrienios = periodo.getYears() / 3;
        return salarioBase + numTrienios * COMPLEMENTO_TRIENIO;
    }

    public int getNumEmpregado() {
        return numEmpregado;
    }

    public void setNumEmpregado(int numEmpregado) {
        this.numEmpregado = numEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
