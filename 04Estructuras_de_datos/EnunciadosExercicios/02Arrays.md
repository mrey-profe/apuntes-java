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

A partir da información contida na matriz deberán realizarse os cálculos necesarios para amosar a seguinte información:

- Nota media de cada alumno.
- Nota media de todo o curso.
- Indicar cantas notas son superiores ou igual a 5 (aprobados en total)
- Indicar cantas notas son inferiores a 5 (suspensos)
- Mostrar cal é a mellor nota de todo o curso.
- Mostrar cal é a peor nota de todo o curso.
- Indicar cantos alumnos teñen todas as materias aprobadas.

## Exercicio 7: Array bidimensional de flores

Imos crear un xardín de flores programando en Java, nel queremos plantar rosas, xirasois, margaridas e tulipáns.

a. Crea unha función chamada `crearXardin`, á que se lle pase o ancho e o alto do xardín e o encha con esas flores de forma aleatoria. Debe devolver a lista bidimensional que representará o xardín plantado.

b. Crea outra función chamada `contarFlores` á que se lle pase unha lista bidimensional con flores e o nome dunha flor e devolva o número de flores dese tipo que están plantadas no xardín.

Por exemplo, se chamamos á función:  

```Java
xardinExemplo = crearXardin(5, 4)  
```

Creará unha lista parecida a esta (é aleatoria, polo que non sempre será a mesma):  

```Java
["Tulipán", "Tulipán", "Tulipán", "Xirasol", "Margarida"]  
["Tulipán", "Xirasol", "Rosa", "Tulipán", "Rosa"]  
["Xirasol", "Rosa", "Xirasol", "Tulipán", "Xirasol"]  
["Rosa", "Xirasol", "Xirasol", "Tulipán", "Xirasol"]  
```

Se agora contamos as rosas:  

```Java
rosas = contarFlores(xardinExemplo, "Rosa")  
```

Devolverá 4.
