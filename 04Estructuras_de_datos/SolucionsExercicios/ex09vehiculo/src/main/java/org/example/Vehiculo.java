package org.example;

import java.time.LocalDate;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String propietario;
    private static String ultimaMatricula = "0000BBB";
    private static final String LETRAS_POSIBLES = "BCDFGHJKLMNPQRSTVWXYZ";

    public Vehiculo(String modelo, String marca, String cor, int ano, String propietario, String matricula) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        if (validarAno(ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano non válido");
        }
        this.propietario = propietario;
        if (validarMatricula(matricula)) {
            this.matricula = matricula;
            ultimaMatricula = matricula;
        } else {
            throw new IllegalArgumentException("Matricula non válida");
        }
    }

    public Vehiculo(String modelo, String marca, String cor, int ano, String propietario) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        if (validarAno(ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano non válido");
        }
        this.propietario = propietario;
        matricular(); //Aumentamos en 1 a matrícula
        this.matricula = ultimaMatricula;
    }

    private boolean validarMatricula(String matricula) {
        return matricula.matches("[0-9]{4}[A-Z&&[^AEIOU]]{3}");
    }

    private boolean validarAno(int ano) {
        int anoActual = LocalDate.now().getYear();
        return ano >= 1900 && ano <= anoActual;
    }

    private static char letraSiguinte(char letra) {
        int indice = LETRAS_POSIBLES.indexOf(letra);
        if (indice == LETRAS_POSIBLES.length() - 1) {
            return LETRAS_POSIBLES.charAt(0);
        } else {
            return LETRAS_POSIBLES.charAt(indice + 1);
        }
    }

    private static void matricular() {
        int numeros = Integer.valueOf(ultimaMatricula.substring(0, 4));
        StringBuilder letras = new StringBuilder(ultimaMatricula.substring(4));
        numeros++;
        if (numeros > 9999) { // Cambia letras
            for (int i = letras.length() - 1; i >= 0; i--) { //Repetimos iteración ata que non se produza un cambio de letra
                char letra = letras.charAt(i);
                char letraSiguiente = letraSiguinte(letra);
                letras.setCharAt(i, letraSiguiente);
                if (letraSiguiente != LETRAS_POSIBLES.charAt(0)) { //Se non se produce un cambio de letra seguinte
                    break;
                }
            }
            numeros = 0;
        }
        ultimaMatricula = String.format("%04d%s", numeros, letras);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}
