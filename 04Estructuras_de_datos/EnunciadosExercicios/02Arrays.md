# Exercicios de Arrays

## Exercicio 1: Creación dun array unidimensional

Crea un programa que sirva para xestionar as notas dun alumno nun determinado módulo. O programa preguntará cantas notas se van introducir, pedirá as notas, gardaraas nun array e amosará a media.

## Exercicio 2: Arrays de pares e impares

Escribe un programa no que se definan dous arrays de 100 números enteiros, un chamado `pares` e outro `impares`. Inicializa o primeiro cos 100 primeiros números pares positivos (é dicir, pares[0] conterá o valor 2, pares[1] conterá o valor 4, pares[2] conterá o valor 6, e así sucesivamente).

Inicializa o segundo cos 100 primeiros números impares positivos.

## Exercicio 3: Meses do ano

Crea un programa con dous arrays constantes: un co nome dos meses en galego e, noutro, os meses do ano en inglés.

Percorre os dous arrays e amosa a equivalencia entre os meses en galego e en inglés.

## Exercicio 4: Devolución de arrays

Escribe un método que reciba un número enteiro `n` e devolva un array de `n` números aleatorios entre 1 e 100.

## Exercicio 5: Paso de arrays como parámetros

Escribe un método que reciba dous arrays de números enteiros e devolva un array que conteña a suma dos elementos dos arrays recibidos. Debe comprobarse que os arrays teñen o mesmo tamaño.

## Exercicio 6: Array bidimensional. Notas dun curso

Deberase crear unha matriz coas notas de todo un curso. Cada fila representará ás notas dun alumno e cada columna representará as notas das materias. En total son 10 alumnos e cada un terá notas para as 8 materias das que se compón o curso.

Inicializarase a matriz directamente coas notas obtidas en todo o curso.

A partir da información contida na matriz deberán realizarse os cálculos necesarios para amosar a seguinte información (debes crear unha clase con métodos estáticos para cada unha das operacións):

- Nota media de todo o curso.
- Nota media de cada alumno.
- Nota media de cada módulo.
- Indicar cantas notas son superiores ou igual a 5 (aprobados en total)
- Indicar cantas notas son inferiores a 5 (suspensos)
- Mostrar cal é a mellor nota de todo o curso.
- Mostrar cal é a peor nota de todo o curso.
- Indicar cantos alumnos teñen todas as materias aprobadas.

## Exercicio 7: Array bidimensional de flores

Imos crear un xardín de flores programando en Java, nel queremos plantar rosas, xirasoles, margaridas e tulipáns.

### Clase `Flor`

Crearemos unha clase `Flor` que almacenará o tipo da flor e a súa cor. Terá ademais dous atributos estáticos e constantes que serán arrays cos tipos de flores e cores posibles.

Debes comprobar que a flor que se está a crear é válida, é dicir, que o tipo e a cor están dentro dos arrays de tipos e cores. Emprega algún método da clase `Arrays` para saber se o tipo e a cor están dentro dos arrays de tipos e cores.

Terá un método `toString` que devolverá a flor en formato de texto.

```text
rosa de cor vermella
```

### Clase `Xardin`

A clase `Xardin` terá un só atributo: un array bidimensional de flores. Este array representará o xardín.

Ao construtor se lle pasará o ancho e o alto do xardín. Debe inicializarse aleatoriamente con flores (se empregarán as constantes da clase `Flor` para saber cales son os tipos de flores e cores posibles).

Terá un método `contarFlores` que reciba como parámetro un tipo de flor e devolva o número de flores dese tipo que hai no xardín.

Terá un método `toString` que devolverá o xardín en formato de texto. Utiliza a clase `StringBuilder` para construír a cadea de texto resultante.

Crea un `getter` que devolva o array de flores e proba a amosalo no programa principal empregando algún método da clase `Arrays`.
