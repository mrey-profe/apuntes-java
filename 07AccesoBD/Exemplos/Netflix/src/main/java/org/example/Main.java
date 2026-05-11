package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT * FROM netflix_shows WHERE release_year > ?";
        try (Connection conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/netflix", "usuario", "renaido");
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setInt(1, 2010);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                System.out.println(resultado.getString("title") + " " + resultado.getInt("release_year"));
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}