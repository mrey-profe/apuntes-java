package harrypotter;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Muggle extends Persoa {
    private boolean creNaMaxia;

    public Muggle(String nome, LocalDate dataNacemento) {
        super(nome, dataNacemento);
        creNaMaxia = false;
    }

    public Muggle(String nome, LocalDate dataNacemento, boolean creNaMaxia) {
        super(nome, dataNacemento);
        this.creNaMaxia = creNaMaxia;
    }

    @Override
    public boolean eMaiorIdade() {
        return calcularIdade() >= 18;
    }

    @Override
    public String toString() {
        return "Muggle: " + getNome() + ", " + calcularIdade() + " anos, cre na maxia: " + creNaMaxia;
    }
}

