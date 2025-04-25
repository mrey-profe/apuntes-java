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
- Atributo estático para almacenar os número de socios asignados.
- Atributo constante e estático para almacenar o prezo do carné celtista nesa tempada.

#### Métodos:
- Construtor para inicializar todos os atributos menos o número de socio, que se inicializa automaticamente e a data de ingreso, que se inicializa co día de hoxe.
- *Getters* para os atributos que o precisen.
- Método `equals(Object o)` que devolve `true` se dous celtistas teñen o mesmo número de socio.
- Método `toString()` que devolve a información do celtista.
- Método `calcularAntigüidade()` do celtista como un obxecto `Period` desde a data actual. Este método non pode ser sobreescrito nas subclases.
- Método `calcularPagamento()` que devolve o que ten que pagar o celtista, que se corresponde do almacenado na constante estática.
  
### Clase `Abono`

#### Atributos:
- `tipoAbono` ("Adulto", "Maiores65", "Sub30", "Sub25", "Sub15", "Infantil")
- `grada` ("Tribuna alta", "Tribuna baixa", "Río alto", "Río baixo", "Marcador alto", "Grada de animación")
- `prezoAbono` (prezo do abono segundo o tipo)
- HashMap de HashMaps estático que asocia o tipo de abono co prezo correspondente. A clave do primeiro HashMap é a grada e a do segundo HashMap é o tipo de abono. O valor do segundo HashMap é o prezo do abono.

### Métodos:
- Construtor que inicializa todos os atributos menos o prezo do abono, que se inicializa automaticamente segundo o tipo de abono e a grada.
- *Getters* para os atributos que o precisen.
- Método `calcularPagamento()`, que sobreescribe ao da clase nai, que devolve o que ten que pagar o abonado segundo o tipo de abono, descontando o saldo acumulado.
- Método `toString()` que devolve a información do abono.


### Clase `Abonado` (herda de `Celtista`)

#### Atributos:
  - `abono` (abono do abonado)
  - `saldoAcumulado` (saldo acumulado do abonado pola cesión de asentos non utilizados)

#### Métodos:
- Construtor que inicializa todos os atributos (desta clase e da súa clase nai) menos o saldo acumulado, que se inicializa a 0.
- *Getters* para os atributos que o precisen.
- Método `toString()` que devolve a información do abonado e do seu abono.

### Clase `Miudiño` (herda de `Celtista`)

#### Atributos:
- `adultoAsociado` (adulto asociado ao miudiño, debe ser un abonado)

#### Métodos:
- Construtor que inicializa todos os atributos (desta clase e da súa clase nai).
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
