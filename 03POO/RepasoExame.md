# Exercicio 1: Aeroporto

Neste exercicio, se os atributos recibidos non son correctos, non é necesario lanzar unha excepción; podes simplemente imprimir unha mensaxe de erro por consola e non asignar o valor ao atributo correspondente.

## 1. Clase `Tripulante`

### Atributos

* **nome**: Nome do tripulante. Non poderá estar en branco.
* **apelidos**: Apelidos do tripulante. Non poderá estar en branco.
* **nacionalidade**: Nacionalidade do tripulante.
* **cargo**: Cargo do tripulante. Deberemos comprobar que é un dos seguintes: `piloto`, `copiloto` ou `auxiliar`. Debe almacenarse sempre en minúsculas.

### Métodos

* **Construtor**: Recibe todos os atributos e aplica as validacións.
* **Métodos de validación**: Métodos privados para comprobar a validez dos atributos (nome non baleiro, cargo permitido, etc.).
* **Getters e Setters**: Implementa os que sexan necesarios para o funcionamento das outras clases.
* **toString()**: Devolve a representación en formato cadea do tripulante (ex: "Apelidos, Nome - Cargo").



## 2. Clase `Voo`

### Atributos

* **numero**: Número do voo. Debe ter unha lonxitude de 6 caracteres. Se o número non é correcto ao crealo, deberá xerarse automaticamente co método `xerarVoo()`.
* **compañía**: Compañía aérea do voo.
* **orixe**: Cidade de orixe.
* **destino**: Cidade de destino.
* **piloto**: Obxecto da clase `Tripulante`. Deberá comprobarse que o seu cargo sexa exactamente `piloto`.
* **copiloto**: Obxecto da clase `Tripulante`. Deberá comprobarse que o seu cargo sexa exactamente `copiloto`.
* **capacidade**: Capacidade máxima de pasaxeiros. **NUNCA** poderá ser menor que 0.

### Métodos

* **Construtor 1**: Recibe todos os atributos.
* **Construtor 2**: Recibe só a compañía, orixe, destino e capacidade. Neste caso, o número de voo xerarase automaticamente co método `xerarVoo()`.
* **Métodos de validación**: Comprobación de que o piloto e o copiloto teñen o cargo axeitado antes de asignalos.
* **Setters**: Para o `copiloto` e o `piloto`, asegurando que cumpren as restricións de cargo.
* **xerarVoo()**: Método que xera o número do voo collendo as dúas primeiras letras da compañía (en maiúsculas) seguidas de catro cifras aleatorias (ex: `IB1234`).
* **aumentarCapacidade(int incremento)**: Aumenta a capacidade do avión en función do parámetro recibido.
* **reducirCapacidade(int decremento)**: Diminúe a capacidade do avión, sen permitir que o resultado sexa menor que 0.
* **toString()**: Devolve a representación en cadea do voo, incluíndo os datos básicos e os nomes do piloto e copiloto.



## 3. Programa Principal (`Main`)

Crea unha clase co método `main` que sirva para testear o sistema:

1. **Proba de Tripulantes**: Crea obxectos con cargos correctos e incorrectos.
2. **Proba de Voos**:
* Instancia un voo usando o primeiro construtor con datos válidos.
* Instancia outro voo usando o segundo construtor para probar a xeración aleatoria de código.


3. **Proba de Restricións**: Tenta asignar un `auxiliar` como `piloto` dun voo e verifica que o sistema mostra o erro correspondente.
4. **Proba de Capacidade**: Aumenta e reduce a capacidade, comprobando que non se acepten valores negativos finais.
5. **Saída de datos**: Mostra por pantalla a información final dos voos creados usando `toString()`.


# Exercicio 2: Xestión de Concertos de Rock

Neste exercicio, se os atributos non son correctos, non é necesario lanzar unha excepción; podes simplemente imprimir un erro por consola e non asignar o valor (ou deixar o valor por defecto).

## Clase `Musico`

**Atributos**

* **nome**: Nome do artista. Non pode estar en branco.
* **instrumento**: Debe ser un dos seguintes: `guitarra`, `baixo`, `batería` ou `voz`. Debe almacenarse en minúsculas.
* **experiencia**: Anos de experiencia. Non pode ser menor que 0.

**Métodos**

* **Construtor**: Recibe todos os atributos e valídaos.
* **Getters e Setters**: Implementa os necesarios. O setter de `instrumento` debe validar a lista permitida.
* **toString()**: Devolve a representación do músico: `Nome (Instrumento) - Exp: X anos`.



## Clase `Concerto`

**Atributos**

* **idConcerto**: Identificador único. Se non se asigna un válido (máis de 3 caracteres), usarase `xerarID()`.
* **nomeEvento**: Nome da xira ou festival.
* **recinto**: Localización do concerto.
* **estrela**: Obxecto da clase `Musico`. **Condición**: Para ser estrela, o músico debe ter o instrumento `voz`.
* **telonero**: Obxecto da clase `Musico` que abre o concerto.
* **entradasVendidas**: Cantidade de tickets vendidos. Nunca menor que 0.
* **prezoEntrada**: Prezo por entrada.

