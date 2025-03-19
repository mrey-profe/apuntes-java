public class ContaBancaria {
    private String id;
    private String titular;
    private double saldo;
    private String ultimoMovemento;

    public ContaBancaria(String id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
        ultimoMovemento = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getUltimoMovemento() {
        return ultimoMovemento;
    }

    public void setUltimoMovemento(String ultimoMovemento) {
        this.ultimoMovemento = ultimoMovemento;
    }

    public boolean movemento(String tipo, double valor, String concepto) {
        if (tipo.equals("ingreso")) {
            saldo += valor;
        } else {
            saldo -= valor;
        }
        ultimoMovemento = concepto; // ou this.ultimoMovemento = concepto
        return saldo >= 0;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "id='" + id + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", ultimoMovemento='" + ultimoMovemento + '\'' +
                '}';
    }

    public void amosarInformación() {
        System.out.println("ContaBancaria{" +
                "id='" + id + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", ultimoMovemento='" + ultimoMovemento + '\'' +
                '}');
    }
}
