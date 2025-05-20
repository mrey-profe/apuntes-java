package gal.iesteis;

import java.time.LocalDate;
import java.util.Objects;

public class Traballador {
    private int id;
    private String nome;
    private LocalDate dataNacemento;
    private double salarioBase;

    public Traballador(int id, String nome, LocalDate dataNacemento, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.dataNacemento = dataNacemento;
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(LocalDate dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Traballador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNacemento=" + dataNacemento +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Traballador that)) { // Comproba se o obxecto é do mesmo tipo e fai un cast
            return false;
        }
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
