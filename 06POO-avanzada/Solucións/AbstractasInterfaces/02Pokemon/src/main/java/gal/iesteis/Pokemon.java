package gal.iesteis;

public abstract class Pokemon {
    private int puntosVida;
    private int ataqueBase;
    private Elemento tipoElemento;

    public Pokemon(int puntosVida, int ataqueBase, Elemento elemento) throws PuntosVidaIncorrectosException {
        if (!puntosVidaCorrectos(puntosVida)) {
            throw new PuntosVidaIncorrectosException();
        }
        this.puntosVida = puntosVida;
        this.ataqueBase = ataqueBase;
        this.tipoElemento = elemento;
    }

    private boolean puntosVidaCorrectos(int puntosVida) {
        return puntosVida >= 0 && puntosVida <= 200;
    }

    public abstract void atacar (Pokemon obxectivo);

    public void recibirDano (int cantidade) {
        this.puntosVida -= cantidade;
    }

    public boolean estaVivo() {
        return this.puntosVida > 0;
    }

    public String toString() {
        return "Puntos de vida: " + this.puntosVida + "\n" +
               "Ataque base: " + this.ataqueBase + "\n" +
               "Tipo de elemento: " + this.tipoElemento;
    }

    protected Elemento getTipoElemento() {
        return this.tipoElemento;
    }

    protected int getAtaqueBase() {
        return this.ataqueBase;
    }
}
