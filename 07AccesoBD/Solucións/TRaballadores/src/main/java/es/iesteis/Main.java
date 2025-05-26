package es.iesteis;

import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String sentencia = "select empNome from empregado where empSalario <= ?";
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/traballadores", "root", "renaido");
            PreparedStatement ps3 = conexion.prepareStatement(sentencia)) {
            Scanner t = new Scanner(System.in);
            System.out.println("Queres ver os empleados de salarios?");
            String seguir = t.nextLine();
            while (seguir.equals("si")) {
                System.out.println("Escribe unha cantidade: ");
                double cantidade = t.nextDouble();
                ps3.setDouble(1, cantidade);
                ResultSet resultado = ps3.executeQuery();
                while (resultado.next()) {
                    System.out.println(resultado.getString("empNome"));
                }
                resultado.close();
                System.out.println("Quieres seguir con otra cantidad?: ");
                seguir = t.next();
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

        String sentencia2 = "select empNome from empregado join departamento on (empDepartamento = depNumero) where depNome = ?";

        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/traballadores", "root", "renaido");
            PreparedStatement ps4 = conexion.prepareStatement(sentencia2)) {
            Scanner t = new Scanner(System.in);
            System.out.println("Queres ver os empleados dos departamentos?");
            String seguir = t.nextLine();
            while (seguir.equals("si")) {
                System.out.println("Escribe un departamento: ");
                String dep = t.nextLine();
                ps4.setString(1, dep);
                try (ResultSet resultado = ps4.executeQuery()) {
                    while (resultado.next()) {
                        System.out.println(resultado.getString("empNome"));
                    }
                } catch (SQLException e) {
                    System.out.println("Error con el ResultSet: " + e.getMessage());
                }
                System.out.println("Quieres seguir con otro departamento?: ");
                seguir = t.nextLine();
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

        String sentencia3 = "insert into departamento values (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/traballadores", "root", "renaido");
            PreparedStatement ps5 = conexion.prepareStatement(sentencia3)) {
            Scanner t = new Scanner(System.in);
            System.out.println("Queres crear un departamento?");
            String seguir = t.nextLine();
            while (seguir.equals("si")) {
                System.out.println("Escribe un nº de departamento: ");
                int num = t.nextInt();
                ps5.setInt(1, num);
                System.out.println("Escribe un nome de departamento: ");
                String nome = t.next();
                ps5.setString(2, nome);
                System.out.println("Escribe un nº de director de departamento: ");
                int dir = t.nextInt();
                ps5.setInt(3, dir);
                System.out.println("Escribe el tipo de director(P/F): ");
                String tipodir = t.next();
                ps5.setString(4, tipodir);
                System.out.println("Escribe un presupuesto: ");
                double pres = t.nextDouble();
                ps5.setDouble(5, pres);
                System.out.println("Escribe un nº de departamento del que depende(tiene que existir): ");
                int depdep = t.nextInt();
                ps5.setInt(6, depdep);
                System.out.println("Escribe un nº de centro: ");
                int centro = t.nextInt();
                ps5.setInt(7, centro);
                System.out.println("Escribe un nº de empregados: ");
                int numemp = t.nextInt();
                ps5.setInt(8, numemp);
                int resultado = ps5.executeUpdate();
                if (resultado==1) {
                    System.out.println("ha sido insertado correctamente");
                }
                System.out.println("Quieres seguir con otro departamento?: ");
                seguir = t.next();
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

        String sentencia4 = "update empregado set empSalario = empSalario * 1.05";
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/traballadores", "root", "Abc123.");
            PreparedStatement ps6 = conexion.prepareStatement(sentencia4)) {
            int filasModificadas = ps6.executeUpdate();
            System.out.println("Filas modificadas: " + filasModificadas);
        }catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

        String sentencia5 = "delete d, e from departamento as d join empregado as e where depNumero = empDepartamento AND  depNome = ?";
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/traballadores", "root", "Abc123.");
            PreparedStatement ps7 = conexion.prepareStatement(sentencia5)) {
            Scanner t = new Scanner(System.in);
            System.out.println("Departamento a eliminar?");
            String dep = t.nextLine();
            ps7.setString(1, dep);
            int numFilas = ps7.executeUpdate();
            System.out.println(numFilas + " filas eliminadas");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}