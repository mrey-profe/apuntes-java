package gal.iesteis;

public class Charmander extends Pokemon {
    public Charmander(int puntosVida, int ataqueBase) throws PuntosVidaIncorrectosException {
        super(puntosVida, ataqueBase, Elemento.FUEGO);
    }

    public void atacar(Pokemon obxectivo) {
        if (obxectivo.getTipoElemento() == Elemento.PLANTA) {
            obxectivo.recibirDano(this.getAtaqueBase() + 15);
        } else {
            obxectivo.recibirDano(this.getAtaqueBase());
        }
    }

    public void voar() {
        System.out.println("Estou voando");
    }
}
