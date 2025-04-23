package gal.iesteis;

public class Personaje {
    protected String nombre; //Pueden acceder a este atributo las subclases u otras clases del mismo paquete
    protected int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void presentarse() {
        System.out.println("Hola soy " + nombre);
    }
}
