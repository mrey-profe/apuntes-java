package gal.iesteis;

public class PuntosVidaIncorrectosException extends Exception {
    public PuntosVidaIncorrectosException() {
        super("Os puntos de vida deben estar entre 0 e 200");
    }
}
