package ex06rimas;

/**
 *
 * @author marta
 */
public class Poesia {

    public static boolean riman3letras(String cadea1, String cadea2) {
        boolean riman = false;
        if (cadea1.length() >= 3 && cadea2.length() >= 3) {
            //Extraio as 3 últimas letras da primeira cadea:
            String fin1 = cadea1.substring(cadea1.length() - 3).toLowerCase();
            riman = cadea2.toLowerCase().endsWith(fin1);
            /*riman = cadea2.endsWith(cadea1.substring(cadea1.length() - 3));*/
        }
        return riman;
    }

    public static boolean rimanConsonante(String cadea1, String cadea2) {
        StringBuffer cadeaSB1 = new StringBuffer(cadea1.toLowerCase());
        StringBuffer cadeaSB2 = new StringBuffer(cadea2.toLowerCase());
        cadeaSB1.reverse();
        cadeaSB2.reverse();

        boolean riman = true;
        int numVogais = 0;

        for (int i = 0; i < cadeaSB1.length() && i < cadeaSB2.length()
                && numVogais < 2 && riman; i++) {
            if (cadeaSB1.charAt(i) != cadeaSB2.charAt(i)) {
                riman = false;
            } else {
                switch (cadeaSB1.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        numVogais++;
                }
            }
        }
        return riman;
    }

    public static boolean rimanAsonante(String cadea1, String cadea2) {
        StringBuffer cadeaSB1 = new StringBuffer(cadea1.toLowerCase());
        StringBuffer cadeaSB2 = new StringBuffer(cadea2.toLowerCase());
        cadeaSB1.reverse();
        cadeaSB2.reverse();

        boolean riman = true;
        int numVogais = 0;

        for (int i = 0; i < cadeaSB1.length() && i < cadeaSB2.length()
                && numVogais < 2 && riman; i++) {
            switch (cadeaSB1.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    if (cadeaSB1.charAt(i) != cadeaSB2.charAt(i)) {
                        riman = false;
                    }
                    numVogais++;
            }
        }
        return riman;
    }
}
