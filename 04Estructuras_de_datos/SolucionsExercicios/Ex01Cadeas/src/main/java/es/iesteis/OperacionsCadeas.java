package es.iesteis;

public class OperacionsCadeas {
    public static void amosarCaracteres(String cadea) {
        for (int i = 0; i < cadea.length(); i++) {
            System.out.println(cadea.charAt(i));
        }
    }

    public static boolean empezaPor(String cadea, String subcadea) {
        if (cadea.length() < subcadea.length()) {
            System.out.println("A subcadea debe ter menor lonxitude");
        }
        boolean inicioIgual = true;
        for(int i = 0; i < subcadea.length() && inicioIgual; i++) {
            if (cadea.charAt(i) != subcadea.charAt(i)) {
                inicioIgual = false;
            }
        }
        return inicioIgual;
    }

    public static int contarCaracteres(String cadea, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPalabras(String cadea) {
        int contador = 0;
        for (int i = 1; i < cadea.length(); i++) {
            if (cadea.charAt(i) == ' ' && cadea.charAt(i - 1) != ' ') {
                contador ++;
            }
        }
        //Falta contar a última palabra
        if (cadea.charAt(cadea.length() - 1) != ' ') {
            contador++;
        }
        return contador;
    }

    public static String iniciaisMaiusculas(String cadea) {
        String resultado = String.valueOf(Character.toUpperCase(cadea.charAt(0)));
        // Meto o primeiro carácter en maiúsculas
        for (int i = 1; i < cadea.length(); i++) {
            if (cadea.charAt(i) != ' ' && cadea.charAt(i-1) == ' ') {
                resultado += Character.toUpperCase(cadea.charAt(i));
            } else {
                resultado += cadea.charAt(i);
            }
        }
        return resultado;
    }

    public static String inverter(String cadea) {
        String resultado = "";
        for (int i = cadea.length() - 1; i >= 0; i--) {
            resultado += cadea.charAt(i);
        }
        return resultado;
    }

    public static String substituirCaracteres(String cadea, char orixe, char destino) {
        String resultado = "";
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) == orixe) {
                resultado += destino;
            } else {
                resultado += cadea.charAt(i);
            }
        }
        return resultado;
    }

    public static boolean contenSubcadea(String cadea, String subcadea) {
        for (int i = 0; i < cadea.length(); i++) {
            boolean coincide = true;
            for (int j = 0; j < subcadea.length(); j++) {
                if ((i+j) >= cadea.length() || cadea.charAt(i + j) != subcadea.charAt(j)) {
                    coincide = false;
                    break;
                }
            }
            if (coincide) {
                return true;
            }
        }
        return false;
    }


    
}
