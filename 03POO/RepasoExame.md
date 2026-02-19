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

Aquí tes dous novos exercicios de Programación Orientada a Obxectos seguindo exactamente as túas restricións (sen arrays, sen coleccións, sen conceptos avanzados e sen lanzar excepcións). Escollín temáticas actuais que adoitan conectar moi ben co alumnado de 20 anos: **os eSports (videoxogos competitivos)** e as **plataformas de Streaming (Twitch/YouTube)**.

Como intelixencia artificial, encántame axudar a deseñar material educativo que faga a programación máis accesible e entretida. Aquí os tes:


# Exercicio 4: Partidas Competitivas de eSports

Neste exercicio, simularemos o sistema de emparellamento (matchmaking) dun videoxogo competitivo. Lembra: se os datos non son válidos, mostra un erro por consola e non actualices o atributo.

## 1. Clase `Xogador`

### Atributos

* **nickname**: Nome de usuario do xogador no xogo. Non pode estar en branco.
* **rango**: Nivel de habilidade do xogador. Debe ser un dos seguintes: `bronce`, `prata`, `ouro` ou `diamante`. Debe almacenarse en minúsculas.
* **puntosClasificatoria**: Puntos acumulados no xogo. Nunca poden ser menores que 0.

### Métodos

* **Construtor**: Recibe os tres atributos e aplica as validacións correspondentes.
* **Métodos de validación**: Métodos privados para comprobar que o nickname non está baleiro, que o rango é válido e que os puntos non son negativos.
* **Getters e Setters**: Os necesarios. Ao facer o setter de `rango`, asegúrate de validar de novo.
* **toString()**: Devolve a representación do xogador: `[Nickname] - Rango: [Rango] (Puntos: X)`.

## 2. Clase `Partida`

### Atributos

* **idPartida**: Código identificador. Debe ter exactamente 5 caracteres. Se non os ten ao instanciar, xerarase con `xerarID()`.
* **servidor**: Rexión do servidor (ex: "Europa", "Norteamérica").
* **xogadorLocal**: Obxecto da clase `Xogador`.
* **xogadorRival**: Obxecto da clase `Xogador`.
* **espectadores**: Número de persoas vendo a partida en directo. Non pode ser menor que 0.

### Métodos

* **Construtor 1**: Recibe todos os atributos e aplícaas validacións necesarias.
* **Construtor 2**: Recibe só o `servidor`, o `xogadorLocal` e o `xogadorRival`. O `idPartida` xérase automaticamente, e os espectadores comezan en 0.
* **xerarID()**: Xera un identificador aleatorio formado pola palabra "MATCH" seguida dun número entre 1 e 999 (ex: `MATCH42`).
* **podeXogar()**: Devolve un booleano (`true`/`false`). Para que a partida sexa xusta, devolverá `true` só se ambos xogadores teñen **exactamente o mesmo rango**. Se non, devolverá `false`.
* **engadirEspectadores(int cantidade)**: Suma a cantidade aos espectadores actuais, sempre que a cantidade sexa positiva. Se é negativa, mostra un erro.
* **toString()**: Devolve os datos da partida no formato: `Partida [ID] (Servidor) - [Nickname Local] vs [Nickname Rival] | Vendo: X persoas`.

## 3. Programa Principal (`Main`)

1. **Crear Xogadores**: Instancia tres xogadores (dous con rango `ouro` e un con rango `bronce`).
2. **Crear Partidas**:
* Crea unha partida co primeiro construtor poñendo aos dous xogadores `ouro` a competir.
* Crea unha segunda partida co segundo construtor poñendo a competir a un xogador `ouro` contra o de `bronce`.


3. **Probar a lóxica**:
* Chama ao método `podeXogar()` en ambas partidas. A primeira debería ser válida e a segunda non (imprime o resultado por consola).
* Tenta cambiarlle o rango a un xogador a "madeira" (debería dar erro de validación).


4. **Espectadores**: Engade 150 espectadores á primeira partida e logo tenta sumar -20.
5. **Resumo**: Mostra o `toString()` de ambas partidas.


# Exercicio 5: Plataforma de Streaming

Neste sistema xestionaremos as colaboracións en directo entre creadores de contido.

