package gal.iesteis;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Celtista c1 = new Celtista("Juan", LocalDate.of(1990, 1, 1));
        System.out.println(c1);
        System.out.println("Antigüidade: " + c1.calcularAntiguidade());
        System.out.println("Idade: " + c1.calcularIdade());
        System.out.println("Prezo anual: " + c1.calcularPrezoAnual());

        Celtista c2 = new Celtista(LocalDate.of(2010, 5, 3), "Elena", LocalDate.of(1990, 1, 1));
        System.out.println(c2);
        System.out.println("Antigüidade: " + c2.calcularAntiguidade());
        System.out.println("Idade: " + c2.calcularIdade());
        System.out.println("Prezo anual: " + c2.calcularPrezoAnual());

        try {
            Abono abono = new Abono("Adulto", "Tribuna Alta");
            System.out.println(abono);
            Abonado a = new Abonado("María", LocalDate.of(1995, 5, 5), abono, 100);
            System.out.println(a);
            a.acumularSaldo(10);
            System.out.println("Prezo anual: " + a.calcularPrezoAnual());
            Equipo celta = new Equipo("Celta", 1923, "Balaídos", 30000);
            Abonado a1 = new Abonado("Pedro", LocalDate.of(1985, 3, 15), abono, 50);
            System.out.println(a1);
            System.out.println("Antigüidade: " + a1.calcularAntiguidade());
            System.out.println("Idade: " + a1.calcularIdade());
            System.out.println("Prezo anual: " + a1.calcularPrezoAnual());
            Miudinho m1 = new Miudinho("Lucas", LocalDate.of(2023, 7, 20), a1);
            System.out.println(m1);
            System.out.println("Antigüidade: " + m1.calcularAntiguidade());
            System.out.println("Idade: " + m1.calcularIdade());
            celta.engadarAbono(abono);
            celta.engadarCeltista(c1);
            celta.engadarCeltista(c2);
            celta.engadarCeltista(a);
            celta.engadarCeltista(a1);
            celta.engadarCeltista(m1);
            System.out.println(celta);
        } catch (GradaIncorrectaException | AbonoIncorrectoException e) {
            System.err.println(e.getMessage());
        }


    }
}
