package es.iesteis;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentencia = "SELECT e.empNome, d.depNome " +
                            "FROM empregado AS e " +
                            "JOIN departamento AS d " +
                            "ON (depNumero = empDepartamento)";
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/traballadores", "root", "renaido");
            PreparedStatement ps = conexion.prepareStatement(sentencia);
            ResultSet resultado = ps.executeQuery()) {
            while (resultado.next()) {
                System.out.print(resultado.getString("empNome"));
                System.out.println("\tDepartamento: " + resultado.getString("depNome"));
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

        // Borrado

        String sentenza2 = "DELETE FROM empregado WHERE empSalario < 1000";
        try (Connection conexion2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/traballadores", "root", "renaido");
             PreparedStatement ps2 = conexion2.prepareStatement(sentenza2);) {
            int numFilas = ps2.executeUpdate();
            System.out.println("Borradas " + numFilas + " filas.");
        } catch (SQLException e) {
            System.out.println("Erro na BD " + e.getMessage());
        }

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe o departamento: ");
        String departamento = teclado.nextLine();

        String sentenza3 = "SELECT e.empNome " +
                "FROM empregado AS e " +
                "JOIN departamento AS d " +
                "ON (depNumero = empDepartamento) " +
                "WHERE d.depNome = ?";

        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/traballadores", "root", "renaido");
             PreparedStatement ps3 = conexion.prepareStatement(sentenza3);) {
            ps3.setString(1, departamento);
            ResultSet resultado = ps3.executeQuery();
            while (resultado.next()) {
                System.out.println(resultado.getString("empNome"));
            }
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

    }
}