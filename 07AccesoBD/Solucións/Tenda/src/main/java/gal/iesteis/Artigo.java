package gal.iesteis;

public class Artigo {
    private String codigo;
    private String nome;

    public Artigo(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String toString() {
        return "Código: " + codigo + "\t\t Nome: " + nome;
    }
}
