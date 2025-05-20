package harrypotter;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Hogwarts {

    private ArrayList<Mago> alumnxs;
    private HashMap<String, Profesor> profesores;
    private Random xerador;

    public Hogwarts() {
        alumnxs = new ArrayList<>();
        profesores = new HashMap<>();
        xerador = new Random();
    }

    public void engadirAlumnx(Mago mago) {
        Casa[] casas = Casa.values();
        Casa casaAsignada = casas[xerador.nextInt(casas.length)];
        mago.setCasa(casaAsignada);
        alumnxs.add(mago);
    }

    public void graduar(Mago mago) {
        alumnxs.remove(mago);
    }

    public void asignarProfesor(String materia, Profesor profesor) {
        profesores.put(materia, profesor);
    }

    public void listarProfesores() {
        for (String materia : profesores.keySet()) {
            System.out.println(profesores.get(materia).getNome() + " imparte " + materia);
        }
    }

    public ArrayList<Mago> alumnadoCasa(Casa casa) {
        ArrayList<Mago> alumnxsCasa = new ArrayList<>();
        for (Mago mago : alumnxs) {
            if (mago.getCasa() == casa) {
                alumnxsCasa.add(mago);
            }
        }
        return alumnxsCasa;
    }
}
