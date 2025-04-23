package gal.iesteis;

import java.util.ArrayList;
import java.util.Iterator;

public class Ramo {
    private ArrayList<Flor> flores;
    private Persoa cliente;

    public Ramo(Persoa cliente) {
        this.cliente = cliente;
        this.flores = new ArrayList<>();
    }

    public Ramo(ArrayList<Flor> flores, Persoa cliente) {
        this.cliente = cliente;
        this.flores = flores;
    }

    public void engadirFlor(Flor flor) {
        if (flor != null) {
            flores.add(flor);
        }
    }
    public void eliminarFlores(String tipo, String cor, int numero) {
        Iterator<Flor> iterador = flores.iterator();
        while (iterador.hasNext() && numero > 0) {
            Flor flor = iterador.next();
            if (flor.getNome().equalsIgnoreCase(tipo) && flor.getCor().equalsIgnoreCase(cor)) {
                iterador.remove();
                numero--;
            }
        }
    }

    public double calcularPrezo() {
        double prezoTotal = 0;
        for (Flor flor : flores) {
            prezoTotal += flor.getPrezo();
        }
        return prezoTotal;
    }


    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Ramo de: ").append(cliente).append("\n");
        for (Flor flor : flores) {
            resultado.append(flor).append("\n");
        }
        resultado.append("Prezo total: ").append(calcularPrezo()).append("€\n");
        return resultado.toString();
    }
}
