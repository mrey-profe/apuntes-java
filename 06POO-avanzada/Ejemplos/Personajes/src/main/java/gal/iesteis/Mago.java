package gal.iesteis;

public class Mago extends Personaje {
    private String tipoVarita;

    public Mago(String nombre, int nivel, String tipoVarita) {
        super(nombre, nivel); // Llama al constructor de la clase padre
        this.tipoVarita = tipoVarita;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo.");
    }

    @Override
    public void presentarse() {
        System.out.println("Hola soy " + nombre + " y soy un mago de nivel " + nivel);
    }
}