## 1. Clase `Creador`

### Atributos

* **alias**: Nome artístico do streamer. Non pode estar baleiro.
* **plataforma**: Lugar onde fai directo. Só pode ser: `twitch`, `youtube` ou `tiktok`. Gárdase en minúsculas.
* **seguidores**: Cantidade de seguidores totais. Non pode ser inferior a 0.

### Métodos

* **Construtor**: Recibe os tres atributos validándoos primeiro.
* **Getters e Setters**: Para os atributos que consideres necesarios, respectando as validacións.
* **toString()**: Devolve a info do creador: `[Alias] (@[Plataforma]) - [Seguidores] subs`.

## 2. Clase `Directo`

### Atributos

* **titulo**: O título do stream. Non pode estar baleiro.
* **streamerPrincipal**: Obxecto da clase `Creador`. É o dono da canle.
* **convidado**: Obxecto da clase `Creador`. É outro streamer que entra a colaborar (pode ser `null` ao principio).
* **espectadoresActuais**: Xente vendo o stream agora mesmo (>= 0).
* **duracionMinutos**: O tempo que leva en directo. Comeza sempre en 0 e non pode ser negativo.

### Métodos

* **Construtor 1**: Recibe o `titulo`, o `streamerPrincipal` e o `convidado` e os `espectadoresActuais`. A duración iníciase a 0.
* **Construtor 2**: Recibe só o `titulo` e o `streamerPrincipal`. O convidado será nulo por defecto e os espectadores e duración serán 0.
* **invitarCreador(Creador novoConvidado)**: Asigna un novo convidado ao directo, pero **só se** o novo convidado transmite na **mesma plataforma** que o `streamerPrincipal`. Se son de plataformas distintas, o método imprime: "Erro: Non hai crossplay entre plataformas" e non asigna o convidado.
* **facerRaid(int novosEspectadores)**: Suma os espectadores recibidos á cantidade actual, pero só se o número é positivo.
* **avanzarTempo(int minutos)**: Suma a cantidade recibida (se é maior que 0) á `duracionMinutos`.
* **toString()**: Mostra o estado do stream. Se ten convidado: `EN DIRECTO: [Titulo] | [Alias Principal] ft. [Alias Convidado] | [X] viewers`. Se non ten convidado, non debe mostrar a parte do "ft. [Alias Convidado]".

## 3. Programa Principal (`Main`)

1. **Crear Creadores**: Crea tres streamers (dous en `twitch` e un en `youtube`).
2. **Crear Directos**:
* Crea un directo só co creador principal (usando o construtor 2) cun streamer de `twitch`.
* Crea outro directo co construtor 1, intentando meter de entrada a un streamer de `twitch` con un de `youtube` (se implementaches ben as validacións, podes controlalo ou ben probalo usando o método de invitar despois).


3. **Probar colaboracións**:
* No primeiro directo, usa `invitarCreador()` para meter ao streamer de `youtube`. Debe dar erro de plataforma.
* No mesmo directo, invita ao outro streamer de `twitch`. Agora debería funcionar.


4. **Interacción**: Fai unha raid de 500 espectadores e avanza o tempo 120 minutos.
5. **Resumo**: Mostra por consola a información final dos directos usando `toString()`.


Aquí tes unha proposta cun enfoque totalmente diferente. Esquezámonos dos identificadores (nin manuais nin autoxerados), das listaxes encubertas e dos sistemas de xestión tradicionais.

Neste exercicio imos centrarnos na **mutación de estado e na interacción directa entre obxectos**. A temática é un **videoxogo de duelos máxicos (RPG)**. A graza aquí está en como un obxecto altera os valores doutro obxecto ao interactuar con el.

# Exercicio 6: Combate de Maxia

Neste exercicio simularemos o combate entre dúas personaxes. Se un dato non é válido ou unha acción non se pode facer (por exemplo, atacar sen enerxía), **non se lanza ningunha excepción**; simplemente imprímese unha mensaxe de erro por consola e a acción cancélase ou o atributo non se modifica.

## 1. Clase `Feitizo`

Esta clase representa a habilidade máxica que un personaxe pode utilizar. Non ten identificadores, só estatísticas de combate.

