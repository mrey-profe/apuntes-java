package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Persoa p1=new Persoa("Jorge",37,"12345678f", 80,'E',170);
        p1.mostrarInformacion();
        Persoa p2=new Persoa("Enrique",227,"12345678f", 90,'F',170);
        p2.mostrarInformacion();
        System.out.println(p1);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

    }
}