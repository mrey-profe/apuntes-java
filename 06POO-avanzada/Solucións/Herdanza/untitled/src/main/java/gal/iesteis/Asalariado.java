package gal.iesteis;

import java.time.LocalDate;

public class Asalariado extends Traballador {
    private double salarioFinal;
    private int horasExtra;

    public Asalariado(int id, String nome, LocalDate dataNacemento, double salarioBase) {
        super(id, nome, dataNacemento, salarioBase);
        this.salarioFinal = salarioBase;
        this.horasExtra = 0;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void calcularSalarioFinal(double prezoHoraExtra) {
        salarioFinal = super.getSalarioBase() + (horasExtra * prezoHoraExtra);
    }

    @Override
    public String toString() {
        return "Asalariado{" +
                "id=" + super.getId() +
                ", nome='" + super.getNome() + '\'' +
                ", dataNacemento=" + super.getDataNacemento() +
                ", salarioBase=" + super.getSalarioBase() +
                ", salarioFinal=" + salarioFinal +
                ", horasExtra=" + horasExtra +
                '}';
    }
}
