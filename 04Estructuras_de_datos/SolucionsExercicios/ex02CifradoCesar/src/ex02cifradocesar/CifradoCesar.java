package ex02cifradocesar;

/**
 *
 * @author marta
 */
public class CifradoCesar {

    private final static int LONXITUDE_ALFABETO = 'Z' - 'A' + 1;

    /**
     * Cifra unha cadea aplicando un desprazamento aos seus caracteres
     *
     * @param mensaxeClaro A cadea inicial
     * @param desprazamento O desprazamento a aplicar
     * @return A cadea ifrada ou unha cadea baleira se o desprazamento non é
     * adecuado
     */
    public static String cifrado(String mensaxeClaro, int desprazamento) {
        StringBuilder resultado = new StringBuilder();
        if (desprazamento <= LONXITUDE_ALFABETO) {
            for (int i = 0; i < mensaxeClaro.length(); i++) {
                char letra = mensaxeClaro.charAt(i);
                if (letra >= 'A' && letra <= 'Z') {
                    letra += (char) desprazamento;
                    if (letra > 'Z') {
                        letra -= LONXITUDE_ALFABETO;
                    }
                } else if (letra >= 'a' && letra <= 'z') {
                    letra += (char) desprazamento;
                    if (letra > 'z') {
                        letra -= LONXITUDE_ALFABETO;
                    }
                }
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }
    
    public static String descifrado(String mensaxeCifrada, int desprazamento) {
        StringBuilder resultado = new StringBuilder();
        if (desprazamento <= LONXITUDE_ALFABETO) {
            for (int i = 0; i < mensaxeCifrada.length(); i++) {
                char letra = mensaxeCifrada.charAt(i);
                if (letra >= 'A' && letra <= 'Z') {
                    letra -= (char) desprazamento;
                    if (letra < 'A') {
                        letra += LONXITUDE_ALFABETO;
                    }
                } else if (letra >= 'a' && letra <= 'z') {
                    letra -= (char) desprazamento;
                    if (letra < 'a') {
                        letra += LONXITUDE_ALFABETO;
                    }
                }
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }

    //Versión Álvaro
    public static String  cifrarAlvaro ( String cadea, int posiciones) {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
        StringBuilder cadeaCifrada = new StringBuilder();
        for (int i = 0; i < cadea.length(); i++) {
            char letra = cadea.charAt(i);
            if (abecedario.contains(Character.toString(letra))){
                int posicion = abecedario.indexOf(letra);
                cadeaCifrada.append(abecedario.charAt((posicion+posiciones)%28));
            } else {
                cadeaCifrada.append(letra);
            }
        }
        return cadeaCifrada.toString();
    }
    public static String  descifrarAlvaro ( String cadea, int posiciones) {
        String abecedario = " zyxwvutsrqpoñnmlkjihgfedcba";
        StringBuilder cadeaDescifrada = new StringBuilder();
        for (int i = 0; i < cadea.length(); i++) {
            int posicion = abecedario.indexOf(cadea.charAt(i));
            if (abecedario.contains(Character.toString(cadea.charAt(i)))) {
                cadeaDescifrada.append(abecedario.charAt((posicion + posiciones) % 28));
            } else {
                cadeaDescifrada.append(cadea.charAt(i));
            }
        }
        return cadeaDescifrada.toString();
    }
}
