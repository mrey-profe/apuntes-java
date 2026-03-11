package iesteis.es;

import java.util.Random;

public class Usuario {
    private String nome;
    private String apelidos;
    private String DNI;
    private String usuarioSistema;
    private String contrasinal;
    private String email;
    private static final int LONXITUDE_CONTRASINAL = 12;
    private static final int CARACTERES_CONTRASINAL = 10;
    private static final int MAIUSCULAS_CONTRASINAL = 3;
    private static final int SIMBOLOS_CONTRASINAL = 2;

    public Usuario(String nome, String apelidos, String DNI, String email) {
        this.nome = nome;
        this.apelidos = apelidos;
        if (dniCorrecto(DNI)) {
            this.DNI = DNI;
        } else {
            throw new IllegalArgumentException("DNI non válido");
        }
        if (correoCorrecto(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email non válido");
        }
        this.usuarioSistema = crearUsuario(nome, apelidos);
        this.contrasinal = crearContrasinal();
    }

    public boolean dniCorrecto(String DNI) {
        String patron = "\\d{8}[A-HJ-NP-TV-Z]";
        if (DNI.matches(patron)) {
            char letra = DNI.charAt(8);
            char letraCalculada = calcularLetraDNI(DNI.substring(0, 8));
            return letra == letraCalculada;
        } else {
            return false;
        }
    }

    public static char calcularLetraDNI(String DNI) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numero = Integer.parseInt(DNI);
        int resto = numero % 23;
        return letras.charAt(resto);
    }

    public boolean correoCorrecto(String email) {
        String patron = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        return email.matches(patron);
    }

    public String crearUsuario(String nome, String apelidos) {
        StringBuilder usuario = new StringBuilder();
        usuario.append(nome);
        usuario.append(apelidos.charAt(0));
        for (int i = 0; i < apelidos.length() - 1; i++) { // -1 para non incluír o último carácter, xa que se accede a i+1
            if (apelidos.charAt(i) == ' ') {
                usuario.append(apelidos.charAt(i + 1));
            }
        }
        return usuario.toString().toLowerCase();
    }

    public String crearContrasinal() {
        StringBuilder contrasinal = new StringBuilder();
        Random random = new Random();
        String minusculas = "abcdefghijklmnñopqrstuvwxyz";
        for (int i = 0; i < CARACTERES_CONTRASINAL; i++) {
            char letra = minusculas.charAt(random.nextInt(minusculas.length()));
            contrasinal.append(letra);
        }
        for (int i = 0; i < MAIUSCULAS_CONTRASINAL; i++) {
            int posicionMaiuscula = random.nextInt(contrasinal.length());
            contrasinal.setCharAt(posicionMaiuscula, Character.toUpperCase(contrasinal.charAt(posicionMaiuscula)));
        }
        String simbolos = "!@#$%&";
        for (int i = 0; i < SIMBOLOS_CONTRASINAL; i++) {
            char simbolo = simbolos.charAt(random.nextInt(simbolos.length()));
            int posicionSimbolo = random.nextInt(contrasinal.length());
            contrasinal.insert(posicionSimbolo, simbolo);
        }
        return contrasinal.toString();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", apelidos='" + apelidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", usuarioSistema='" + usuarioSistema + '\'' +
                ", contrasinal='" + contrasinal + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
