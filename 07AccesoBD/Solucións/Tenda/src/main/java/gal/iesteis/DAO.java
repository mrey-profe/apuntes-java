package gal.iesteis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.*;
import java.util.HashMap;

public class DAO {
    private String url;
    private String usuario;
    private String password;

    public DAO(String url, String usuario, String password) {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
    }

    public HashMap<String, Integer> devolverPaises() {
        HashMap<String, Integer> paises = new HashMap<>();
        String sql = "SELECT pai_nome, pai_id FROM paises";

        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {
                paises.put(resultado.getString("pai_nome"), resultado.getInt("pai_id"));
            }
        } catch (SQLException e) {
            System.out.println("Error ao conectar á base de datos: " + e.getMessage());
        }

        return paises;
    }

    public ArrayList<Cliente> devolverClientes(int codigoPais) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT clt_nome, clt_apelidos, clt_poboacion FROM clientes WHERE clt_pais = ?";

        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setInt(1, codigoPais);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nome = resultado.getString("clt_nome");
                String apelidos = resultado.getString("clt_apelidos");
                String poboacion = resultado.getString("clt_poboacion");
                clientes.add(new Cliente(nome, apelidos, poboacion));
            }
        } catch (SQLException e) {
            System.out.println("Error ao conectar á base de datos: " + e.getMessage());
        }

        return clientes;
    }

    public boolean insertarCliente(String nome, String apelidos, LocalDate dataAlta, int codigoPais) {
        String sql = "INSERT INTO clientes (clt_nome, clt_apelidos, clt_alta, clt_pais) VALUES (?, ?, ?, ?)";
        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, nome);
            sentencia.setString(2, apelidos);
            sentencia.setDate(3, Date.valueOf(dataAlta));
            sentencia.setInt(4, codigoPais);

            int filasAfectadas = sentencia.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error ao insertar o cliente: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Artigo> devolverArtigos() {
        ArrayList<Artigo> artigos = new ArrayList<>();
        String sql = "SELECT art_codigo, art_nome FROM artigos";

        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {
                String codigo = resultado.getString("art_codigo");
                String nome = resultado.getString("art_nome");
                artigos.add(new Artigo(codigo, nome));
            }
        } catch (SQLException e) {
            System.out.println("Error ao conectar á base de datos: " + e.getMessage());
        }

        return artigos;
    }

    public boolean borrarArtigo(String codigoArtigo) {
        String sql = "DELETE FROM artigos WHERE art_codigo = ?";
        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, codigoArtigo);
            int filasAfectadas = sentencia.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error ao borrar o artigo: " + e.getMessage());
            return false;
        }
    }
}
