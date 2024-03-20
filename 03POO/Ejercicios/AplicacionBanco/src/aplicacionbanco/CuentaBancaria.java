package aplicacionbanco;

public class CuentaBancaria {

    private String nombreTitular;
    private String numCuenta;
    private double saldo;

    public CuentaBancaria(String nombreTitular, String numCuenta, double saldo) throws Exception {
        if (nombreTitularCorrecto(nombreTitular)) {
            this.nombreTitular = nombreTitular;
        } else {
            throw new Exception("El nombre no puede estar vacío");
        }
        this.numCuenta = numCuenta;
        if (!saldoNegativo(saldo)) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    public CuentaBancaria(String nombreTitular, String numCuenta) throws Exception {
        this(nombreTitular, numCuenta, 0); //Llama al otro constructor
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        if (nombreTitularCorrecto(nombreTitular)) {
            this.nombreTitular = nombreTitular;
        }
    }

    private boolean nombreTitularCorrecto(String nombre) {
        return nombre.length() != 0;
    }

    private boolean saldoNegativo(double saldo) {
        return saldo < 0;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nombreTitular=" + nombreTitular + ", numCuenta=" + numCuenta + ", saldo=" + saldo + '}';
    }

    /**
     * Método para realizar ingresos y retiradas en la cuenta.
     *
     * @param cantidad Cantidad de dinero a ingresar/retirar.
     * @param ingreso Será true para ingresos y false para retiradas.
     * @return false si el saldo final es negativo; true, en caso contrario
     */
    public boolean movimiento(double cantidad, boolean ingreso) {
        if (ingreso) {
            saldo += cantidad;
        } else {
            saldo -= cantidad;
        }
        //saldo += ingreso?cantidad:-cantidad;
        //saldo = ingreso?saldo+cantidad;saldo-cantidad
        return saldo >= 0;
    }

}
