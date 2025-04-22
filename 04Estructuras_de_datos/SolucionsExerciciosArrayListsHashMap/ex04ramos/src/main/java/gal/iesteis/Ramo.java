package gal.iesteis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ramo {
    private HashMap<Flor, Integer> flores;
    private Persoa cliente;

    public Ramo(Persoa cliente) {
        this.cliente = cliente;
        this.flores = new HashMap<>();
    }

    public void engadirFlor(Flor flor, int numero) {
        if (flor != null) {
            if (!flores.containsKey(flor)) {
                flores.put(flor, numero);
            } else { // Xa existía a flor, incrementamos o número
                int cantidadeActual = flores.get(flor);
                flores.put(flor, cantidadeActual + numero);
            }
        }
    }

    public void eliminarFlores(Flor flor, int numero) {
        if (flores.containsKey(flor)) {
            int cantidadeActual = flores.get(flor);
            if (cantidadeActual > numero) {
                flores.put(flor, cantidadeActual - numero);
            } else {
                flores.remove(flor);
            }
        }
    }

    public double calcularPrezo() {
        double prezoTotal = 0;
        for (Flor flor : flores.keySet()) {
            prezoTotal += flor.getPrezo();
        }
        return prezoTotal;
    }


    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Ramo de: ").append(cliente).append("\n");
        for (Flor flor : flores.keySet()) {
            resultado.append(flor).append(": ").append(flores.get(flor)).append(" unidades \n");
        }
        resultado.append("Prezo total: ").append(calcularPrezo()).append("€\n");
        return resultado.toString();
    }
}
