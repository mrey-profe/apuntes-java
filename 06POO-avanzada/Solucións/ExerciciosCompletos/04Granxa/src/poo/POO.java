package poo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Marta
 */
public class POO {

    public static void main(String[] args) {
        CoidadorAnimais c1 = new CoidadorAnimais(TipoAnimal.porcos, 0, "Pepe", LocalDate.of(2002, Month.MARCH, 2), 1500);
        CoidadorAnimais c2 = new CoidadorAnimais(TipoAnimal.galiñas, 1, "Ana", LocalDate.of(2020, Month.SEPTEMBER, 3), 1400);
        CoidadorAnimais c3 = new CoidadorAnimais(TipoAnimal.vacas, 2, "Helena", LocalDate.of(2019, Month.OCTOBER, 4), 1700);
        PersoalServizos p1 = new PersoalServizos('R', 5, "Alba", LocalDate.of(2017, Month.JANUARY, 5), 1550);
        PersoalServizos p2 = new PersoalServizos('C', 5, "Ainara", LocalDate.of(2021, Month.FEBRUARY, 6), 1550);
        
        Granxa g = new Granxa("Avicola de Fornelos", "Fornelos de Montes", c3);
        g.engadirEmpregado(c1);
        g.engadirEmpregado(c2);
        g.engadirEmpregado(c3);
        g.engadirEmpregado(p1);
        g.engadirEmpregado(p2);
        g.engadirAnimal(TipoAnimal.vacas);
        g.engadirAnimal(TipoAnimal.porcos);
        g.engadirAnimal(TipoAnimal.porcos);
        g.engadirAnimal(TipoAnimal.porcos);
        g.engadirAnimal(TipoAnimal.porcos);
        g.engadirAnimal(TipoAnimal.coellos);
        g.engadirAnimal(TipoAnimal.ovellas);
        
        System.out.println(g);
        
        for (Empregado e : g.getEmpregados()) {
            System.out.println(e.getNome() + " cobra " + e.determinarSalarioReal());
        }
        
    }

}
