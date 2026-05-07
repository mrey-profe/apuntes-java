package gal.iesteis;

import java.util.ArrayList;

public class Equipo {
    private String nome;
    private int anoFundacion;
    private String estadio;
    private int aforo;
    private ArrayList<Abono> abonos;
    private ArrayList<Celtista> celtistas;

    /**
     * Construtor que inicializa un novo equipo co seu nome, ano de fundación,
     * estadio e aforo.
     *
     * @param nome        o nome do equipo
     * @param anoFundacion o ano de fundación do equipo
     * @param estadio     o estadio do equipo
     * @param aforo      o aforo do estadio
     */
    public Equipo(String nome, int anoFundacion, String estadio, int aforo) {
        this.nome = nome;
        this.anoFundacion = anoFundacion;
        this.estadio = estadio;
        this.aforo = aforo;
        this.abonos = new ArrayList<>();
        this.celtistas = new ArrayList<>();
    }

    public void engadarAbono(Abono abono) {
        this.abonos.add(abono);
    }

    public void engadarCeltista(Celtista celtista) {
        this.celtistas.add(celtista);
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Equipo: ").append(nome).append("\n");
        resultado.append("Ano de fundación: ").append(anoFundacion).append("\n");
        resultado.append("Estadio: ").append(estadio).append("\n");
        resultado.append("Aforo: ").append(aforo).append("\n");
        resultado.append("Abonos: \n");
        for (Abono abono : abonos) {
            resultado.append(abono.toString()).append("\n");
        }
        resultado.append("Celtistas: \n");
        for (Celtista celtista : celtistas) {
            resultado.append(celtista.toString()).append("\n");
        }
        return resultado.toString();
    }
}
