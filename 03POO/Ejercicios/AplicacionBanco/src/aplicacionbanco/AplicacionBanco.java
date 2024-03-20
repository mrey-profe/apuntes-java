package aplicacionbanco;

public class AplicacionBanco {

    public static void main(String[] args) {
        try {
            CuentaBancaria cuenta = new CuentaBancaria("Alguien", "123456789", 200);
            System.out.println(cuenta);
            if (!cuenta.movimiento(100, true)) {
                System.out.println("Cuenta en números rojos");
            }
            System.out.println(cuenta);
            if (!cuenta.movimiento(1000, false)) {
                System.out.println("Cuenta en números rojos");
            }
            System.out.println(cuenta);
        } catch (Exception e) {
            System.out.println("No se ha podido crear la cuenta");
        }
    }
}
