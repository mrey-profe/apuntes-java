package org.example;

public class OperacionsArrays {
    public static double calcularMediaPorIndices(double[][] notas) {
        double suma = 0;
        int contador = 0;

        // Percorrido por índices
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
                contador++;
            }
        }

        return suma / contador;
    }

    public static double calcularMediaPorValor(double[][] notas) {
        double suma = 0;
        int contador = 0;

        // Percorrido por valores
        for (double[] alumno : notas) {
            for (double nota : alumno) {
                suma += nota;
                contador++;
            }
        }

        return suma / contador;
    }

    public static double[] mediaAlumnado(double[][] notas) {
        double[] medias = new double[notas.length];

        for (int f = 0; f < notas.length; f++) { //Para cada un dos alumnos
            double suma = 0;
            for (double nota : notas[f]) { //Para cada unha das súas notas
                suma += nota;
            }
            medias[f] = suma / notas[f].length;
        }
        return medias;
    }

    public static double[] mediaModulos(double[][] notas) {
        double[] medias = new double[notas[0].length];

        for (int c = 0; c < notas[0].length; c++) { //Para cada un dos módulos (todos os alumnos teñen o mesmo número de módulos)
            double suma = 0;
            for (int f = 0; f < notas.length; f++) { //Para cada un dos alumnos
                suma += notas[f][c]; //Os índice póñense ao revés da orde dos bucles porque se percorre por columnas
            }
            medias[c] = suma / notas.length;
        }
        return medias;
    }

    public static int numeroAprobados(double[][] notas) {
        int contador = 0;
        for (double[] alumno : notas) {
            for (double nota : alumno) {
                if (nota >= 5.0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int numeroSuspensos(double[][] notas) {
        int contador = 0;
        for (double[] alumno : notas) {
            for (double nota : alumno) {
                if (nota < 5.0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double mellorNota(double[][] notas) {
        double maximo = 0;
        for (double[] alumno : notas) {
            for (double nota : alumno) {
                if (nota > maximo) {
                    maximo = nota;
                }
            }
        }
        return maximo;
    }

    public static double peorNota(double[][] notas) {
        double minimo = 10;
        for (double[] alumno : notas) {
            for (double nota : alumno) {
                if (nota < minimo) {
                    minimo = nota;
                }
            }
        }
        return minimo;
    }

    public static int numeroAlumnosTodoAprobado(double[][] notas) {
        int contador = 0;
        for (double[] alumno : notas) {
            boolean aprobado = true; // Para cada alumno supoño que está aprobado ata que se demostre o contrario
            for (double nota : alumno) {
                if (nota < 5.0) {
                    aprobado = false;
                    break;
                }
            }
            if (aprobado) { // Se non se atopou ningunha nota suspensa para ese alumno
                contador++;
            }
        }
        return contador;
    }

    public static int numeroAlumnosTodoAprobado2(double[][] notas) {
        int contador = 0;
        for (int f = 0; f < notas.length; f++) { // Para cada un dos alumnos
            boolean aprobado = true; // Para cada alumno supoño que está aprobado ata que se demostre o contrario
            for (int c = 0; c < notas[f].length && aprobado; c++) { // Para cada un dos módulos
                if (notas[f][c] < 5.0) {
                    aprobado = false;
                }
            }
            if (aprobado) {// Se non se atopou ningunha nota suspensa para ese alumno
                contador++;
            }
        }
        return contador;
    }
}
