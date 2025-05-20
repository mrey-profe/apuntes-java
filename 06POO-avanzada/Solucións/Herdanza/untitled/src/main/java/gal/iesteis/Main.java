package gal.iesteis;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asalariado> asalariados = new ArrayList<>();
        ArrayList<ConsultorExterno> consultoresExternos = new ArrayList<>();

        Asalariado asalariado1 = new Asalariado(1, "Juan", LocalDate.of(1990, 1, 1), 2000);
        asalariados.add(asalariado1);
        Asalariado asalariado2 = new Asalariado(2, "Ana", LocalDate.of(1995, 5, 5), 2500);
        asalariados.add(asalariado2);
        Asalariado asalariado3 = new Asalariado(3, "Pedro", LocalDate.of(1985, 10, 10), 3000);
        asalariados.add(asalariado3);

        System.out.println(asalariado1.equals(asalariado2));

        ConsultorExterno consultor1 = new ConsultorExterno(4, "Luis", LocalDate.of(1988, 3, 3));
        consultoresExternos.add(consultor1);
        ConsultorExterno consultor2 = new ConsultorExterno(5, "Maria", LocalDate.of(1992, 7, 7));
        consultoresExternos.add(consultor2);
        ConsultorExterno consultor3 = new ConsultorExterno(6, "Carlos", LocalDate.of(1980, 12, 12));
        consultoresExternos.add(consultor3);

        double prezoHoraExtra = 20;
        double prezoHoraConsultor = 100;

        for (Asalariado asalariado : asalariados) {
            asalariado.setHorasExtra(10); // Simulamos que se traballaron 10 horas extra
            asalariado.calcularSalarioFinal(prezoHoraExtra);
            System.out.println(asalariado);
        }

        for (ConsultorExterno consultor : consultoresExternos) {
            consultor.setHorasTraballadas(20); // Simulamos que se traballaron 20 horas
            consultor.calcularSalarioFinal(prezoHoraConsultor);
            System.out.println(consultor);
        }

        ArrayList<Traballador> traballadores = new ArrayList<>(asalariados); //Inicializamos cos asalariados
        traballadores.addAll(consultoresExternos); //Engadimos os consultores externos
        double salarioTotal = 0;
        for (Traballador traballador : traballadores) {
            if (traballador instanceof Asalariado) {
                salarioTotal += ((Asalariado) traballador).getSalarioFinal();
            } else if (traballador instanceof ConsultorExterno) {
                salarioTotal += ((ConsultorExterno) traballador).getSalarioFinal();
            }
        }
        System.out.println("Salario total da empresa: " + salarioTotal);
    }
}
