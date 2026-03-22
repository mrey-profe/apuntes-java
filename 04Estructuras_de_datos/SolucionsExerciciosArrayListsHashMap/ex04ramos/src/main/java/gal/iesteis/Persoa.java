package gal.iesteis;

public class Persoa {
    private String nome;
    private String apelidos;
    private String telefono;

    public Persoa(String nome, String apelidos, String telefono) {
        if (eNomeCorrecto(nome)) {
            this.nome = nome;
        }
        if (eNomeCorrecto(apelidos)) {
            this.apelidos = apelidos;
        }
        if (eTelefonoCorrecto(telefono)) {
            this.telefono = telefono;
        }
    }

    public boolean eNomeCorrecto(String cadea) {
        return !cadea.isEmpty();
    }

    public boolean eTelefonoCorrecto(String telefono) {
        return telefono.matches("\\d{9}");
    }

    public String toString() {
        return "Nome: " + nome + ", Apelidos: " + apelidos + ", Telefono: " + telefono;
    }
}
