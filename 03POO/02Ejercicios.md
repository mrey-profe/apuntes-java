# UD03 - A02 Clases e Obxectos

## Exercicio 1: Conta Bancaria

Crea unha clase en Java para unha Conta Bancaria que cumpra os seguintes requisitos:

**Atributos**

- identificador da conta
- titular 
- saldo
- concepto do último movemento

**Construtor**

- Debe recibir como parámetros os valores dos atributos do obxecto (identificador, titular e saldo)

**Métodos**

- Getters e setters para todos os atributos
- `movemento()`: recibirá tres parámetros:
  - tipo de movemento (ingreso ou retirada)
  - valor do movemento
  - concepto
  Debe actualizar o saldo da conta con este movemento e almacenar o concepto do último movemento. Devolverá true se o saldo é positivo e false se a conta quedou en números vermellos.
- `toString()`: devolverá unha cadea coa información da conta no formato:
  ```
  Conta Bancaria
  ---------------
  Identificador: 123456
  Titular: María Pérez
  Saldo: 1000.0 €
  Último movemento: Ingreso de 100.0 €
  ```

Proba o seu funcionamento desde a clase principal.

## Exercicio 2

Implementa unha clase chamada **Persoa** coas seguintes condicións:

- Os seus atributos son: nome, idade, dni, situacionActual ('E' estuda, 'T' traballa ou 'D' en situación de desemprego), peso (en kg) e altura (en cm). Non queremos que se acceda directamente a eles.
- Terá un construtor que recibirá todos os valores dos atributos nos parámetros e os incorporará aos mesmos. Comprobará que a idade teña un valor entre 0 e 150 e que a situacionActual sexa 'E', 'T' ou 'D'. De non ser así, non lle asignará valor e imprimirá unha mensaxe por pantalla.

Os seus métodos son:

- `calcularIMC()`: Devolverá o Índice de Masa Corporal (IMC), que se calcula como:
$$ IMC=\frac{peso(kg)}{altura(m)^2} $$
- `eMaiorDeIdade()`: indica se a persoa é maior de idade, devolve un valor booleano.
- `eCorrectaSituacion(char situacionActual)`: comproba que a situación actual introducida é correcta. Devolve un valor booleano. Non será visible ao exterior.
- `eCorrectaIdade(int idade)`: comproba que a idade introducida atópase entre 0 e 150. Devolve un valor booleano. Non será visible ao exterior.
- `toString()`: devolve unha cadea coa información da persoa no formato:

  ```text
  Persoa
  ------
  Nome: María Pérez
  Idade: 25 anos
  DNI: 12345678A
  Situación: Traballa
  Peso: 60.0 kg
  Altura: 170.0 cm
  ```

- Getters e setters de todos os atributos, coas comprobacións pertinentes.

## Exercicio 3: Semáforo

Implementa unha clase chamada **Luz** que simule o funcionamento dun semáforo coas seguintes características:

**Atributos**

- cor: só pode ter tres valores posibles ("verde", "amarela", "vermella")

**Construtor**

- Por defecto: inicializará a cor a "vermella"

**Métodos**

- `getCor()`: devolve o valor actual da cor do semáforo
- `cambio()`: modifica a cor do semáforo seguindo esta secuencia:
  - verde → amarela
  - amarela → vermella 
  - vermella → verde

**Restricións**

- O atributo cor debe ser privado
- Non se permitirá modificar a cor directamente (sen setter)
- Os cambios de cor só poderán realizarse a través do método `cambio()`

Crea unha clase principal que probe o funcionamento do semáforo realizando varios cambios de cor e amosando o estado do semáforo tras cada cambio.

## Exercicio 4

Implementa unha clase chamada Circulo que teña os seguintes atributos e métodos:

- Atributos: radio (tipo double) e cor (tipo String)
- Construtor ao que se lle pase o radio e a cor
- Métodos:
  - getters e setters
  - `calcularArea()`: devolve a área do círculo
  - `calcularPerimetro()`: devolve o perímetro (lonxitude da circunferencia)
  - `toString()`: devolve unha cadea coa información do círculo no formato:
    ```text
    Círculo
    -------
    Radio: 5.0
    Cor: Azul
    Área: 78.54
    Perímetro: 31.42
    ```

