public class Main {
    public static void main (String[] args) {
        ContaBancaria conta = new ContaBancaria("ES43 0123 1239", "Juan Pérez", 0);
        System.out.println("id " + conta.getId());
        System.out.println("titular " + conta.getTitular());
        System.out.println("saldo " + conta.getSaldo());
        conta.setTitular("Juan Pérez Martínez");
        System.out.println("titular " + conta.getTitular());
        //System.out.println(conta);
        conta.amosarInformación();
    }
}
