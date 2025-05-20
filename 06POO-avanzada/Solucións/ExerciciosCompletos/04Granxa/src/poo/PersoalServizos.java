package poo;

import java.time.LocalDate;

/**
 *
 * @author Marta
 */
public class PersoalServizos extends Empregado {

    private char posto;

    public PersoalServizos(char posto, int numEmpregado, String nome, LocalDate dataInicio, double salarioBase) {
        super(numEmpregado, nome, dataInicio, salarioBase);
        if (posto == 'R' || posto == 'C') {
            this.posto = posto;
        } else {
            this.posto = 'R';
        }
    }

}
