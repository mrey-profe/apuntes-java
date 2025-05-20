package gal.iesteis;

import java.util.HashMap;

public class Abono {
    private String tipoAbono;
    private String grada;
    private double prezoAbono;
    private static String[] tiposAbonos = {"Adulto", "Maiores65", "Sub30", "Sub25", "Sub15", "Infantil"};
    private static final HashMap<String, HashMap<String, Double>> prezosAbonos;

    static {
        prezosAbonos = new HashMap<>();

        HashMap<String, Double> tribunaAlta = new HashMap<>();
        tribunaAlta.put("Adulto", 728.0);
        tribunaAlta.put("Maiores65", 437.0);
        tribunaAlta.put("Sub30", 554.0);
        tribunaAlta.put("Sub25", 463.0);
        tribunaAlta.put("Sub15", 188.0);
        tribunaAlta.put("Infantil", 50.0);
        prezosAbonos.put("Tribuna Alta", tribunaAlta);

        HashMap<String, Double> tribunaBaixa = new HashMap<>();
        tribunaBaixa.put("Adulto", 550.0);
        tribunaBaixa.put("Maiores65", 327.0);
        tribunaBaixa.put("Sub30", 301.0);
        tribunaBaixa.put("Sub25", 199.0);
        tribunaBaixa.put("Sub15", 140.0);
        tribunaBaixa.put("Infantil", 50.0);
        prezosAbonos.put("Tribuna Baixa", tribunaBaixa);

        HashMap<String, Double> rioBaixo = new HashMap<>();
        rioBaixo.put("Adulto", 530.0);
        rioBaixo.put("Maiores65", 327.0);
        rioBaixo.put("Sub30", 301.0);
        rioBaixo.put("Sub25", 199.0);
        rioBaixo.put("Sub15", 140.0);
        rioBaixo.put("Infantil", 50.0);
        prezosAbonos.put("Río Baixo", rioBaixo);

        HashMap<String, Double> rioAlto = new HashMap<>();
        rioAlto.put("Adulto", 475.0);
        rioAlto.put("Maiores65", 292.0);
        rioAlto.put("Sub30", 269.0);
        rioAlto.put("Sub25", 193.0);
        rioAlto.put("Sub15", 134.0);
        rioAlto.put("Infantil", 50.0);
        prezosAbonos.put("Río Alto", rioAlto);

        HashMap<String, Double> marcadorAlto = new HashMap<>();
        marcadorAlto.put("Adulto", 345.0);
        marcadorAlto.put("Maiores65", 224.0);
        marcadorAlto.put("Sub30", 207.0);
        marcadorAlto.put("Sub25", 155.0);
        marcadorAlto.put("Sub15", 104.0);
        marcadorAlto.put("Infantil", 50.0);
        prezosAbonos.put("Marcador Alto", marcadorAlto);

        HashMap<String, Double> marcadorBaixo = new HashMap<>();
        marcadorBaixo.put("Adulto", 345.0);
        marcadorBaixo.put("Maiores65", 224.0);
        marcadorBaixo.put("Sub30", 207.0);
        marcadorBaixo.put("Sub25", 155.0);
        marcadorBaixo.put("Sub15", 104.0);
        marcadorBaixo.put("Infantil", 50.0);
        prezosAbonos.put("Marcador Baixo", marcadorBaixo);
    }

    /**
     * Construtor que inicializa un novo abono co seu tipo e grada.
     *
     * @param tipoAbono o tipo de abono
     * @param grada a grada do abono
     */
    public Abono(String tipoAbono, String grada) throws AbonoIncorrectoException, GradaIncorrectaException {
        if (!eAbonoCorrecto(tipoAbono)) {
            throw new AbonoIncorrectoException("Tipo de abono incorrecto: " + tipoAbono);
        }
        if (!eGradaCorrecta(grada)) {
            throw new GradaIncorrectaException("Grada incorrecta: " + grada);
        }
        this.tipoAbono = tipoAbono;
        this.grada = grada;
        this.prezoAbono = prezosAbonos.get(grada).get(tipoAbono);
    }

    /**
     * Método que comproba se o tipo de abono é correcto.
     *
     * @param tipoAbono o tipo de abono a comprobar
     *
     * @return true se o tipo de abono é correcto, false se non
     */
    private boolean eAbonoCorrecto(String tipoAbono) {
        for (String abono : tiposAbonos) {
            if (abono.equals(tipoAbono)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que comproba se a grada é correcta.
     *
     * @param grada a grada a comprobar
     *
     * @return true se a grada é correcta, false se non
     */
    private boolean eGradaCorrecta(String grada) {
        for (String g : prezosAbonos.keySet()) {
            if (g.equals(grada)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Abono{" +
                "tipoAbono='" + tipoAbono + '\'' +
                ", grada='" + grada + '\'' +
                ", prezoAbono=" + prezoAbono +
                '}';
    }

    public double getPrezoAbono() {
        return prezoAbono;
    }
}