### Atributos

* **nome**: O nome do ataque (ex: "Bóla de Fogo"). Non pode estar en branco.
* **elemento**: O tipo de maxia. Debe ser obrigatoriamente un destes tres: `lume`, `xeo` ou `raio`. Debe gardarse en minúsculas.
* **custoMana**: Custo de enerxía para lanzalo. Debe ser maior que 0.
* **danoBase**: Cantidade de puntos de vida que restará ao rival. Debe ser maior que 0.

### Métodos

* **Construtor**: Recibe os catro atributos e aplica as validacións.
* **Getters e Setters**: Só os estritamente necesarios. Lembra validar o elemento se fas un setter para el.
* **toString()**: Devolve o resumo do feitizo. Exemplo: `Bóla de Fogo (lume) -> Dano: 25 | Custo PM: 10`.

## 2. Clase `Mago`

Esta clase representa o personaxe.

### Atributos

* **nome**: Nome do mago. Non pode estar en branco.
* **vida**: Puntos de vida (PV). O máximo sempre é **100** e o mínimo é **0**.
* **mana**: Puntos de maxia (PM) para lanzar feitizos. O máximo sempre é **50** e o mínimo é **0**.
* **feitizoEquipado**: Un obxecto da clase `Feitizo`. Pode ser nulo se o mago aínda non ten un.

### Métodos

* **Construtor**: Recibe o `nome`, a `vida`, o `mana` e o `feitizoEquipado`. Asegúrate de que a vida e o maná non superen os seus máximos nin baixen de 0 ao crealo.
* **estaVivo()**: Método que devolve `true` se a vida do mago é maior que 0, ou `false` se chegou a 0.
* **recibirDano(int dano)**: Resta o dano recibido á vida actual. Se a vida baixa de 0, débese quedar exactamente en 0 e imprimir por pantalla: *"O mago [nome] caeu derrotado!"*.
* **meditar()**: Recupera **15 puntos de maná**. Débese comprobar que o maná resultante non supere nunca o límite máximo de 50. Imprime un aviso de que o mago meditou.
* **atacar(Mago obxectivo)**: Este é o método central. Debes programar a seguinte lóxica:
1. Se o atacante ou o obxectivo non están vivos (vida == 0), imprime un erro e cancela o ataque.
2. Se o atacante non ten un `feitizoEquipado` (é null), imprime: *"Erro: [nome] non ten maxia equipada"*.
3. Se o atacante ten menos maná do que custa o feitizo, imprime: *"Erro: [nome] non ten maná suficiente"*.
4. **Se todo é correcto:** * Resta o custo do feitizo ao maná do atacante.
* Chama ao método `recibirDano()` do obxectivo pasándolle o `danoBase` do feitizo.
* Imprime unha mensaxe épica: *"[Nome atacante] lanza [Nome Feitizo] contra [Nome obxectivo]!"*.
* **toString()**: Devolve o estado actual do personaxe. Exemplo: `[Nome Mago] -> PV: 80/100 | PM: 20/50`.

## 3. Programa Principal (`Main`)

Crea unha clase para testear a interacción e simular un pequeno combate:

1. **Creación**:
* Crea dous obxectos `Feitizo` ("Raio Globular" con moito dano e custo, e "Estela de Xeo" máis barato).
* Crea dous obxectos `Mago` (Ex: "Gandalf" e "Merlín"). Equípalles os feitizos correspondentes.


2. **Combate (Interacción)**:
* Fai que o primeiro mago ataque ao segundo.
* Comproba con `toString()` de ambos magos que ao primeiro lle baixou o maná e ao segundo lle baixou a vida.


3. **Mecánicas de Estado**:
* Fai que o primeiro mago ataque repetidas veces ata quedar sen maná. Comproba que o sistema bloquea o ataque e imprime o erro correcto.
* Fai que o mago esgotado use o método `meditar()` para recuperar enerxía e tente atacar de novo.


4. **Final da batalla**:
* Fai que un mago ataque ata deixar ao outro a 0 de vida. Comproba que a vida non dá números negativos e que mostra a mensaxe de derrota.
* Tenta atacar ao mago derrotado de novo (debería saltar a validación de que xa non está vivo).
