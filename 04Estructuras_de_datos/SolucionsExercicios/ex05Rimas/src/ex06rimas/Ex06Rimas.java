package ex06rimas;

/**
 *
 * @author marta
 */
public class Ex06Rimas {

    public static void main(String[] args) {
        String verso1 = "cantado";
        String verso2 = "saltado";

        boolean resultado = Poesia.riman3letras(verso1, verso2);
        System.out.println(resultado);

        resultado = Poesia.riman3LetrasAlternativa(verso1, verso2);
        System.out.println(resultado);

        resultado = Poesia.rimanConsonante(verso1, verso2);
        System.out.println(resultado);

        verso1 = "cantado";
        verso2 = "zapato";

        resultado = Poesia.rimanAsonante(verso1, verso2);
        System.out.println(resultado);
    }
}
