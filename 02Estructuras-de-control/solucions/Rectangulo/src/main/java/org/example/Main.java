package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Rectangulo rec = new Rectangulo(4,4);
        boolean es_cuadrado=rec.esCuadrado();
        if(es_cuadrado) {
            System.out.println("Es un cuadrado");
        }else{
            System.out.println("No es un cuadrado");
        }
        rec.setBase(5);
        es_cuadrado=rec.esCuadrado();
        if(es_cuadrado) {
            System.out.println("Es un cuadrado");
        }else{
            System.out.println("No es un cuadrado");
        }
    }
}