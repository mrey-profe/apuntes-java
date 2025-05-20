package gal.iesteis;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * Representa un celtista con información sobre o seu número de socio,
 * data de ingreso, nome, data de nacemento e outros datos relevantes.
 */
public class Celtista {
    private int numeroSocio;
    private LocalDate dataIngreso;
    private String nome;
    private LocalDate dataNacemento;
    private static int contadorSocios = 0;
    private static final int PREZO_ANUAL = 30;
    private final DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * Construtor que inicializa un novo celtista co seu nome e data de nacemento.
     *
     * @param nome o nome do celtista
     * @param dataNacemento a data de nacemento do celtista
     */
    public Celtista(String nome, LocalDate dataNacemento) {
        this.nome = nome;
        this.dataNacemento = dataNacemento;
        this.numeroSocio = ++contadorSocios;
        this.dataIngreso = LocalDate.now();
    }

    /**
     * Construtor que inicializa un novo celtista co seu número de socio, data de ingreso,
     * nome e data de nacemento.
     *
     * @param dataIngreso a data de ingreso do celtista
     * @param nome o nome do celtista
     * @param dataNacemento a data de nacemento do celtista
     */
    public Celtista(LocalDate dataIngreso, String nome, LocalDate dataNacemento) {
        this.dataIngreso = dataIngreso;
        this.nome = nome;
        this.dataNacemento = dataNacemento;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Celtista celtista)) return false;
        return numeroSocio == celtista.numeroSocio;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroSocio);
    }

    @Override
    public String toString() {
        return "Celtista{" +
                "numeroSocio=" + numeroSocio +
                ", dataIngreso=" + dataIngreso.format(formatoData) +
                ", nome='" + nome + '\'' +
                ", dataNacemento=" + dataNacemento.format(formatoData) +
                '}';
    }

    /**
     * Calcula a antigüidade do celtista dende a súa data de ingreso.
     *
     * @return un obxecto Period que representa a antigüidade do celtista
     */
    public Period calcularAntiguidade() {
        return Period.between(dataIngreso, LocalDate.now());
    }

    /**
     * Calcula a idade do celtista baseada na súa data de nacemento.
     *
     * @return a idade do celtista en anos
     */
    public int calcularIdade() {
        return Period.between(dataNacemento, LocalDate.now()).getYears();
    }

    /**
     * Calcula o prezo anual da membresía do celtista.
     *
     * @return o prezo anual da membresía
     */
    public double calcularPrezoAnual() {
        return PREZO_ANUAL;
    }
}
