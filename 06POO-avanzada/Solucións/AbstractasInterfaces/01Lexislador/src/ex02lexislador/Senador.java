package ex02lexislador;

/**
 *
 * @author marta
 */
public class Senador extends Lexislador {

    public Senador(String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho) {
        super(provinciaQueRepresenta, partidoPolitico, numeroDespacho);
    }
    
    @Override
    public String getCamaraEnQueTraballa() {
        return "Alta";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSon un senador";
    }
    
    
}
