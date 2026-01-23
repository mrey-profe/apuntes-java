//Ejercicio 2

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplaresTotales;
    private int ejemplaresPrestados;

    // Constructor que recibe título, autor y número total de ejemplares
    public Libro(String titulo, String autor, int ejemplaresTotales) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresPrestados = 0;
    }

    // Método prestar()
    public boolean prestar() {
        if (ejemplaresPrestados < ejemplaresTotales) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }

    // Método devolver()
    public boolean devolver() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }


}

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Java Programming", "John Doe", 1);
        
                // Pruebas de préstamos
        System.out.println("Préstamo 1: " + libro1.prestar()); // true
        System.out.println("Préstamo 2: " + libro1.prestar()); // true
        System.out.println("Devolucion 1: " + libro1.devolver()); // false
        System.out.println("Préstamo 3: " + libro1.prestar()); // true
        }
}


//Ejercicio 3
public class Rectangulo {
    public double base;
    public double altura;

    // Constructor que recibe base y altura, con validación
    public Rectangulo(double base, double altura) {
        if (base <= 0) {
            this.base = 1.0;
            System.out.println("Advertencia: base no positiva, se asigna valor 1");
        } else {
            this.base = base;
        }
        
        if (altura <= 0) {
            this.altura = 1.0;
            System.out.println("Advertencia: altura no positiva, se asigna valor 1");
        } else {
            this.altura = altura;
        }
    }

    // Método area()
    public double area() {
        return base * altura;
    }

    // Método perimetro()
    public double perimetro() {
        return 2 * (base + altura);
    }

    // Método esCuadrado()
    public boolean esCuadrado() {
        return base == altura;
    }
}

public class Main {
    public static void main(String[] args) {
        // Pruebas con valores válidos
        Rectangulo r1 = new Rectangulo(5.0, 3.0);
        System.out.println("Rectángulo 1 - Base: " + r1.base + 
                          ", Altura: " + r1.altura);
        System.out.println("Área: " + r1.area());
        System.out.println("Perímetro: " + r1.perimetro());
        System.out.println("¿Es cuadrado? " + r1.esCuadrado());

        // Pruebas con valores inválidos
        Rectangulo r3 = new Rectangulo(-2.0, 0.0);
        System.out.println("Rectángulo 3 (valores inválidos) - Base: " + r3.getBase() + 
                          ", Altura: " + r3.getAltura());
    }
}
//Ejercicio 4

public class Semaforo {
    private String cor;

    // Constructor por defecto
    public Semaforo() {
        this.cor = "vermella";
    }

    // Método getCor()
    public String getCor() {
        return cor;
    }

    // Método cambio() con secuencia: verde → amarela → vermella → verde
    public void cambio() {
        switch (cor) {
            case "verde":
                cor = "amarela";
                break;
            case "amarela":
                cor = "vermella";
                break;
            case "vermella":
                cor = "verde";
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Semaforo s1 = new Semaforo();
        System.out.println("Semaforo 1 - Cor: " + s1.getCor());
        s1.cambio();
        System.out.println("Semaforo 1 - Cor: " + s1.getCor());
        s1.cambio();
        System.out.println("Semaforo 1 - Cor: " + s1.getCor());
        s1.cambio();
        System.out.println("Semaforo 1 - Cor: " + s1.getCor());
        s1.cambio();
        System.out.println("Semaforo 1 - Cor: " + s1.getCor());
    }
}

//Ejercicio 5
public class Persoa {
    private String nome;
    private int idade;
    private String dni;
    private char situacionActual;
    private double peso;
    private double altura;

    // Constructor con validaciones
    public Persoa(String nome, int idade, String dni, char situacionActual, 
                  double peso, double altura) {
        this.nome = nome;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        
        // Validar idade
        if (!eCorrectaIdade(idade)) {
            System.out.println("Erro: Idade non válida (debe estar entre 0 e 150)");
 //           this.idade = -1; // Valor inválido indicador
        } else {
            this.idade = idade;
        }
        
        // Validar situacionActual
        if (!eCorrectaSituacion(situacionActual)) {
            System.out.println("Erro: Situación actual non válida (E, T ou D)");
 //           this.situacionActual = ' ';
        } else {
            this.situacionActual = situacionActual;
        }
    }

    // eMaiorDeIdade()
    public boolean eMaiorDeIdade() {
        return idade >= 18 && idade != -1;
    }

    // Métodos privados de validación
    private boolean eCorrectaSituacion(char situacionActual) {
        if (situacionActual == 'E' || situacionActual == 'T' || situacionActual =='D') {
            return true;
        } else {
            return false;
        }
        //return situacionActual == 'E' || situacionActual == 'T' || situacionActual == 'D';
    }
    
    private boolean eCorrectaIdade(int idade) {
        if (idade < 0 || idade > 150) {
            return false;
        }else{
            return true;
        }
        //return idade >= 0 && idade <= 150;
    }

    // mostrarInformación()
    public void mostrarInformacion() {
        System.out.println("Persoa");
        System.out.println("------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("DNI: " + dni);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Altura: " +altura + "cm");
        System.out.println();
    }
}

public class Main{
    public static void main(String[] args) {
        //Con datos correctos:
        Persoa persoa1 = new Persoa("Juan", 25, "12345678A", 'E', 70.5, 1.75);
        persoa1.mostrarInformacion();
        //Con datos incorrectos:
        Persoa persoa2 = new Persoa("Juan", -25, "12345678A", 'X', 70.5, 1.75);
        persoa2.mostrarInformacion();
    }
}

//Añadir al ejercicio 2
    // Getters para mostrar información
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getEjemplaresTotales() { return ejemplaresTotales; }
    public int getEjemplaresPrestados() { return ejemplaresPrestados; }

//Añadir al ejercicio 3
    // Getters para mostrar información
    public double getBase() { return base; }
    public double getAltura() { return altura; }

    @Override
    public String toString() {
        return String.format("Rectángulo[base=%.2f, altura=%.2f, área=%.2f, perímetro=%.2f, cuadrado=%s]",
                           base, altura, area(), perimetro(), esCuadrado() ? "sí" : "no");
    }
//Añadir al ejercicio 4

