package gal.iesteis;

import java.time.LocalDate;

public class Miudinho extends Celtista {
    private Abonado adultoAsociado;
    private static final double PREZO_MIUDINHO = 0;

    /**
     * Construtor que inicializa un novo miudinho co seu nome, data de nacemento e
     * adulto asociado.
     *
     * @param nome           o nome do miudinho
     * @param dataNacemento a data de nacemento do miudinho
     * @param adultoAsociado o adulto asociado ao miudinho
     */
    public Miudinho(String nome, LocalDate dataNacemento, Abonado adultoAsociado) {
        super(nome, dataNacemento);
        this.adultoAsociado = adultoAsociado;
    }

    /**
     * Construtor que inicializa un novo miudinho co seu nome, data de nacemento e
     * adulto asociado.
     *
     * @param dataIngreso    a data de ingreso do miudinho
     * @param nome           o nome do miudinho
     * @param dataNacemento a data de nacemento do miudinho
     * @param adultoAsociado o adulto asociado ao miudinho
     */
    public Miudinho(LocalDate dataIngreso, String nome, LocalDate dataNacemento, Abonado adultoAsociado) throws IdadeIncorrectaException {
        super(dataIngreso, nome, dataNacemento);
        if (super.calcularIdade() < 5) {
            throw new IdadeIncorrectaException("O miudinho ten que ter menos de 5 anos");
        }
        this.adultoAsociado = adultoAsociado;
    }

    /**
     * Método que devolve o pago que ten que realizar o miudinho.
     *
     * @return o prezo anual do miudinho
     */
    @Override
    public double calcularPrezoAnual() {
        return PREZO_MIUDINHO;
    }

    @Override
    public String toString() {
        return "Miudinho{" +
                "Datos do celtista=" + super.toString() +
                "adultoAsociado=" + adultoAsociado +
                '}';
    }
}
