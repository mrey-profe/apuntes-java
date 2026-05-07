package harrypotter;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class HarryPotter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mago harry = new Mago("Harry Potter", LocalDate.of(1980,7,31), "Nimbus 2000");
        Mago hermione = new Mago("Hermione Granger", LocalDate.of(1979,9,19), "Firebolt");
        Mago ron = new Mago("Ron Weasley", LocalDate.of(1980,3,1), "Comet");
        Mago draco = new Mago("Draco Malfoy", LocalDate.of(1980,6,5), "Nimbus 2000");
        Mago dumbledore = new Mago("Albus Dumbledore", LocalDate.of(1881,7,22), "Cleansweep");
        Profesor snape = new Profesor("Severus Snape", LocalDate.of(1960,1,9), "Nimbus 2000");
        Profesor trelawney = new Profesor("Sybill Trelawney", LocalDate.of(1942,10,28), "Cleansweep");
        Profesor moody = new Profesor("Barty Crouch Jr.", LocalDate.of(1954,2,13), "Cleansweep");
        Profesor sprout = new Profesor("Pomona Sprout", LocalDate.of(1947,8,15), "Nimbus 2000");
        Profesor mcgonagall = new Profesor("Minerva McGonagall", LocalDate.of(1935,10,4), "Cleansweep");
        Muggle petunia = new Muggle("Petunia Dursley", LocalDate.of(1952,6,28), true);
        Muggle vernon = new Muggle("Vernon Dursley", LocalDate.of(1946,12,31), true);
        Muggle dudley = new Muggle("Dudley Dursley", LocalDate.of(1977,6,23), false);

        //Creación dun mago menor de idade
        Mago menor = new Mago("Mago menor", LocalDate.of(2013,6,5), "Nimbus 2014");
        Muggle muggle17 = new Muggle("Muggle Calquera 17", LocalDate.of(2005,6,23), false);
        Muggle muggle18 = new Muggle("Muggle Calquera 18", LocalDate.of(2005,2,23), false);
        System.out.println("O mago " + menor.getNome() + " é " + menor);
        
        Hogwarts h = new Hogwarts();
        h.engadirAlumnx(harry);
        h.engadirAlumnx(hermione);
        h.engadirAlumnx(ron);
        h.engadirAlumnx(draco);
        h.asignarProfesor("Defensa contra as artes escuras", moody);
        h.asignarProfesor("Pocións", snape);
        h.asignarProfesor("Transformacións", mcgonagall);
        h.asignarProfesor("Adiviñación", trelawney);
        h.asignarProfesor("Herboloxí­a", sprout);

        
        
        //Imprime o nome de todos os alumnos de Gryffindor
        ArrayList<Mago> alumnosGryffindor = h.alumnadoCasa(Casa.GRYFFINDOR);
        //Percorre o arraylist e imprime o nome de cada alumno
        System.out.println("Alumnxs de Gryffindor:");
        for (Mago alumno : alumnosGryffindor) {
            System.out.println(alumno.getNome());
        }

        h.listarProfesores();
    }
    
}
