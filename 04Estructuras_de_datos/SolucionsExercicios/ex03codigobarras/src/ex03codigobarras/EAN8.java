package ex03codigobarras;

/**
 *
 * @author marta
 */
public class EAN8 {

    private String codigo;
    private int dixitoControl;

    public EAN8(String codigo) {
        if (codigo.length() == 7) {//Non trae díxito de contro
            this.codigo = codigo;
            this.dixitoControl = calcularDixitoControl(codigo);
        } else if (codigo.length() == 8) {
            if (comprobarDixitoControl(codigo)) {
                this.codigo = codigo.substring(0, codigo.length() - 1);
                this.dixitoControl = 
                        Character.getNumericValue(codigo.charAt(codigo.length() - 1));      
            } else {
                System.out.println("Díxito de control incorrecto");
            }
        } else {
            System.out.println("Código incorrecto");
        }
    }

    private static int calcularDixitoControl(String codigo) {
        int resultado = 0;
        for (int i = 0; i < codigo.length(); i++) {
            int dixito = Character.getNumericValue(codigo.charAt(i));
            /*if (i % 2 == 0) { //Posición impar no código, par na cadea porque empeza por 0
                resultado += dixito * 3;
            } else {
                resultado += dixito;
            }*/
            resultado += (i % 2 == 0) ? dixito * 3 : dixito;
        }
        int resto = resultado % 10;
        if (resto == 0) { //Divisible entre 10
            return 0;
        } else {
            return 10 - resto;
        }
        //return (resto == 0)?0:10-resto;
    }

    public static boolean comprobarDixitoControl(String codigoCompleto) {
        String codigo = codigoCompleto.substring(0, codigoCompleto.length() - 1);
        char dixitoControl = codigoCompleto.charAt(codigoCompleto.length() - 1);
        return Character.getNumericValue(dixitoControl) == calcularDixitoControl(codigo);
    }

    @Override
    public String toString() {
        return "EAN8{" + "codigo=" + codigo + ", dixitoControl=" + dixitoControl + '}';
    }

}
