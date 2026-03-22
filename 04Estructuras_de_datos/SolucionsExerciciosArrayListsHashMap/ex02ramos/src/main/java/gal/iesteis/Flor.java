package gal.iesteis;

import java.util.Arrays;

public class Flor {
    private String nome;
    private String cor;
    private double prezo;
    private static final String[] CORES = {"branca", "rosa", "vermella", "amarela", "verde", "negra"};

    public Flor(String nome, String cor, double prezo) {
        if (eNomeCorrecto(nome)) {
            this.nome = nome;
        }
        if (eCorCorrecta(cor)) {
            this.cor = cor;
        }
        if (ePrezoCorrecto(prezo)) {
            this.prezo = prezo;
        }
    }

    public boolean eNomeCorrecto(String cadea) {
        return !cadea.isEmpty();
    }

    public boolean eCorCorrecta(String cor) {
//        for (String corValida : CORES) {
//            if (corValida.equalsIgnoreCase(cor)) {
//                return true;
//            }
//        }
//        return false;
        //Alternativa
        String coresCadea = Arrays.toString(CORES);
        System.out.println(coresCadea);
        return coresCadea.contains(cor.toLowerCase());
    }

    public boolean ePrezoCorrecto(double prezo) {
        return prezo > 0;
    }

    public String toString() {
        return "Flor: " + nome + ", Cor: " + cor + ", Prezo: " + prezo + "€";
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public double getPrezo() {
        return prezo;
    }
}
