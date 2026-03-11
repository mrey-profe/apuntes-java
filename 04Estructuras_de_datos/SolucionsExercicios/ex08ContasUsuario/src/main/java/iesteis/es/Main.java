package iesteis.es;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Xián", "Gómez Méndez", "12345678Z", "juan@iesteis.es");
        System.out.println(usuario);
    }
}