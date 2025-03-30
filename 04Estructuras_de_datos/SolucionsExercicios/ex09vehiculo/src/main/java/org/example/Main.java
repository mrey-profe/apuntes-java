package org.example;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Clio", "Renault", "Vermello", 2005, "Pepe");
        System.out.println(v);
        Vehiculo v2 = new Vehiculo("Clio", "Renault", "Vermello", 2005, "Pepe", "9999BZZ");
        System.out.println(v2);
        Vehiculo v3 = new Vehiculo("Clio", "Renault", "Vermello", 2005, "Pepe");
        System.out.println(v3);
    }
}