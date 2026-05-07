package harrypotter;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author usuario
 */
public abstract class Persoa {

    private String nome;
    private LocalDate dataNacemento;

    public Persoa(String nome, LocalDate dataNacemento) {
        this.nome = nome;
        this.dataNacemento = dataNacemento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNacemento() {
        return dataNacemento;
    }

    public abstract boolean eMaiorIdade();

    protected int calcularIdade() {
        LocalDate hoxe = LocalDate.now();
        Period periodo = Period.between(dataNacemento, hoxe);
        return periodo.getYears();
    }
}

