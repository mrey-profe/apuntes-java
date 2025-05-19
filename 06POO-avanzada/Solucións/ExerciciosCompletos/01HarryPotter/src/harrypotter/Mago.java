package harrypotter;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Mago extends Persoa {

    private String tipoEscova;
    private Casa casa;

    public Mago(String nome, LocalDate dataNacemento, String tipoEscova) {
        super(nome, dataNacemento);
        this.tipoEscova = tipoEscova;
        casa = null;
    }

    public String getTipoEscova() {
        return tipoEscova;
    }

    public void setTipoEscova(String tipoEscova) {
        this.tipoEscova = tipoEscova;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    @Override
    public boolean eMaiorIdade() {
        return calcularIdade() >= 17;
    }

    @Override
    public String toString() {
        String infoCasa = (casa == null) ? "sen casa asignada" : casa.name();
        return "Mago: " + getNome() + ", " + calcularIdade() + " anos, tipo de escoba: " + tipoEscova + ", casa: " + infoCasa;
    }
}
