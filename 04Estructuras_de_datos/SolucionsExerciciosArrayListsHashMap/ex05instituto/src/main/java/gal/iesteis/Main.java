package gal.iesteis;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instituto instituto = new Instituto("IES Teis", "Rúa da Praía s/n");

        // Creación de entidades de prueba
        Alumnx alumnoValido = new Alumnx("Ana", "Pérez", LocalDate.of(2010, 5, 15));
        System.out.println("Alumno válido: " + alumnoValido);
        Alumnx alumnoInvalido = new Alumnx("", "", LocalDate.now().plusDays(1));
        System.out.println("Alumno inválido: " + alumnoInvalido);

        Profesorx profesorValido = new Profesorx("Carlos", "Matemáticas");
        System.out.println("Profesor válido: " + profesorValido);
        Profesorx profesorInvalido = new Profesorx("", "");
        System.out.println("Profesor inválido: " + profesorInvalido);

        Asignatura asignaturaValida = new Asignatura("Matemáticas", 5);
        System.out.println("Asignatura válida: " + asignaturaValida);
        Asignatura asignaturaInvalida = new Asignatura("", 0);
        System.out.println("Asignatura inválida: " + asignaturaInvalida);

        Curso cursoValido = new Curso("1ºESO", 'A');
        System.out.println("Curso válido: " + cursoValido);
        Curso cursoInvalido = new Curso("7ºESO", '3');
        System.out.println("Curso inválido: " + cursoInvalido);


        System.out.println("\n=== GESTIÓN DE CURSOS ===");
        cursoValido.engadirAlumnx(alumnoValido);
        cursoValido.engadirAsignatura(asignaturaValida, profesorValido);
        System.out.println("Alumnos en curso válido: " );
        System.out.println(cursoValido);

        cursoInvalido.engadirAlumnx(alumnoInvalido);
        System.out.println(cursoInvalido);

        System.out.println("\n=== ASIGNACIÓN DE TUTORES ===");
        instituto.engadirTitorx(cursoValido, profesorValido);

        System.out.println(instituto);
    }
}