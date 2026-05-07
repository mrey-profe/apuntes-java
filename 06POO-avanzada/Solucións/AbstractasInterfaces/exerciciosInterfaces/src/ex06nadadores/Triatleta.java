package ex06nadadores;

import java.util.Random;

/**
 *
 * @author marta
 */
public class Triatleta implements Nadador, Ciclista, Saltador {
    private Random r;

    public Triatleta() {
        r = new Random();
    }
 
    @Override
    public double nadar(int m) {
        //Velocidade entre 0 e 2,5 m/s
        double velocidade = r.nextDouble() * 2.5;
        return m / velocidade;
    }

    @Override
    public double percorrer(int km, String terreo) {
                double velocidade = 0;
        switch (terreo.toLowerCase()) {
            case "asfalto":
                velocidade = 30; //km/h
            case "terra":
                velocidade = 15;              
        }
        return 3600 * km / velocidade;
    }

    @Override
    public int saltarAltura() {
        //Entre 0 e 300 cm
        return r.nextInt(300);
    }
    
}
