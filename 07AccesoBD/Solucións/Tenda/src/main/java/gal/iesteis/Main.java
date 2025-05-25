package gal.iesteis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto DAO con os datos de conexión
        DAO dao = new DAO("jdbc:mysql://localhost:3306/tendaBD", "root", "renaido");

        // Lista de países
        HashMap<String, Integer> paises = dao.devolverPaises();

        // Imprimir a lista de países
        for (String pais : paises.keySet()) {
            System.out.println(paises.get(pais) + " " + pais);
        }
        Scanner teclado = new Scanner(System.in);
        // Solicitar ao usuario que introduza un número de país
        int numeroPais;
        do {
            System.out.print("Introduce o número do país que desexas consultar: ");
            numeroPais = teclado.nextInt();
            teclado.nextLine();
        } while (numeroPais < 1 || numeroPais > paises.size());

        ArrayList<Cliente> clientes = dao.devolverClientes(numeroPais);
        // Imprimir a lista de clientes do país seleccionado
        if (clientes.isEmpty()) {
            System.out.println("Non hai clientes para o país seleccionado.");
        } else {
            System.out.println("Clientes do país seleccionado:");
            System.out.println("Nome\t\tApelidos\tPoboación");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }

        // Inserción de novo cliente
        System.out.print("Introduce o nome do novo cliente: ");
        String nome = teclado.nextLine();
        System.out.print("Introduce os apelidos do novo cliente: ");
        String apelidos = teclado.nextLine();
        System.out.print("Introduce a poboación do novo cliente: ");
        String poboacion = teclado.nextLine();
        System.out.print("Introduce a data de alta do novo cliente (YYYY-MM-DD): ");
        String data = teclado.nextLine();
        LocalDate dataAlta = LocalDate.parse(data);
        boolean insercionExitosa = dao.insertarCliente(nome, apelidos, dataAlta, numeroPais);
        if (insercionExitosa) {
            System.out.println("Cliente inserido correctamente.");
        } else {
            System.out.println("Cliente duplicado ou erro ao inserir.");
        }


        // Listaxe e borrado de artigos
        ArrayList<Artigo> artigos = dao.devolverArtigos();

        if (artigos.isEmpty()) {
            System.out.println("Non hai artigos na lista.");
        } else {
            System.out.println("Lista de artigos:");
            for (Artigo artigo : artigos) {
                System.out.println(artigo);
            }
        }

        System.out.println("Escolla o código do artigo que desexas borrar:");
        String codigoArtigo = teclado.nextLine();
        boolean borradoExitoso = dao.borrarArtigo(codigoArtigo);
        if (borradoExitoso) {
            System.out.println("Artigo borrado correctamente.");
        } else {
            System.out.println("Erro ao borrar o artigo ou artigo non existe.");
        }

    }
}