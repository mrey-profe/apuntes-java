package org.example;

public class Main {
    public static void main(String[] args) {
        double[][] notas = {
                {1.0, 9.5, 8.0, 7.0, 6.0, 5.5, 4.0, 3.5},
                {9.0, 8.5, 7.5, 6.0, 5.0, 4.5, 3.0, 2.5},
                {8.0, 7.5, 6.5, 5.0, 4.0, 3.5, 2.0, 9.7},
                {7.0, 6.5, 5.5, 4.0, 3.0, 2.5, 1.0, 0.5},
                {6.0, 5.5, 4.5, 3.0, 2.0, 1.5, 0.3, 7.5},
                {5.0, 4.5, 3.5, 2.0, 1.0, 0.5, 9.0, 8.5},
                {4.0, 3.5, 2.5, 1.0, 0.7, 7.5, 6.0, 5.5},
                {3.0, 2.5, 1.5, 0.8, 9.0, 8.5, 7.0, 6.5},
                {2.0, 1.5, 0.5, 9.0, 8.0, 7.5, 6.0, 5.5},
                {9.8, 5, 9.0, 8.5, 7.0, 6.5, 5.0, 5}
        };

        System.out.printf("Media curso (valor): %.2f\n", OperacionsArrays.calcularMediaPorIndices(notas));
        System.out.printf("Media curso(indices): %.2f\n", OperacionsArrays.calcularMediaPorValor(notas));

        double[] mediaAlumnado = OperacionsArrays.mediaAlumnado(notas);
        System.out.println("Media alumnado: ");
        for (double media : mediaAlumnado) {
            System.out.printf("%.2f ", media);
        }

        double[] mediaModulos = OperacionsArrays.mediaModulos(notas);
        System.out.println("\nMedia módulos: ");
        for (double media : mediaModulos) {
            System.out.printf("%.2f ", media);
        }

        System.out.println("\nNúmero de aprobados: " + OperacionsArrays.numeroAprobados(notas));
        System.out.println("Número de suspensos: " + OperacionsArrays.numeroSuspensos(notas));

        System.out.println("Nota máxima: " + OperacionsArrays.mellorNota(notas));
        System.out.println("Nota mínima: " + OperacionsArrays.peorNota(notas));

        System.out.println("Número de alumnos aprobados: " + OperacionsArrays.numeroAlumnosTodoAprobado(notas));
    }
}