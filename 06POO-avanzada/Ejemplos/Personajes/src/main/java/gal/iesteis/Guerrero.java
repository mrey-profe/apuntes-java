package gal.iesteis;

public class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel); // Llama al constructor de la clase padre
    }

    public void usarEspada() {
        System.out.println(nombre + " usa su espada.");
    }

    @Override
    public void presentarse() { //Sobreescritura con llamada al método de la superclase
        super.presentarse(); //Llamada al método de la superclase
        System.out.println("Soy un guerrero de nivel " + nivel);
    }
}
