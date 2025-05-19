package ex06nadadores;

/**
 *
 * @author marta
 */
public class BaleaAzul implements Nadador{
    private int idade;

    public BaleaAzul(int idade) {
        this.idade = idade;
    }

    @Override
    public double nadar(int m) {
        double velocidade;
        if (idade < 5) {
            velocidade = 13 / 3.6;
        } else {
            velocidade = 10 / 3.6;
        }
        return m/velocidade;
    }
}
