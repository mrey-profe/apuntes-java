package org.example;

import java.util.Random;

public class Xardin {
    private Flor[][] flores;

    public Xardin(int filas, int columnas) {
        this.flores = new Flor[filas][columnas];
        plantarAleatoria();
    }

    private void plantarAleatoria(){
        Random random = new Random();
        String[] tiposPosibles = Flor.getTIPOS();
        String[] coresPosibles = Flor.getCORES();
        int numTipos = tiposPosibles.length;
        int numCores = coresPosibles.length;
        for (int i = 0; i < flores.length; i++) {
            for (int j = 0; j < flores[i].length; j++) {
                int indiceTipos = random.nextInt(numTipos);
                int indiceCores = random.nextInt(numCores);
                String nome = tiposPosibles[indiceTipos];
                String cor = coresPosibles[indiceCores];
                //Equivale a:
                // String nome = Flor.getTIPOS()[random.nextInt(Flor.getTIPOS().length)];
                // String cor = Flor.getCORES()[random.nextInt(Flor.getCORES().length)];
                flores[i][j] = new Flor(nome, cor);
            }
        }
    }

    public int contarFlores(String tipo) {
        int contador = 0;
        for (int i = 0; i < flores.length; i++) {
            for (int j = 0; j < flores[i].length; j++) {
                if (flores[i][j].getTipo().equals(tipo)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public Flor[][] getFlores() {
        return flores;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < flores.length; i++) {
            for (int j = 0; j < flores[i].length; j++) {
                sb.append(flores[i][j].toString());
                sb.append(", ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
