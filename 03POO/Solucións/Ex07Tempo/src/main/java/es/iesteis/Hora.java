package es.iesteis;

public class Hora {
    public int horas;
    public int minutos;

    public Hora(int horas, int minutos) {
        if (eCorrectaHora(horas)) {
            this.horas = horas;
        } else {
            throw new IllegalArgumentException("As horas deben estar entre 0 e 23");
        }
        if (sonCorrectosMinutos(minutos)) {
            this.minutos = minutos;
        } else {
            throw new IllegalArgumentException("Os minutos deben estar entre 0 e 59");
        }
    }

    public static final boolean eCorrectaHora(int hora) {
        return hora >= 0 && hora <= 23;
    }

    public static final boolean sonCorrectosMinutos(int minutos) {
        return minutos >= 0 && minutos <= 59;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (!eCorrectaHora(horas)) {
            throw new IllegalArgumentException("As horas deben estar entre 0 e 23");
        }
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (!sonCorrectosMinutos(minutos)) {
            throw new IllegalArgumentException("Os minutos deben estar entre 0 e 59");
        }
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", horas, minutos);
    }

    public void amosarHora() {
        System.out.println(this);
    }

    public void incrementarMinutos() {
//        minutos++;
//        if (minutos == 60) {
//            minutos = 0;
//            horas++;
//            if (horas == 24) {
//                horas = 0;
//            }
//        }
        minutos = (minutos + 1) % 60;
        if (minutos == 0) {
            horas = (horas + 1) % 24;
        }
    }
}
