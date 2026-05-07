package ex02lexislador;

/**
 *
 * @author marta
 */
public class Deputado extends Lexislador {

    public Deputado(String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho) {
        super(provinciaQueRepresenta, partidoPolitico, numeroDespacho);
    }
    
    @Override
    public String getCamaraEnQueTraballa() {
        return "Baixa";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSon un deputado";
    }
    
    
}
