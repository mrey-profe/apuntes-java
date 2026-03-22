package gal.iesteis;

import java.util.HashMap;

public class Instituto {
    private String nome;
    private String enderezo;
    private HashMap<Curso, Profesorx> titorxs;

    public Instituto(String nome, String enderezo) {
        if (eNomeCorrecto(nome)) {
            this.nome = nome;
        }
        if (eEnderezoCorrecto(enderezo)) {
            this.enderezo = enderezo;
        }
        this.titorxs = new HashMap<>();
    }

    private boolean eNomeCorrecto(String cadea) {
        return !cadea.isEmpty();
    }

    private boolean eEnderezoCorrecto(String cadea) {
        return !cadea.isEmpty();
    }

    public void engadirTitorx(Curso curso, Profesorx profesorx) {
        if (curso != null && profesorx != null) {
            this.titorxs.put(curso, profesorx);
        }
    }

    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Instituto: ").append(nome).append("\n");
        resultado.append("Enderezo: ").append(enderezo).append("\n");
        resultado.append("Titorxs:\n");
        for (Curso curso : titorxs.keySet()) {
            resultado.append(curso.toString()).append("\n");
            resultado.append("Titorx: ").append(titorxs.get(curso).toString()).append("\n");
        }
        return resultado.toString();
    }
}
