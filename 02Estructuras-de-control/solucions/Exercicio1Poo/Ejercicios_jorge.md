# Exercicios para hacer con los alumnos

# Exercicio 1 : Crear una clase cualquiera 

Implementa una clase que represente un obxecto que poderías atopar nun programa informático, xogo de ordenador , aplicación web, etcétera, por exemplo, un personaxe dun xogo, un producto de unha tenda online, un alumnos nun programa de xestión dun instituto, etcétera. Presta especial atención os tipos das variables (`int`, `double`, `String`, etcétera). Implementa unha funcion booleana a túa elección, por exemplo, se o alumno e maior de idade, se queda stock do obxecto o se o personaxe ten vida.

# Ejercicio 2: Clase Libro 

Crea una clase llamada `Libro` que guarde la información de cada uno de los libros de una biblioteca.  
La clase debe guardar estos atributos: título del libro, autor, número de ejemplares del libro y número de ejemplares prestados.

La clase contendrá los siguientes métodos:

- Un **constructor** que reciba al menos título, autor y número total de ejemplares, e inicialice el número de ejemplares prestados a 0.  
- Un método `boolean prestar()` que incremente el número de ejemplares prestados cada vez que se realice un préstamo del libro.  
  - No se podrán prestar libros si no quedan ejemplares disponibles (es decir, si ejemplares prestados es igual al número total de ejemplares).  
  - El método devolverá `true` si se pudo realizar la operación y `false` en caso contrario.
- Un método `boolean devolver()` que decremente el número de ejemplares prestados cuando se produzca la devolución de un libro.  
  - No se podrán devolver libros que no se habían prestado (si el número de ejemplares prestados es 0).  
  - El método devolverá `true` si se pudo realizar la operación y `false` en caso contrario.

Escribe una clase con un método `main(String[] args)` que pruebe el funcionamiento de la clase `Libro` creando un libro, realizando préstamos y devoluciones, y mostrando por pantalla los resultados.

---

# Ejercicio 3: Rectangulo (Java)

Crea una clase llamada `Rectangulo` que:

- Declare dos atributos de tipo numérico (por ejemplo, `double`) para la base y la altura de un rectángulo.  
- Declare un constructor que reciba la base y la altura. El constructor comprobará que la base y la altura sean positivas. Si alguna de ellas no lo es, (tambien si es 0) se asignará el valor 1 y se imprimirá un mensaje por pantalla.

La clase tendrá los siguientes métodos:

- Un método `double area()` que devuelva el área del rectángulo.  
- Un método `double perimetro()` que devuelva el perímetro del rectángulo.
- Un método `boolean esCuadrado()` que devuelva `true` si el rectángulo es cuadrado (base y altura iguales) y `false` en caso contrario.

Escribe una clase con un método `main(String[] args)` que cree varios objetos `Rectangulo`, muestre su información por pantalla  y compruebe si cada uno es cuadrado.


## Exercicio 4: Semáforo

Implementa unha clase chamada **Luz** que simule o funcionamento dun semáforo coas seguintes características:

**Atributos**

- cor: só pode ter tres valores posibles ("verde", "amarela", "vermella")

**Construtor**

- Por defecto: inicializará a cor a "vermella"

**Métodos**

- `getCor()`: devolve o valor actual da cor do semáforo
- `cambio()`: non devolve nada, modifica a cor do semáforo seguindo esta secuencia:
  - verde → amarela
  - amarela → vermella 
  - vermella → verde

**Restricións**

- O atributo cor debe ser privado
- Os cambios de cor só poderán realizarse a través do método `cambio()`

Crea unha clase principal que probe o funcionamento do semáforo realizando varios cambios de cor e amosando o estado do semáforo tras cada cambio.



## Exercicio 5: Persoa

Implementa unha clase chamada **Persoa** coas seguintes condicións:

- Os seus atributos son: nome, idade, dni, situacionActual ('E' estuda, 'T' traballa ou 'D' en situación de desemprego), peso (en kg) e altura (en cm). Non queremos que se acceda directamente a eles.
- Terá un construtor que recibirá todos os valores dos atributos nos parámetros e os incorporará aos mesmos. Comprobará que a idade teña un valor entre 0 e 150 e que a situacionActual sexa 'E', 'T' ou 'D'. De non ser así, non lle asignará valor e imprimirá unha mensaxe por pantalla.

Os seus métodos son:


- `eMaiorDeIdade()`: indica se a persoa é maior de idade, devolve un valor booleano.
- `eCorrectaSituacion(char situacionActual)`: comproba que a situación actual introducida é correcta. Devolve un valor booleano. Non será visible ao exterior.
- `eCorrectaIdade(int idade)`: comproba que a idade introducida atópase entre 0 e 150. Devolve un valor booleano. 
- `mostrarInformación()`: amosa por pantalla a información da persoa de forma similar a esta:

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

  Escribe unha clase principal que cree unha persona con idade e situación correctas e amosa a información da persoa., e despois cree unha persona con idade e situación incorrectas e amose a información da persoa.


#2. Ejercicios con getters, setters e metodos máxicos (toString())

1.Modifica a clase 'Rectangulo' do exercicio 3 para que teña getters e setters para todos os seus atributos e un metodo maxico (toString()) que devuelva unha cadea coas informacion do rectangulo. Ademáis, os métodos área, perimetro e esCuadrado utilizarn os getters para acceder aos atributos.

2.Modifica a clase 'Semáforo' do exercicio 4 para que teña getters e setters para todos os seus atributos e un metodo maxico (toString()) que devuelva unha cadea coas informacion do semáforo. Ademáis, os métodos cambio utilizarn os getters para acceder aos atributos.

3.Modifica a clase 'Persoa' do exercicio 5 para que teña getters e setters para todos os seus atributos e un metodo maxico (toString()) que devuelva unha cadea coas informacion da persoa. Ademáis, os métodos calcularIMC, eMaiorDeIdade, eCorrectaSituacion, eCorrectaIdade e mostrarInformación utilizarn os getters para acceder aos atributos, e a o método mostrarInformación utilizarrá toString() para mostrar a informacion da persoa. Ademais engade o seguinte método:
`calcularIMC()`: Devolverá o Índice de Masa Corporal (IMC), que se calcula como:
$$ IMC=\frac{peso(kg)}{altura(m)^2} $$

Agora xa podedes facer os exercicios que estan cos apuntes, menos o 2, 3 e 5 que xa os tedes feitos!