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
}