## Exercicio 5

Implementa unha clase chamada Rectangulo que teña os seguintes atributos e métodos:

- Atributos: base e altura (tipo double)
- Construtor ao que se lle pasen a base e a altura
- Métodos:
  - getters e setters
  - `calcularArea()`: devolve a área do rectángulo
  - `calcularPerimetro(`): devolve o perímetro do rectángulo
  - `toString()`: devolve unha cadea coa información do rectángulo no formato:
    ```text
    Rectángulo
    ----------
    Base: 5.0
    Altura: 3.0
    Área: 15.0
    Perímetro: 16.0
    ```

## Exercicio 6: Xestión de Libros

Implementa unha clase chamada **Libro** que permita xestionar a información básica dun libro cunhas características específicas:

**Atributos**

- ISBN: código identificador único do libro
- Título: nome completo do libro
- Autor: nome do autor do libro
- Número de páxinas: cantidade total de páxinas do libro

**Construtores**

- Un construtor por defecto
- Un construtor parametrizado que reciba todos os atributos

**Métodos**

- Getters e setters para todos os atributos
- `toString()`: devolverá unha cadea coa información do libro no formato:
  ```
  Libro
  -----
  ISBN: 1234567890
  Título: "El Quijote"
  Autor: Miguel de Cervantes
  Número de páxinas: 200
  ```

Crea unha clase principal que probe todas as funcionalidades implementadas na clase Libro, creando varios libros con diferentes datos e amosando a súa información.

## Exercicio 7: Xestión do Tempo

Implementa unha clase chamada **Hora** que permita representar e manipular instantes de tempo dixital coas seguintes características:

**Atributos**

- horas: valor enteiro entre 0 e 23
- minutos: valor enteiro entre 0 e 59

**Construtor**

- Parametrizado: recibirá as horas e os minutos, validando que estean dentro dos rangos permitidos

**Métodos**

- Getters e setters para ambos atributos que inclúan:
  - Validación do rango das horas (0-23)
  - Validación do rango dos minutos (0-59)
- `incrementarMinuto()`: aumenta o tempo en 1 minuto, xestionando o cambio de hora cando os minutos superen 59
- `amosarHora()`: presenta a hora en formato dixital (HH:MM) con dous díxitos para horas e minutos

**Restricións**

- Os atributos deben ser privados
- Todos os métodos deben incluír as validacións necesarias
- O formato de saída debe incluír ceros á esquerda cando sexa necesario

Crea unha clase principal que probe todas as funcionalidades implementadas, realizando cambios de hora e amosando os resultados.

## Exercicio 8: Punto e liña

Implementa unha clase chamada **Punto** que permita representar un punto no plano cartesiano coas seguintes características:

**Atributos**
  - x: coordenada horizontal do punto
  - y: coordenada vertical do punto

**Construtores**
  - Por defecto: inicializará o punto na orixe (0,0)
  - Parametrizado: recibirá as coordenadas do punto

**Métodos**
  - Getters e setters para ambos atributos
  - `toString()`: devolverá unha cadea coas coordenadas do punto no formato (x,y)
  - `moverPunto(int dx, int dy)`: desprazará o punto unha cantidade dx en horizontal e dy en vertical

Implementa unha clase chamada **Liña** que permita representar unha liña no plano cartesiano coas seguintes características:

**Atributos**
  - punto1: punto de inicio da liña
  - punto2: punto de fin da liña

**Construtores**
  - Parametrizado: recibirá dous obxectos de tipo Punto. Debe comprobar que os puntos non sexan iguais

**Métodos**
  - Getters e setters para ambos atributos
  - `calcularLonxitude()`: devolverá a lonxitude da liña
  - `toString()`: devolverá unha cadea coas coordenadas dos puntos de inicio e fin da liña
  - `moverLinha(int dx, int dy)`: desprazará a liña unha cantidade dx en horizontal e dy en vertical