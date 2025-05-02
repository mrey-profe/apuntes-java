# Ejercicios herencia

## Exercicio 1 (https://wirtzjava.blogspot.com/)

## Exercicio de Herdanza en Java: Traballadores

### Enunciado

Crea unha aplicación en Java que modele unha empresa con distintos tipos de traballadores empregando herdanza. Segue as seguintes especificacións:

**1. Clase base: `Traballador`**

- Atributos privados:
  - `id`
  - `nome`
  - `dataNacemento` (LocalDate)
  - `salarioBase`
- Métodos:
  - Construtor que inicialice todos os atributos.
  - Métodos *getter* e *setter* para todos os atributos.
  - Método `toString()` para mostrar a información do traballador.
  - Método `equals(Object o)` que devolva `true` se dous traballadores teñen o mesmo `id`.

**2. Subclase: `Asalariado`**

- Atributos adicionais:
  - `salarioFinal` 
  - `horasExtra`
- Métodos:
  - Construtor que reciba os datos do pai e inicialice `horasExtra` a 0 e `salarioFinal` igual a `salarioBase`.
  - Métodos *getter* e *setter* para `horasExtra`. *Getter* para `salarioFinal`.
  - Método `calcularSalarioFinal(double prezoHoraExtra)` que actualice `salarioFinal` sumando ao `salarioBase` o importe das horas extra.
  - Método `toString()` que devolva a información do traballador e o salario final.

**3. Subclase: `ConsultorExterno`**

- Atributos adicionais:
  - `horasTraballadas`
  - `salarioFinal`
- Métodos:
  - Constructor que reciba os datos do pai e inicialice `horasTraballadas`, `salarioBase` e `salarioFinal` a 0.
  - Métodos *getter* e *setter* para `horasTraballadas`.
  - Método `calcularSalarioFinal(double prezoHora)` que actualice `salarioFinal` como produto de `horasTraballadas` polo prezo da hora. O `salarioBase` destes traballadores sempre é cero.
  - Método `toString()` que devolva a información do traballador e o salario final.


**4. Programa principal**

- Crea un `ArrayList` de `Asalariados` e outro de  `ConsultoresExternos`.
- Engade manualmente dous ou tres empregados a cada lista.
- Modifica as listas asignando tamén manualmente as horas extra (asalariados) e as horas traballadas (consultores).
- Fixa o prezo da hora extra en 20 euros e o da hora de consultor en 100 euros. Calcula o salario final de cada traballador.
- Crea un novo `ArrayList` de `Traballador` e engade todos os traballadores dos dous `ArrayList` anteriores.
- Calcula o total que gastará a empresa en salarios.

## Exercicio 2: R.C. Celta de Vigo

Crea unha aplicación en Java que modele os socios do RC Celta de Vigo empregando herdanza. Segue as seguintes indicacións:

### Clase `Celtista`

#### Atributos:
- `numeroSocio`
- `dataIngreso`
- `nome`
- `dataNacemento`
- Atributo estático para almacenar o último número de socio asignado.
- Atributo constante e estático para almacenar o prezo do carné celtista nesa tempada.

#### Métodos:
- Construtor para inicializar todos os atributos menos o número de socio, que se inicializa automaticamente e a data de ingreso, que se inicializa co día de hoxe.
- *Getters* para os atributos que o precisen.
- Método `equals(Object o)` que devolve `true` se dous celtistas teñen o mesmo número de socio.
- Método `toString()` que devolve a información do celtista.
- Método `calcularAntigüidade()` do celtista como un obxecto `Period` desde a data actual. Este método non pode ser sobreescrito nas subclases.
- Métido `calcularIdade()` que devolve un enteiro co número de anos que ten o celtista. Este método non pode ser sobreescrito nas subclases.
- Método `calcularPrezoAnual()` que devolve o que ten que pagar o celtista, que se corresponde do almacenado na constante estática.
  
### Clase `Abono`

#### Atributos:
- `tipoAbono` ("Adulto", "Maiores65", "Sub30", "Sub25", "Sub15", "Infantil")
- `grada` ("Tribuna alta", "Tribuna baixa", "Río alto", "Río baixo", "Marcador alto", "Marcador Baixo")
- `prezoAbono` (prezo do abono segundo o tipo)
- HashMap de HashMaps estático que asocia o tipo de abono co prezo correspondente. A clave do primeiro HashMap é a grada e a do segundo HashMap é o tipo de abono. O valor do segundo HashMap é o prezo do abono.

Podes inicializalo con estes datos de exemplo, incluíndo este código tras a declaración dos atributos:
```java
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
```

### Métodos:
- Construtor que inicializa todos os atributos menos o prezo do abono, que se inicializa automaticamente segundo o tipo de abono e a grada. Debes comprobar que tanto o tipo de abono como a grada sexan correctos e, se non o son, lanzar unha excepción `AbonoIncorrectoException` ou `GradaIncorrectaException` que debes crear.
- *Getters* para os atributos que o precisen.
- Método `toString()` que devolve a información do abono.


### Clase `Abonado` (herda de `Celtista`)

#### Atributos:
  - `abono` (abono do abonado)
  - `saldoAcumulado` (saldo acumulado do abonado pola cesión de asentos non utilizados)

#### Métodos:
- Construtor que inicializa todos os atributos (desta clase e da súa clase nai) menos o saldo acumulado, que se inicializa a 0.
- *Getters* para os atributos que o precisen.
- Método `calcularPagamento()`, que sobreescribe ao da clase nai, que devolve o que ten que pagar o abonado segundo o tipo de abono, descontando o saldo acumulado.
- Método `acumularSaldo(double saldo)` que acumula o saldo do abonado. Este método non pode ser sobreescrito nas subclases.
- Método `toString()` que devolve a información do abonado e do seu abono.

### Clase `Miudiño` (herda de `Celtista`)

#### Atributos:
- `adultoAsociado` (adulto asociado ao miudiño, debe ser un abonado)

#### Métodos:
- Construtor que inicializa todos os atributos (desta clase e da súa clase nai). Un Miudiño debe ser menor de 5 anos, se non o é, deberá lanzar unha excepción `IdadeIncorrectaException` que debes crear.
- Método `calcularPagamento()` que devolve sempre 0.

### Clase `Equipo`
#### Atributos:
- `nome`
- `anoFundacion`
- `estadio`
- `aforo`
- ArrayList polimórfico de `Celtista` para almacenar os socios do equipo (sexan do tipo que sexan).
- ArrayList de `Abono` para almacenar os abonos do equipo.

#### Métodos:
- Construtor que recibe o nome, ano de fundación, estadio e aforo. Inicializa os atributos e crea os ArrayList baleiros.
- `engadirAbono(Abono abono)` que engade un abono á lista de abonos.
- `engadirCeltista(Celtista celtista)` que engade un celtista á lista de socios.
- Método `toString()` que devolve a información do equipo e dos seus socios.
- Método `calcularTotalPagos()` que devolve o total que ten que pagar o equipo por todos os seus socios. Para isto, chama ao método `calcularPagamento()` de cada celtista.
