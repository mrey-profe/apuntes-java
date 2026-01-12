# ArrayLists

## Exercise 1

Create a program that reads student grades from the keyboard while the user does not indicate that they want to stop.

The program must store the grades in an **ArrayList** and, at the end, display the average of the grades.

You can ask for a grade and then ask if they want to continue or not.

## Exercise 2

### Class *Person*

Create a class *Person* that has the following attributes:
- Name
- Surname
- Phone

### Class *Flower*

Create a class *Flower* that has the following attributes:
- Name
- Color
- Price
- Array with the possible colors of the flowers, which will be common to all flowers.

Create a constructor that initializes all attributes and a method that displays the information of the flower.

Check that the price is not negative and that the color is within the possible colors. If not, throw an exception.

### Class *Bouquet*

Create a class *Bouquet* that has the following attributes:
- ArrayList of flowers
- Person who ordered it

#### Methods

- Constructor that only receives the person who ordered the bouquet. The bouquet is initialized without flowers.
- Constructor that initializes all attributes.
- Method that adds a flower to the bouquet.
- Method that removes flowers from the bouquet. The type of flower, its color, and the number of them to be removed are passed to it.
- Method that calculates the total price of the bouquet.
- Method that shows the information of the entire bouquet: what flowers it has, the total price, and the person who bought it.

### Main program

Create a program that creates an ArrayList of bouquets (to your liking) and traverses it to display them on the screen.

## Exercise 3

Create a program that allows managing a list of organized trips and the registered travelers. The program must include the following functionalities:

- Add an organized trip (destination, price, number of days).
- Register a traveler (name, age) and associate them with an organized trip.
- Show all available tourist destinations.
- List the registered travelers for each trip.
- Delete a trip (and its associated travelers).
- Search for trips by destination.
- Search for destinations by country.

Think about what classes and attributes are necessary to implement the program. Use **ArrayList** to store the trips and travelers. Implement methods to perform the requested operations.

# HashMap

## Exercise 4

Modify exercise 2 (Flowers and Bouquets) so that the ArrayList of flowers in the Bouquet class is a **HashMap**, where the key is the flower and the value is the quantity of flowers of that type in the bouquet. Implement the necessary methods to add, remove, and display flowers in the bouquet using the **HashMap**.

## Exercise 5

Create a program that allows managing the members of an institute. We will have the following classes:
- **Student**: name, surname, date of birth (investigate how to handle dates in Java).
- **Teacher**: name, specialty.
- **Subject**: name, weekly hours.
- **Course**: Level, letter, list of students, and **HashMap** that associates Subject with Teacher.
- **Institute**: name, address, **HashMap** that associates courses (object of the **Course** class) with tutors (object of the **Teacher** class).
