package ex06nadadores;

import java.util.Random;

/**
 *
 * @author marta
 */
public class Delfin implements Nadador {

    @Override
    public double nadar(int m) {
        Random r = new Random();
        double velocidade = (r.nextInt(31) + 40) / 3.6;
        return m/velocidade;
    }
    
}
