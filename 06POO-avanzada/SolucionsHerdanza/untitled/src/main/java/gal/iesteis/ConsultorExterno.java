package gal.iesteis;

import java.time.LocalDate;

public class ConsultorExterno extends Traballador {
    private double salarioFinal;
    private int horasTraballadas;

    public ConsultorExterno(int id, String nome, LocalDate dataNacemento) {
        super(id, nome, dataNacemento, 0);
        this.salarioFinal = 0;
        this.horasTraballadas = 0;
    }

    public int getHorasTraballadas() {
        return horasTraballadas;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setHorasTraballadas(int horasTraballadas) {
        this.horasTraballadas = horasTraballadas;
    }

    public void calcularSalarioFinal(double prezoHora) {
        salarioFinal = horasTraballadas * prezoHora;
    }

    @Override
    public String toString() {
        return "ConsultorExterno{" +
                "id=" + super.getId() +
                ", nome='" + super.getNome() + '\'' +
                ", dataNacemento=" + super.getDataNacemento() +
                ", salarioFinal=" + salarioFinal +
                ", horasTraballadas=" + horasTraballadas +
                '}';
    }
}
