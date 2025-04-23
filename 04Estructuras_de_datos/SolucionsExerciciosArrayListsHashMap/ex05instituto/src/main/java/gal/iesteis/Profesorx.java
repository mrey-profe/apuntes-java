package gal.iesteis;

public class Profesorx {
    private String nome;
    private String especialidade;


    public Profesorx(String nome, String especialidade) {
        if (eNomeCorrecto(nome)) {
            this.nome = nome;
        }
        if (eEspecialidadeCorrecta(especialidade)) {
            this.especialidade = especialidade;
        }
    }

    private boolean eNomeCorrecto(String cadea) {
        return !cadea.isEmpty();
    }

    public boolean eEspecialidadeCorrecta(String cadea) {
        return !cadea.isEmpty();
    }

    public String toString() {
        return "Profesorx: " + nome + " - Especialidade: " + especialidade;
    }
}
