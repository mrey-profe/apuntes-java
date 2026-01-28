public class Libro {
    private String titulo;
    private String autor;
    private int numExemplares;
    private int numExemplaresPrestados;

    public Libro(String titulo,String autor,int numExemplares){
        this.titulo=titulo;
        this.autor=autor;
        this.numExemplares=numExemplares;
        this.numExemplaresPrestados=0;
    }

    public boolean prestar(){
        if(numExemplaresPrestados < numExemplares){
            numExemplaresPrestados++;
            return true;
        }
        return false;
    }




}