**Métodos**

* **Construtor 1**: Recibe todos os atributos.
* **Construtor 2**: Recibe o nome do evento, o recinto e o prezo. O `idConcerto` xerarase co método `xerarID()` e as entradas vendidas serán 0.
* **xerarID()**: Método que devolve unha cadea combinando a primeira letra do evento e un número aleatorio entre 1 e 1000.
* **venderEntradas(int cantidade)**: Suma a cantidade ás entradas vendidas só se a cantidade é positiva.
* **cambiarEstrela(Musico novoMusico)**: Método que cambia a estrela do concerto, pero só se o novo músico ten como instrumento `voz`. Se non, imprime "Erro: A estrela debe ser cantante".
* **toString()**: Devolve a información do concerto, incluíndo os nomes da estrela e do telonero.



## Programa Principal (`Main`)

Crea unha clase para probar a lóxica:

1. **Instancia Músicos**: Crea un cantante e un batería.
2. **Instancia Concertos**:
* Crea un concerto co primeiro construtor.
* Crea outro concerto co segundo construtor (ID aleatorio).


3. **Proba a lóxica de negocio**:
* Tenta asignar o batería como `estrela` usando `cambiarEstrela` e comproba que sae o erro.
* Asigna o cantante como `estrela`.
* Vende 50 entradas e logo tenta vender -10 (debería dar erro).


4. **Resumo**: Imprime o `toString()` de cada concerto para ver os resultados finais.

Aquí tes un novo exercicio cunha temática ambiental centrada na **chuvia e a meteoroloxía**. Neste caso, as clases relaciónanse porque unha estación meteorolóxica "rexistra" e analiza un fenómeno de chuvia específico.

# Exercicio 3: Monitorización de Precipitacións

Neste exercicio, simularás o funcionamento dunha rede de sensores meteorolóxicos. Se os datos introducidos non son válidos, mostra un erro por consola e mantén o valor previo ou un valor por defecto.

## 1. Clase `RexistroChuvia`

Esta clase representa un evento de chuvia medido nun momento concreto.

### Atributos

* **tipo**: Tipo de precipitación. Debe ser un dos seguintes: `orballo`,  `treboada` ou `neve`. Debe gardarse sempre en minúsculas.
* **intensidade**: Valor decimal que representa os litros por metro cadrado (). Non pode ser inferior a 0.
* **duracionMinutos**: Tempo que durou o evento en minutos. Debe ser maior que 0.

### Métodos

* **Construtor**: Recibe os tres atributos e aplica as validacións.
* **ePerigosa()**: Método que devolve un booleano (`true`/`false`). A chuvia considérase perigosa se o tipo é `treboada` ou se a intensidade supera os **50.0** .
* **getLitrosTotais()**: Devolve o total de litros caídos (intensidade multiplicada pola duración expresada en horas).
* **toString()**: Devolve unha cadea co formato: `[Tipo] - Intensidade: X l/m2 (Duranción: Y min)`.



## 2. Clase `EstacionMeteoroloxica`

Representa o dispositivo que xestiona e analiza as medicións.

### Atributos

* **nomeEstacion**: Nome da estación (ex: "Serra do Xistral"). Non pode estar baleiro.
* **codigoIdentificador**: Recibe un código entre 0 e 10000, se non é correcto xerarase un con `autoxerarCodigo()`.
* **ultimaMedicion**: Obxecto da clase `RexistroChuvia`. Representa a última chuvia detectada.
* **totalAcumulado**: Suma total de litros acumulados en todas as medicións feitas por esta estación.

### Métodos

* **Construtor 1**: Recibe o nome e o código.
* **Construtor 2**: Recibe só o nome. O código xerarase con `autoxerarCodigo()`.
* **autoxerarCodigo()**: Método privado que xera un código aleatorio entre 0 e 10000.
* **actualizarMedicion(RexistroChuvia nova)**: Recibe un novo obxecto chuvia. Se non é nulo, actualiza o atributo `ultimaMedicion` e suma os seus litros totais ao `totalAcumulado`.
* **emitirAlerta()**: Se a `ultimaMedicion` é perigosa (usando o método da outra clase), imprime un aviso urxente en maiúsculas. Se non, imprime "Condicións normais".
* **toString()**: Devolve un resumo co nome da estación, o seu código e os datos da última medición realizada (no formato do seu método `toString()`). 



## 3. Programa Principal (`Main`)

Debes crear unha clase para comprobar o sistema:

1. **Crear medicións**: Crea unha "treboada" moi intensa e un "orballo" lixeiro.
2. **Crear estacións**: Instancia unha estación co primeiro construtor e outra co segundo.
3. **Simular actividade**:
* Asigna o "orballo" á primeira estación e mostra o total acumulado.
* Asigna a "treboada" á mesma estación.
* Chama ao método `emitirAlerta()` para ver se detecta o perigo.


4. **Validación**: Tenta crear un rexistro con intensidade negativa e comproba que o programa o xestiona correctamente (imprimindo erro).
