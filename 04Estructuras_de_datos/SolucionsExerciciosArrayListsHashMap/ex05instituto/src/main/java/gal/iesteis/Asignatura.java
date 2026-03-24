package gal.iesteis;

public class Asignatura {
    private String nome;
    private int horasSemanais;

    public Asignatura(String nome, int horasSemanais) {
        if (eNomeCorrecto(nome)) {
            this.nome = nome;
        }
        if (eHorasSemanaisCorrectas(horasSemanais)) {
            this.horasSemanais = horasSemanais;
        }
    }

    private boolean eNomeCorrecto(String cadea) {
        return !cadea.isEmpty();
    }

    private boolean eHorasSemanaisCorrectas(int horas) {
        return horas > 0;
    }
}
