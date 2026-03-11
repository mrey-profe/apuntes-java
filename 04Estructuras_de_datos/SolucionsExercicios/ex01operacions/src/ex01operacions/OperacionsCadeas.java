package ex01operacions;

/**
 *
 * @author marta
 */
public class OperacionsCadeas {

    public static void amosaCaracteres(String cadea) {
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
        if (subcadea.length() > cadea.length()) {
            return false;
        }

        boolean coinciden = true;
        for (int i = 0; i < subcadea.length() && coinciden; i++) {
            if (cadea.charAt(i) != subcadea.charAt(i)) {
                coinciden = false;
            }
        }
        return coinciden;

        // for (int i = 0; i < subcadea.length(); i++) {
        //     if (cadea.charAt(i) != subcadea.charAt(i)) {
        //         return false;
        //     }
        // }
        // return true;
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
        StringBuilder resultado = new StringBuilder(Character.toString(cadea.charAt(0)));
        for (int i = 0; i < cadea.length() - 1; i++) {
            if (Character.isWhitespace(cadea.charAt(i))) {
                resultado.append(cadea.charAt(i + 1));
            }
        }
        return resultado.toString().toUpperCase();
    }

    public static String reves(String cadea) {
//        StringBuilder resultado = new StringBuilder();
//        for (int i = cadea.length() - 1; i >= 0; i--) {
//            resultado.append(cadea.charAt(i));
//        }
//        return resultado.toString();
        StringBuilder resultado = new StringBuilder(cadea);
        return resultado.reverse().toString();
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
//        StringBuilder resultado = new StringBuilder();
//        for (int i = 0; i < cadea.length(); i++) {
//            if (cadea.charAt(i) != c1) {
//                resultado.append(cadea.charAt(i));
//            } else { //Carácter coincidente
//                resultado.append(c2);
//            }
//        }
//        return resultado.toString();
        StringBuilder resultado = new StringBuilder(cadea);
        for (int i = 0; i < resultado.length(); i++) {
            if (resultado.charAt(i) == c1) {
                resultado.setCharAt(i, c2);
            }
        }
        return resultado.toString();
    }

    public static String cambiaCapitalizacion(String cadea) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isLowerCase(cadea.charAt(i))) {
                resultado.append(Character.toUpperCase(cadea.charAt(i)));
            } else if (Character.isUpperCase(cadea.charAt(i))) {
                resultado.append(Character.toLowerCase(cadea.charAt(i)));
            } else {
                resultado.append(cadea.charAt(i));
            }
        }
        return resultado.toString();
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
