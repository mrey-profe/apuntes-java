package org.example;

import java.util.Objects;

public class Persoa {
    private String nome;
    private int idade;
    private String dni;
    private int peso;
    private char situacionActual;
    private int altura;

    @Override
    public String toString() {
        return "Persoa[" +
                "nome='" + nome + "\'\n" +
                ", idade=" + idade +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", situacionActual=" + situacionActual +
                ", altura=" + altura +
                ']';
    }




    @Override
    public int hashCode() {
        return Objects.hash(nome, dni);
    }

    public Persoa(String nome, int idade , String dni, int peso, char situacionActual, int altura){
        this.nome=nome;
        if(idade>0 && idade <=150) {
            this.idade = idade;
        }else{
            System.out.println("A idade debe estar entre 0 e 150");
        }
        this.dni=dni;
        this.peso=peso;
        if(situacionActual=='E' || situacionActual=='T' ||situacionActual=='D'){
            this.situacionActual=situacionActual;
        }else{
            System.out.println("A situacion actual non e correcta, debe ser 'E', 'T, ou 'D'");
        }
        this.situacionActual=situacionActual;
        this.altura=altura;
    }

    public boolean eMaiorDeIdade(){
        return idade>=18;
    }

    public Persoa clone()

    public boolean eCorrectaSituacion(char situacionActual){
        return (situacionActual=='E' || situacionActual=='T' ||situacionActual=='D');
    }

    public boolean eCorrectaIdade(int idade){
        return (idade>0 && idade <=150);
    }

    public void mostrarInformacion(){
        System.out.println("Persoa");
        System.out.println("------");
        System.out.println("Nome:"+ nome);
        System.out.println("Idade:" + idade);
        System.out.println("DNI:" + dni);
        if(situacionActual=='E') {
            System.out.println("Situación: Estudia");
        } else if (situacionActual=='T') {
            System.out.println("Situación: Traballa");
        } else if (situacionActual=='D'){
            System.out.println("Situación: Está desempregado");
        } else  {
            System.out.println("Situación invalida");
        }
        System.out.println("Peso:"+ peso);
        System.out.println("Altura"+ altura);
    }


}
