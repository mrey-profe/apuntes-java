package ex01operacions;

/**
 *
 * @author marta
 */
public class OperacionsCadeas {

    public static void amosaCracteres(String cadea) {
        for (int i = 0; i < cadea.length(); i++) {
            System.out.println(cadea.charAt(i));
        }
    }

    /**
     * Método que verifica se unha cadea comeza cunha subcadea
     *
     * @param cadea Cadea a comprobar
     * @param subcadea Cadea comparada
     * @return true ou false se comeza ou non
     */
    public static boolean comezaCon(String cadea, String subcadea) {
        /*int lonxitudeSubcadea = subcadea.length();
        String cadeaTmp = "";
        for (int i = 0; i < lonxitudeSubcadea; i++) {
            cadeaTmp = cadeaTmp + cadea.charAt(i);
        }
        return subcadea.equals(cadeaTmp);*/

        boolean coinciden = true;
        for (int i = 0; i < subcadea.length() && coinciden; i++) {
            if (cadea.charAt(i) != subcadea.charAt(i)) {
                coinciden = false;
            }
        }
        return coinciden;
    }

    public static int numAparicions(String cadea, char c) {
        int contador = 0;
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) == c) {
                contador++;
            }
        }
        return contador;
    }

    public static int numPalabras(String cadea) {
        /*return numAparicions(cadea, ' ') + 1;*/

        //Esta solución ten en conta que pode haber varios espazos:
        int contador = 0;
        boolean novaPalabra = true;
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isWhitespace(cadea.charAt(i))) {
                novaPalabra = true;
            } else {
                if (novaPalabra) {
                    contador++;
                    novaPalabra = false;
                }
            }
        }
        return contador;
    }

    public static String siglas(String cadea) {
        //Esta solución ten en conta que pode haber varios espazos:
        /*String resultado = "";
        boolean novaPalabra = true;
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isWhitespace(cadea.charAt(i))) {
                novaPalabra = true;
            } else {
                if (novaPalabra) {
                    resultado += Character.toUpperCase(cadea.charAt(i));
                    novaPalabra = false;
                } 
            }
        }*/
        //Só un espazo:
        String resultado = Character.toString(cadea.charAt(0));
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isWhitespace(cadea.charAt(i))) {
                resultado += cadea.charAt(i + 1);
            }
        }
        return resultado.toUpperCase();
    }

    public static String reves(String cadea) {
        String resultado = "";
        for (int i = cadea.length() - 1; i >= 0; i--) {
            resultado += cadea.charAt(i);
        }
        return resultado;
    }

    /**
     * Substitúe nunha cadea cada aparición de c1 por c2.
     *
     * @param cadea A cadea na que se substitúe
     * @param c1 O carácter que se busca
     * @param c2 O carácter polo que se substitúe
     * @return A cadea cos carácteres substituídos
     */
    public static String substituir(String cadea, char c1, char c2) {
        String resultado = "";
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) != c1) {
                resultado += cadea.charAt(i);
            } else { //Carácter coincidente
                resultado += c2;
            }
        }
        return resultado;
    }

    public static String cambiaCapitalizacion(String cadea) {
        String resultado = "";
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isLowerCase(cadea.charAt(i))) {
                resultado += Character.toUpperCase(cadea.charAt(i));
            } else if (Character.isUpperCase(cadea.charAt(i))) {
                resultado += Character.toLowerCase(cadea.charAt(i));
            } else {
                resultado += cadea.charAt(i);
            }
        }
        return resultado;
    }

    public static boolean conten(String cadea, String subcadea) {
        boolean conten = false;
        for (int i = 0; i < cadea.length() && !conten; i++) {
            if (cadea.charAt(i) == subcadea.charAt(0)) {
                boolean coincideCompleto = true;
                for (int j = 1; j < subcadea.length() && 
                        i + j < cadea.length() && coincideCompleto; j++) {
                    if (cadea.charAt(i + j) != subcadea.charAt(j)) {
                        coincideCompleto = false;
                    }
                    conten = coincideCompleto;
                }
            }
        }
        return conten;
    }
    
    public static boolean ePalindromo(String palabra) {
        return palabra.equalsIgnoreCase(reves(palabra));
    }
}
