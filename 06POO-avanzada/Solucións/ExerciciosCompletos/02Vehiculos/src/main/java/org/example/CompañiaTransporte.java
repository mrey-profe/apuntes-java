package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class CompañiaTransporte {
    private String nombre;
    ArrayList<Vehiculo> vehiculos;

    public CompañiaTransporte(String nombre) {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(int numSerie) {
        Iterator<Vehiculo> iterador = vehiculos.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().getNumeroSerie() == numSerie) {
                iterador.remove();
            }
        }
    }

    public void cargarVehiculos() {
        Iterator<Vehiculo> iterador = vehiculos.iterator();
        while (iterador.hasNext()) {
            Vehiculo vehiculo = iterador.next();
            if (vehiculo instanceof TransportadorMercancias t) {
                t.cargar();
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        for (Vehiculo vehiculo : vehiculos) {
            cadena += vehiculo.toString() + "\n";
        }
        return "CompañiaTransporte{" +
                "nombre='" + nombre + '\'' +
                ", vehiculos=\n" + cadena +
                '}';
    }
}
