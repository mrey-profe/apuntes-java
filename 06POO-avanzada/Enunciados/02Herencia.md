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

1. Clase base: Socio

Atributos privados:

id (entero)

nome (String)

dataNacemento (String ou LocalDate)

Métodos:

Constructor para inicializar todos os atributos.

Métodos getter e setter.

Método toString() para amosar a información do socio.