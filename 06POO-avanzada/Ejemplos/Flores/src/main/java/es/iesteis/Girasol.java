package es.iesteis;

public class Girasol extends Flor{
    private int pipas;

    public Girasol(String color, int pipas) {
        super("Xirasol", color);
        this.pipas = pipas;
    }

    @Override
    public void mostrar() { // Sobreescritura del método mostrar
        super.mostrar(); // Llamada al método de la superclase
        System.out.println("Pipas: " + pipas);
    }
}
