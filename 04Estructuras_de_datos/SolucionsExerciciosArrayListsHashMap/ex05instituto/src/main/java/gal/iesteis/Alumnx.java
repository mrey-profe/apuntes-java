package gal.iesteis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alumnx {
    private String nome;
    private String apelidos;
    private LocalDate dataNacemento;

    public Alumnx(String nome, String apelidos, LocalDate dataNacemento) {
        if (eNomeCorrecto(nome)) {
            this.nome = nome;
        }
        if (eNomeCorrecto(apelidos)) {
            this.apelidos = apelidos;
        }
        if (eDataCorrecta(dataNacemento)) {
            this.dataNacemento = dataNacemento;
        } else {
            this.dataNacemento = LocalDate.now();
        }
    }

    private boolean eDataCorrecta(LocalDate dataNacemento) {
        return dataNacemento.isBefore(LocalDate.now());
    }

    private boolean eNomeCorrecto(String cadea) {
        return !cadea.isEmpty();
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Alumnx: " + nome + " " + apelidos + " - Data de nacemento: " + dataNacemento.format(formato);
    }
}
