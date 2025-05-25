package gal.iesteis;

public class Cliente {
    private String nome;
    private  String apelidos;
    private String poboacion;

    public Cliente(String nome, String apelidos, String poboacion) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.poboacion = poboacion;
    }

    public String toString() {
        return nome + "\t\t" + apelidos + "\t\t" + poboacion;
    }
}
