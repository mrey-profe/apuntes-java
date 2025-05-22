# Exercicios acceso a BD

## BD empregados

### Exercicio 1

Crea un programa que se conecte a la base de datos `traballadores.db` e:

- Pregunte ao usuario unha cantidade e amose os empregados que cobren esa cantidade ou menos, así como o departamento ao que pertencen. Seguirá preguntando en bucle un novo salario ata que o usuario indique que non quere seguir preguntando.
- Pregunte ao usuario un departamento e amose os empregados que pertencen a ese departamento.
- Cree un novo departamento, pedindo os datos necesarios e engadindoo á base de datos.
- Modifique o salario de todos os empregados, incrementándoo nun 5%.
- Elimine un departamento, pedindo o nome do departamento e eliminando todos os empregados que pertencen a ese departamento. Se non existe o departamento, amosarase un erro.

Debes empregar consultas preparadas e parametrizadas.

Podes crear unha clase DAO que conteña os métodos necesarios para realizar as operacións solicitadas. De facelo así, cada método debe abrir e pechar a conexión e devolver os resultados necesarios nas estruturas que consideres oportunas.


### Exercicio 2
Crea un programa que se conecte a la base de datos `tendaBD.db` e:

- Amosar ao usuario os posibles países e permitir que seleccione un deles. A continuación, selecciona os clientes dese país e amosa o seu nome, apelidos e poboación.
- Inserción de cliente,
  - Pedir os datos necesarios para a inserción de cliente e engadilo á base de datos.
  - Se o cliente xa existe, amosarase un erro.
  - Á hora de pedir o país, debe amosarse un menú cos países existentes na base de datos e introducir o código do país.
  - Listar os artigos dispoñibles e permitir que o usuario seleccione un deles. A continuación, borra o artigo da base de datos.