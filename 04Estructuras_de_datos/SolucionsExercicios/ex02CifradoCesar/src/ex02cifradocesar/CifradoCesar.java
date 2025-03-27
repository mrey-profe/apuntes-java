package ex02cifradocesar;

/**
 *
 * @author marta
 */
public class CifradoCesar {

    final static int LONXITUDE_ALFABETO = 'Z' - 'A' + 1;

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
}
