package gal.iesteis;

public class Squirtle extends Pokemon {
    public Squirtle(int puntosVida, int ataqueBase) {
        super(puntosVida, ataqueBase, Elemento.AGUA);
    }

    @Override
    public void atacar(Pokemon obxectivo) {
        if (obxectivo.getTipoElemento() == Elemento.FUEGO) {
            obxectivo.recibirDano(this.getAtaqueBase() + 10);
        } else {
            obxectivo.recibirDano(this.getAtaqueBase());
        }
    }

    public void recibirDano(int cantidade, Pokemon atacante) {
        if (atacante.getTipoElemento() == Elemento.FUEGO) {
            super.recibirDano(cantidade/2);
        } else {
            super.recibirDano(cantidade);
        }
    }
}
