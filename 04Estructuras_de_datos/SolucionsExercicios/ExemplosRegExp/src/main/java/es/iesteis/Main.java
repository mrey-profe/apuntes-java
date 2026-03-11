package es.iesteis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String matricula = "PO-1234-AB";
        String expresion = "([0-9]{4}-?[A-Z&&[^AEIOU]]{3})|([A-Z]{1,2}-?\\d{4}-?[A-Z]{1,2})";
        if (matricula.matches(expresion)) {
            System.out.println("É unha matrícula");
        } else {
            System.out.println("Non é unha matrícula");
        }

        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vehicula, felis ac auctor blandit, risus odio vulputate leo, et tincidunt nunc urna et lectus. Aenean efficitur vehicula risus, ut elementum dui elementum ac. Morbi tincidunt vehicula ipsum sit amet vehicula. Sed malesuada, felis non faucibus condimentum, lorem urna sollicitudin magna, a convallis leo elit ac nulla. Proin tincidunt auctor dui, sit amet interdum magna euismod ut.\n" +
                "\n" +
                "1234PBC. Sed feugiat risus a sapien mollis, vel tristique eros maximus. Ut tristique ligula sed elit vehicula, id sodales elit pharetra. Vestibulum vel ante felis. Aenean in leo id lorem malesuada finibus. Donec ut nisi et orci venenatis luctus eget a lorem.\n" +
                "\n" +
                "5678-DLF. Integer at urna nec urna placerat lacinia sit amet id nunc. Nulla facilisi. Vivamus convallis mollis velit et iaculis. Cras ac est ac ligula facilisis pretium. Aliquam tincidunt felis magna, id laoreet mi efficitur at. In auctor, mauris et volutpat sodales, lorem purus sollicitudin sapien, sed iaculis ipsum nisi nec ante.\n" +
                "\n" +
                "9876-GHR. Fusce scelerisque felis at velit PO-1234-AB fermentum, non aliquet nulla sodales.";

        Pattern patron = Pattern.compile(expresion);
        Matcher match = patron.matcher(texto);

        while (match.find()) {
            System.out.println(match.group());
        }

        char letra = 'a';
        int desprazamento = 2;
        //letra += desprazamento;
        char otra = (char)(letra + desprazamento);
        System.out.println(otra);
        if (otra > 'z') {
            otra -= 26; //distancia(26) = 'z' - 'a' + 1
        }

    }
}