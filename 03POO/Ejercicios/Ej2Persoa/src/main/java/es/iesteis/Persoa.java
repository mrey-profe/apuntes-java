package es.iesteis;

public class Persoa {
    private String nome;
    private int idade;
    private String dni;
    private char situacionActual;
    private double peso;
    private int altura; //En cm

    public Persoa(String nome, int idade, char situacionActual, double peso, int altura) {
        this.nome = nome;
        if (eCorrectaIdade(idade)) {
            this.idade = idade;
        } else {
            System.out.println("Idade incorrecta");
        }
        if (eCorrectaSituacion(situacionActual)) {
            this.situacionActual = situacionActual;
        } else {
            System.out.println("Situación incorrecta");
        }
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (eCorrectaIdade(idade)) {
            this.idade = idade;
        } else {
            System.out.println("Idade incorrecta");
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSituacionActual() {
        return situacionActual;
    }

    public void setSituacionActual(char situacionActual) {
        if (eCorrectaSituacion(situacionActual)) {
            this.situacionActual = situacionActual;
        } else {
            System.out.println("Situación incorrecta");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    private boolean eMaiorIdade() {
        return idade >= 18;
    }

    private static boolean eCorrectaSituacion(char situacion) {
        return situacion == 'E' || situacion == 'T' || situacion == 'D';
        //return "ETD".contains("" + situacion);
    }

    private static boolean eCorrectaIdade(int idade) {
        return idade >= 0 && idade <= 150;
    }

    @Override
    public String toString() {
        return "Persoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dni='" + dni + '\'' +
                ", situacionActual=" + situacionActual +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void amosarInformacion() {
        System.out.println(this); //Chama a toString
    }

    public double calcularIMC() {
        return peso / Math.pow((double) altura / 100, 2); //Ollo coa división enteira
    }
}
