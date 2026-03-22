package gal.iesteis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Curso {
    private String nivel;
    private char letra;
    private ArrayList<Alumnx> alumnxs;
    private HashMap<Asignatura, Profesorx> asignaturas;
    private static String[] NIVEIS = {"1ºESO", "2ºESO", "3ºESO", "4ºESO", "1ºBAC", "2ºBAC", "1ºFPB", "2ºFPB", "1ºCFGM", "2ºCFGM", "1ºCFGS", "2ºCFGS"};

    public Curso(String nivel, char letra) {
        if (eNivelValido(nivel)) {
            this.nivel = nivel;
        }
        if (eLetraValida(letra)) {
            this.letra = letra;
        }
        this.alumnxs = new ArrayList<>();
        this.asignaturas = new HashMap<>();
    }

    private boolean eNivelValido(String nivel) {
        for (String n : NIVEIS) {
            if (n.equals(nivel)) {
                return true;
            }
        }
        return false;
    }

    private boolean eLetraValida(char letra) {
        return letra >= 'A' && letra <= 'Z';
    }

    public void engadirAlumnx(Alumnx alumnx) {
        if (alumnx != null) {
            this.alumnxs.add(alumnx);
        }
    }

    public void engadirAsignatura(Asignatura asignatura, Profesorx profesorx) {
        if (asignatura != null && profesorx != null) {
            this.asignaturas.put(asignatura, profesorx);
        }
    }

    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Curso: ").append(nivel).append(letra).append("\n");
        resultado.append("Alumnxs:\n");
        for (Alumnx alumnx : alumnxs) {
            resultado.append(alumnx).append("\n");
        }
        return resultado.toString();
    }
}
