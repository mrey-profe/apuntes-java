package org.example;

public class Main {
    public static void main(String[] args) {
        CompañiaTransporte compañiaTransporte = new CompañiaTransporte("Transportes DAW");

        Camion camion1 = new Camion("Freightliner Cascadia", 1, TipoCombustible.DIESEL, 10000, 0, 10, "Juan Pérez");
        Camion camion2 = new Camion("Volvo FH", 2, 20000, 0, 20, "María Martínez");
        AvionCarga avionCarga1 = new AvionCarga("Boeing 747", 3, TipoCombustible.JET_A1, 10000, 10000, 0, "Pedro López");
        AvionComercial avionComercial1 = new AvionComercial("Airbus A320", 4, TipoCombustible.JET_A1, 5000, 200);

        avionComercial1.asignarTripulacion("Piloto", "Carlos López");
        avionComercial1.asignarTripulacion("Copiloto", "Amelia Earhart");
        avionComercial1.asignarTripulacion("Supervisor/a de cabina", "Alba Gómez");
        avionComercial1.asignarTripulacion("Tripulante de cabina", "Mario Pérez");

        Avion avion1 = new Avion("Cessna 172", 5, TipoCombustible.AVGAS, 1000);

        compañiaTransporte.agregarVehiculo(camion1);
        compañiaTransporte.agregarVehiculo(camion2);
        compañiaTransporte.agregarVehiculo(avionCarga1);
        compañiaTransporte.agregarVehiculo(avionComercial1);
        compañiaTransporte.agregarVehiculo(avion1);

        System.out.println(compañiaTransporte);

        compañiaTransporte.cargarVehiculos();

        System.out.println(compañiaTransporte);

        compañiaTransporte.eliminarVehiculo(2);

        System.out.println(compañiaTransporte);

        DAO dao = new DAO("jdbc:mysql://localhost:3306/Vehiculos", "root", "renaido");

        dao.eliminarCamion(2);
        System.out.println(dao.buscarCamionesMayorCapacidad(20000));
        
    }
}