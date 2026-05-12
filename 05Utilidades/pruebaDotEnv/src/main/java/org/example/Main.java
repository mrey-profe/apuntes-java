package org.example;

// Requiere la dependencia dotenv-java en el proyecto
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

public class Main {
    static void main() {
        Dotenv dotenv = Dotenv.load(); // busca .env en la raíz del proyecto

        String host = dotenv.get("DB_HOST");
        String user = dotenv.get("DB_USER");
        String pass = dotenv.get("DB_PASS");

        try (Connection conn = DriverManager.getConnection(host, user, pass)) {
            System.out.println("Conexión establecida correctamente");
        } catch (Exception e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
    }
}
