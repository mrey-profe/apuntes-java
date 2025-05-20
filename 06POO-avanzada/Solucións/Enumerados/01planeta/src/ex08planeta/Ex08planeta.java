package ex08planeta;

/**
 *
 * @author marta
 */
public class Ex08planeta {

    public static void main(String[] args) {
        double pesoTerra = 75; //peso = masa * g
        double masa = pesoTerra / Planeta.TERRA.gravidadeSuperficie();
        
        for (Planeta p : Planeta.values()) {
            System.out.printf("O teu peso en %s é %.2f\n", p, p.pesoSuperficie(masa));
        }
    }
}
