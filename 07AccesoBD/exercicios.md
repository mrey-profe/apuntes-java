# Exercicios acceso a BD

## BD empregados

### Exercicio 1

Crea un programa que se conecte a la base de datos `empleados.db` e:

- Pregunte ao usuario unha cantidade e amose os empregas que cobren esa cantidade ou menos, así como o departamento ao que pertencen. Seguirá preguntando en bucle un novo salario ata que o usuario indique que non quere seguir preguntando.
- Pregunte ao usuario un departamento e amose os empregados que pertencen a ese departamento.
- Cree un novo departamento, pedindo os datos necesarios e engadindoo á base de datos.
- Modifique o salario de todos os empregados, incrementándoo nun 5%.
- Elimine un departamento, pedindo o nome do departamento e eliminando todos os empregados que pertencen a ese departamento. Se non existe o departamento, amosarase un erro.

Debes empregar consultas preparadas e parametrizadas.

Podes crear unha clase DAO que conteña os métodos necesarios para realizar as operacións solicitadas. De facelo así, cada método debe abrir e pechar a conexión e devolver os resultados necesarios nas estruturas que consideres oportunas.
