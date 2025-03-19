package es.iesteis;

public class Luz {
    private String cor;

    public Luz() {
        cor = "vermella";
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Luz{" +
                "cor='" + cor + '\'' +
                '}';
    }

    public void cambio() {
        cor = switch (cor) {
            case "vermella" -> "verde";
            case "amarela" -> "vermella";
            case "verde" -> "amarela";
            default -> "vermella"; // Se houbese un valor erróneo, dámoslle un correcto
        };
//        switch (cor) {
//            case "vermella" -> cor = "verde";
//            case "amarela" -> cor = "vermella";
//            case "verde" -> cor = "amarela";
//        }

//        switch (cor) {
//            case "vermella":
//                cor = "verde";
//                break;
//            case "amarela":
//                cor = "vermella";
//                break;
//            case "verde":
//                cor = "amarela";
//                break;
//        }

    }
}
