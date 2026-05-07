package org.example;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
    private final String url;
    private final String user;
    private final String password;

    public DAO(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public ArrayList<Camion> buscarCamionesMayorCapacidad(double capacidad) {
        ArrayList<Camion> camiones = new ArrayList<>();

        String query = "SELECT * FROM Camiones WHERE capacidadCarga > ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDouble(1, capacidad);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    camiones.add(new Camion(resultSet.getString("modelo"),
                            resultSet.getInt("numeroDeSerie"),
                            TipoCombustible.valueOf(resultSet.getString("tipoCombustible")),
                            resultSet.getInt("capacidadCarga"),
                            resultSet.getInt("cargaActual"),
                            resultSet.getInt("unidadCarga"),
                            resultSet.getString("conductor")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return camiones;
    }

    public boolean eliminarCamion(int numeroSerie) {
        String query = "DELETE FROM Camiones  WHERE numeroDeSerie = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, numeroSerie);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
