  package ex02lexislador;

/**
 *
 * @author marta
 */
public abstract class Lexislador extends Persoa {
    private String provinciaQueRepresenta;
    private String partidoPolitico;
    private int numeroDespacho;

    public Lexislador(String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numeroDespacho = numeroDespacho;
    }
    
    public abstract String getCamaraEnQueTraballa();

    @Override
    public String toString() {
        return "Lexislador: \n" + "\tprovinciaQueRepresenta: " + provinciaQueRepresenta 
                + "\n\t partidoPolitico: " + partidoPolitico 
                + "\n\tnumeroDespacho: " + numeroDespacho;
    }
    
    
}
