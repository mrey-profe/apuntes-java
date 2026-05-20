# Exercicios acceso a BD

## BD empregados

### Exercise 1

Create a program that connects to the `employees.sql.gz` database and:

- Asks the user for a salary amount and displays the employees who earn that amount or less, along with the department they belong to. It will keep asking in a loop for a new salary until the user indicates they want to stop.
- Asks the user for a department name and displays the employees belonging to that department.
- Creates a new department, asking for the necessary data and adding it to the database.
- Updates the salary of all employees, increasing it by 5%.
- Deletes a department, asking for the department name and removing all employees belonging to that department. If the department does not exist, an error will be displayed.

You must use prepared and parameterized queries.

Create a DAO class containing the necessary methods to perform the requested operations. Each method must open and close the connection and return the results in whatever data structures you consider appropriate.

## Netflix DB

### Exercise 2

Create a program that connects to the `netflix.sql` database and:

- Display the available content types (`type` column) and let the user select one. Then, list the titles of that type, showing the title, country, release year and rating.
- Search by country:
  - Show the user a list of distinct countries available in the database and let them pick one.
  - Display all shows from that country, showing the title, type and release year, sorted from newest to oldest.
- Add a new show, asking the user for all required fields and inserting it into the database. If a show with the same `show_id` already exists, display an error.
- Delete a show by title. If no show with that title exists, display an error.

You must use prepared and parameterized queries.

Create a DAO class containing the necessary methods to perform the requested operations. Each method must open and close the connection and return the results in whatever data structures you consider appropriate.

## MongoDB — sample_mflix

### Exercise 3

Create a program that connects to the `sample_mflix` MongoDB database (collection `movies`) and:

- Asks the user for a year and lists all movies released that year, showing title, runtime, rating (`rated`) and plot.
- Adds a new movie, asking the user for: title, year, runtime, plot, and type. Inserts the document into the collection.
- Updates the `rated` field of a movie: asks the user for a title and a new rating value, and updates all matching documents. Reports how many documents were modified.
- Deletes a movie by title. If no document with that title exists, displays an error.

Create a DAO class containing the necessary methods to perform the requested operations.
