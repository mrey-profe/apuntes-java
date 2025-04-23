package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Axencia {
    private String nome;
    private String enderezo;
    private ArrayList<Destino> destinos;
    private ArrayList<Viaxe> viaxes;

    public Axencia(String nome, String enderezo) {
        this.nome = nome;
        this.enderezo = enderezo;
        this.destinos = new ArrayList<>();
        this.viaxes = new ArrayList<>();
    }

    public void engadirDestino(Destino destino) {
        destinos.add(destino);
    }

    public void engadirViaxe(Viaxe viaxe) {
        viaxes.add(viaxe);
    }

    public void eliminarViaxe(int codigo) {
        Iterator<Viaxe> iterator = viaxes.iterator();
        while (iterator.hasNext()) {
            Viaxe viaxe = iterator.next();
            if (viaxe.getCodigo() == codigo) {
                iterator.remove();
                return;
            }
        }
    }

    public boolean rexistrarViaxeiro(int codigoViaxe, Viaxeirx viaxeirx) {
        for (Viaxe viaxe : viaxes) {
            if (viaxe.getCodigo() == codigoViaxe) {
                viaxe.engadirViaxeirx(viaxeirx);
                return true;
            }
        }
        return false; // Se non se atopou a viaxe
    }



    public void amosarDestinos() {
        System.out.println("Destinos dispoñibles:");
        for (Destino destino : destinos) {
            System.out.println(destino);
        }
    }

    public void amosarDestinos(String pais) {
        System.out.println("Destinos dispoñibles en " + pais + ":");
        for (Destino destino : destinos) {
            if (destino.getPais().equalsIgnoreCase(pais)) {
                System.out.println(destino);
            }
        }
    }

    public void amosarViaxes() {
        System.out.println("Viaxes dispoñibles:");
        for (Viaxe viaxe : viaxes) {
            System.out.println(viaxe);
        }
    }

    public void amosarViaxes(Destino destino) {
        System.out.println("Viaxes dispoñibles para " + destino.getLugar() + ", " + destino.getPais() + ":");
        for (Viaxe viaxe : viaxes) {
            if (viaxe.getDestino().equals(destino)) {
                System.out.println(viaxe);
            }
        }
    }
}
