
# Interfaces e Clases Abstractas

## Clases Abstractas

### Exercicio 1: Sistema de Lexisladores

Declara unha clase abstracta `Lexislador` que herde da clase `Persoa`, cun atributo `provinciaQueRepresenta` (tipo `String`), `partidoPolitico` (tipo `String`) e `numeroDespacho` (tipo `int`). Declara un método abstracto `getCamaraEnQueTraballa()`.

Crea dúas clases concretas que herden de `Lexislador`:
- A clase `Deputado`, que ten o número de asento de cámara baixa que ocupa.
- A clase `Senador`, que ten o número de asento de cámara alta que ocupa.

Ambas clases deben sobrescribir os métodos abstractos necesarios.

Crea unha lista de lexisladores e, facendo uso do polimorfismo, mostra por pantalla os seus datos e en que cámara traballan. 

Todas as clases deben implementar o método `toString()`.

### Exercicio 2: Sistema de combate Pokémon

Crea un sistema de combate Pokémon usando clases abstractas e herdanza seguindo estes requisitos:

#### Clase abstracta `Pokemon`

**Atributos:**
- `puntosVida` (tipo `int`).
- `ataqueBase` (tipo `int`).
- `tipoElemento` (tipo `String`, ex: `"lume"`, `"auga"`).

**Métodos:**
- `void atacar(Pokemon obxectivo)`. Será implementado nas subclases.
- `void recibirDano(int cantidade)`: Reduce `puntosVida` na cantidade que se indique. As subclases poderán modificar este comportamento pero este será o comportamento por defecto.
- `boolean estaVivo()`: Devolve `true` se `puntosVida` é maior que 0.
- `String toString()`: Devolve unha cadea de texto co nome do Pokémon, `puntosVida`, `ataqueBase` e `tipoElemento`.

#### Subclases

Implementa dúas subclases con comportamentos específicos:

- **`Charmander`:**
    - `tipoElemento = "lume"`.
    - `atacar()`: Inflixe `ataqueBase + 15` se o obxectivo é de tipo `"planta"`. En calquera outro caso, inflixe `ataqueBase`.

- **`Squirtle`:**
    - `tipoElemento = "auga"`.
    - `atacar()`: Inflixe `ataqueBase + 10` se o obxectivo é de tipo `"lume"`. En calquera outro caso, inflixe `ataqueBase`.
    - `recibirDano(int cantidade)`: Se o atacante é de tipo `"lume"`, reduce `puntosVida` en `cantidade / 2`. En calquera outro caso, utiliza o método da clase nai.

#### Programa principal

- **Polimorfismo:** 
    - Crea unha lista de Pokémon (con instancias de `Charmander` e `Squirtle`) e amosa os datos de cada un usando o método `toString()` despois de que ataquen e reciban dano.

## Interfaces

### Exercicio 1

Desenvolve unha interface chamada `Ciclista` cun método chamado `percorrer()` ao que se lle pasa un número de kilómetros e unha cadea co tipo de terreo, e devolve os segundos que tarda en percorrelo.

Desenvolve unha interface chamada `Nadador` cun método chamado `nadar()` ao que se lle pasan metros e devolve os segundos en percorrelo.

Desenvolve unha interface chamada `Saltador` cun método chamado `saltarAltura()` que non recibe parámetros e devolve os centímetros saltados.

- Desenvolve unha clase `Delfin` que implemente a interface `Nadador`. O tempo en percorrer unha distancia é aleatorio entre 40 km/h e 70 km/h.
- Desenvolve unha clase `BaleaAzul` que implemente a interface `Nadador`. O tempo en percorrer unha distancia é de 10 km/h para baleas de 5 ou máis anos e 13 km/h para as menores.
- Desenvolve unha clase `Triatleta` que implemente as tres interfaces, cos criterios que ti consideres (poden devolver valores aleatorios entre uns mínimos e máximos que ti decidas ou ter en conta outros parámetros como idade, peso, etc.).
- Realiza un programa sinxelo que cree instancias de delfíns, baleas azuis e triatletas, e use os métodos desenvolvidos.

### Exercicio 2

Empregando as tres clases definidas no exercicio anterior (`Delfin`, `BaleaAzul` e `Triatleta`) e a interface `Nadador`, realiza un programa que conteña un `ArrayList` de nadadores (polimorfismo de interfaces) con tres elementos: un de cada tipo, isto é, un `Delfin`, unha `BaleaAzul` e un `Triatleta`.

A continuación, percorre o `ArrayList` cun bucle `for...each`, amosando canto tarda cada un deles en percorrer un kilómetro. No caso de que o obxecto implemente a interface `Ciclista`, debe amosar tamén canto tarda en percorrer 10 km, e se implementa a interface `Saltador`, debe indicar canto saltou.
