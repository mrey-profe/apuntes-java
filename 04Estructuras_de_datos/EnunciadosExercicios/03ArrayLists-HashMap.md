# ArrayLists

## Exercicio 1

Crea un programa que lea por teclado notas de alumnado mentres o usuario non indique que quere parar.

O programa debe almacenar as notas nun **ArrayList** e, ao final, mostrar a media das notas.

Podes pedir unha nota e, a continuación, preguntar se quere continuar ou non.

## Exercicio 2

### Clase *Persoa*

Crea unha clase *Persoa* que teña os seguintes atributos:
- Nome
- Apelidos
- Teléfono

### Clase *Flor*

Crea unha clase *Flor* que teña os seguintes atributos:
- Nome
- Cor
- Prezo
- Array coas cores posibles das flores, que será común a todas as flores.

Crea un construtor que inicialice todos os atributos e un método que mostre a información da flor.

Comproba que o prezo non sexa negativo e que a cor estea dentro das cores posibles. Se non é así, lanza unha excepción.

### Clase *Ramo*

Crea unha clase *Ramo* que teña os seguintes atributos:
- ArrayList de flores
- Persoa que o encargou

#### Métodos

- Construtor que inicialice todos os atributos e un método que mostre a información do ramo.
- Método que engada unha flor ao ramo.
- Método que elimine flores do ramo. Pásaselle o tipo de flor, a súa cor e o número delas que se queren eliminar.
- Método que calcule o prezo total do ramo.
- Método que mostre a información de todo o ramo: que flores ten, cantas de cada unha, o prezo total e a persoa que o comprou.

### Programa principal

Crea un programa que cree un ArrayList de ramos (ao teu gusto) e percorra este para mostralos por pantalla.

## Exercicio 3

Crea un programa que permita xestionar unha lista de viaxes organizadas e os viaxeiros inscritos. O programa debe incluír as seguintes funcionalidades:

- Engadir unha viaxe organizada (destino, prezo, cantidade de días).
- Rexistrar un viaxeiro (nome, idade) e asocialo a unha viaxe organizada.
- Mostrar todos os destinos turísticos dispoñibles.
- Listar os viaxeiros rexistrados para cada viaxe.
- Eliminar unha viaxe (e os seus viaxeiros asociados).
- Buscar destinos por país.

Pensa en que clases e atributos son necesarios para implementar o programa. Utiliza **ArrayList** para almacenar as viaxes e os viaxeiros. Implementa métodos para realizar as operacións solicitadas.

# HashMap

## Exercicio 4

Modifica o exercicio 2 (Flores e Ramos) para que o ArrayList de flores na clase Ramo sexa un **HashMap**, onde a clave sexa a flor e o valor sexa a cantidade de flores dese tipo no ramo. Implementa os métodos necesarios para engadir, eliminar e mostrar as flores no ramo utilizando o **HashMap**.

## Exercicio 5

Crea un programa que permita xestionar os integrantes dun instituto. Teremos as seguintes clases:
- **Alumnx**: nome, apelidos, data de nacemento (investiga como manexar datas en Java).
- **Profesor**: nome, especialidade.
- **Asignatura**: nome, horas semanais.
- **Curso**: Nivel, letra, lista de alumnxs e **HashMap** que asocie Asignatura con Profesor.
- **Instituto**: nome, dirección, **HashMap** que asocie cursos (obxecto da clase **Curso**) con titores (obxecto da clase **Profesor**).
