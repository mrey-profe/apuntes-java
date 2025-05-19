package harrypotter;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Profesor extends Mago implements Docente {

    private static final String[] FRASES_HARRY_POTTER = {"Non é bo deixarse arrastrar polos soños e esquecer vivir",
        "A valentía sempre é a mellor opción",
        "A felicidade pódese atopar incluso nos momentos máis escuros, se un lembra acender a luz",
        "Polo ben común",
        "Son as nosas escollas as que amosan quen somos realmente, moito máis que as nosas habilidades"};
    private static final String FEITIZO_IMPOSICION_DISCIPLINA = "Silencio Totalis";
    private Random xerador;

    public Profesor(String nome, LocalDate dataNacemento, String tipoEscova) {
        super(nome, dataNacemento, tipoEscova);
        xerador = new Random();
    }

    @Override
    public void imponerDisciplina() {
        System.out.println(FEITIZO_IMPOSICION_DISCIPLINA);
    }

    @Override
    public void explicar() {
        int indiceFrase = xerador.nextInt(FRASES_HARRY_POTTER.length);
        System.out.println(getNome() + " explica: \"" + FRASES_HARRY_POTTER[indiceFrase] + "\"");
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesor de " + getCasa();
    }
}
