import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personaxe person;
        person = new Personaxe("Jorge",0,0);
        if (person.estaVivo()){
            System.out.println("Estoy vivo");
        }
    }
}