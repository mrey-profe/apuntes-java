# Exercicios de Enumerados

## Exercicio 1: Peso nos Planetas

A partir do seguinte enumerado, crea un programa que, dado o teu peso na superficie da Terra, amose o teu peso na superficie de cada un dos planetas.

```java
public enum Planeta {
    MERCURIO(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    TERRA(5.976e+24, 6.37814e6),
    MARTE(6.421e+23, 3.3972e6),
    XUPITER(1.9e+27, 7.1492e7),
    SATURNO(5.688e+26, 6.0268e7),
    URANO(8.686e+25, 2.5559e7),
    NEPTUNO(1.024e+26, 2.4746e7);

    private final double masa; // en kilogramos
    private final double radio; // en metros

    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    private double masa() {
        return masa;
    }

    private double radio() {
        return radio;
    }

    // constante gravitacional universal (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    double gravidadeSuperficie() {
        return G * masa / (radio * radio);
    }

    double pesoSuperficie(double outraMasa) {
        return outraMasa * gravidadeSuperficie();
    }
}
```

**NOTA:** Unha vez feito o exercicio, executa paso a paso o código para ver como se constrúe cada `Planeta`.

## Exercicio 2: Cálculo de Tarima Flotante

Unha empresa de colocación de chans de tarima flotante necesita un programa no que se introduza a anchura e lonxitude dunha habitación e o tipo de madeira, e calcule a cantidade de caixas de tarima precisas e o importe a pagar.

- Cada caixa contén **2,5 metros cadrados** de tarima.
- As caixas véndense enteiras, é dicir, se ao facer os cálculos fan falta 7,1 caixas, haberá que mercar 8.
- O prezo de cada caixa depende do tipo de madeira:
  - **CARBALLO**: 40€
  - **SAPELLY**: 50€
  - **NOGUEIRA**: 60€
  - **CERDEIRA**: 70€
  - **BAMBÚ**: 100€

Crea unha enumeración para o tipo de madeira que inclúa o seu prezo e unha aplicación que calcule o número de caixas a comprar e o importe a pagar.