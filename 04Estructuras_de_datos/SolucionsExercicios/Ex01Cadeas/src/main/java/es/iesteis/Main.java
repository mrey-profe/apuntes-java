package es.iesteis;

public class Main {
    public static void main(String[] args) {
        OperacionsCadeas.amosarCaracteres("Ola que tal?");
        System.out.println(OperacionsCadeas.empezaPor("Hola", "Hasadsdfd"));
        System.out.println(OperacionsCadeas.contarCaracteres("Blablabla", 'a'));
        System.out.println(OperacionsCadeas.contarPalabras("  a  Hola que   tal  fffa"));
        System.out.println(OperacionsCadeas.iniciaisMaiusculas("  a  Hola que   tal  fffa"));
        System.out.println(OperacionsCadeas.inverter("Blablabla"));
        System.out.println(OperacionsCadeas.substituirCaracteres("Blablabla", 'a', 'o'));
        System.out.println(OperacionsCadeas.contenSubcadea("La blanca casa", "cal"));
    }
}