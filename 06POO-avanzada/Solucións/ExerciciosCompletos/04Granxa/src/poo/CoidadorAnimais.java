package poo;

import java.time.LocalDate;

/**
 *
 * @author Marta
 */
public class CoidadorAnimais extends Empregado implements Gandeiro {

    private TipoAnimal tipoAnimalExperto;

    public CoidadorAnimais(TipoAnimal tipoAnimalExperto, int numEmpregado, String nome, LocalDate dataInicio, double salarioBase) {
        super(numEmpregado, nome, dataInicio, salarioBase);
        this.tipoAnimalExperto = tipoAnimalExperto;
    }

    @Override
    public void alimentarAnimais() {
        System.out.println("Vou alimentar aos/ás " + tipoAnimalExperto.name());
    }

    @Override
    public void limpiarCortes() {
        System.out.println("Vou limpar as cortes dos/das " + tipoAnimalExperto.name());
    }

    @Override
    public double determinarSalarioReal() {
        double resultado = super.determinarSalarioReal();
        if (tipoAnimalExperto == TipoAnimal.porcos) {
            resultado += 10;
        } else if (tipoAnimalExperto == TipoAnimal.vacas) {
            resultado += 5;
        }
        return resultado;
    }

}
