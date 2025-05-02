package gal.iesteis;

import java.time.LocalDate;

public class Abonado extends Celtista {
    private Abono abono;
    private double saldoAcumulado;

    /**
     * Construtor que inicializa un novo abonado co seu nome, data de nacemento,
     * abono e saldo acumulado.
     *
     * @param nome           o nome do abonado
     * @param dataNacemento a data de nacemento do abonado
     * @param abono         o abono do abonado
     * @param saldoAcumulado o saldo acumulado do abonado
     */
    public Abonado(String nome, LocalDate dataNacemento, Abono abono, double saldoAcumulado) {
        super(nome, dataNacemento);
        this.abono = abono;
        this.saldoAcumulado = saldoAcumulado;
    }

    /**
     * Construtor que inicializa un novo abonado co seu nome, data de nacemento,
     * abono e saldo acumulado.
     *
     * @param dataIngreso   a data de ingreso do abonado
     * @param nome           o nome do abonado
     * @param dataNacemento a data de nacemento do abonado
     * @param abono         o abono do abonado
     * @param saldoAcumulado o saldo acumulado do abonado
     */
    public Abonado(LocalDate dataIngreso, String nome, LocalDate dataNacemento, Abono abono, double saldoAcumulado) {
        super(dataIngreso, nome, dataNacemento);
        this.abono = abono;
        this.saldoAcumulado = saldoAcumulado;
    }

    /**
     * Método que devolve o abono do abonado.
     *
     * @return o abono do abonado
     */
    @Override
    public double calcularPrezoAnual() {
        return Math.max(abono.getPrezoAbono() - saldoAcumulado, 0);
    }

    /**
     * Método que devolve o saldo acumulado do abonado.
     *
     * @return o saldo acumulado do abonado
     */
    public void acumularSaldo(double saldo) {
        this.saldoAcumulado += saldo;
    }

    @Override
    public String toString() {
        return "Abonado{" +
                "Datos do celtista=" + super.toString() +
                "abono=" + abono +
                ", saldoAcumulado=" + saldoAcumulado +
                '}';
    }
}
