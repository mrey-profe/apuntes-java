# Array Exercises

## Exercise 1: Creating a one-dimensional array

Create a program that manages the grades of a student in a specific module. The program will ask how many grades will be entered, request the grades, store them in an array, and display the average.

## Exercise 2: Even and odd arrays

Write a program that defines two arrays of 100 integers, one called `even` and the other `odd`. Initialize the first with the first 100 positive even numbers (i.e., even[0] will contain the value 2, even[1] will contain the value 4, even[2] will contain the value 6, and so on).

Initialize the second with the first 100 positive odd numbers.

## Exercise 3: Months of the year

Create a program with two constant arrays: one with the names of the months in Galician and, in another, the months of the year in English.

Traverse the two arrays and show the equivalence between the months in Galician and in English.

## Exercise 4: Returning arrays

Write a method that receives an integer `n` and returns an array of `n` random numbers between 1 and 100.

## Exercise 5: Passing arrays as parameters

Write a method that receives two arrays of integers and returns an array that contains the sum of the elements of the received arrays. It must be checked that the arrays have the same size.

## Exercise 6: Two-dimensional array. Course grades

A matrix must be created with the grades of an entire course. Each row will represent the grades of a student and each column will represent the grades of the subjects. There are 10 students in total, and each will have grades for the 8 subjects that make up the course.

The matrix will be initialized directly with the grades obtained throughout the course.

Based on the information contained in the matrix, the necessary calculations must be made to show the following information (you must create a class with static methods for each of the operations):

- Average grade for the entire course.
- Average grade for each student.
- Average grade for each subject.
- Indicate how many grades are greater than or equal to 5 (passed in total)
- Indicate how many grades are less than 5 (failed)
- Show what the best grade in the course is.
- Show what the worst grade in the course is.
- Indicate how many students have passed all subjects.

## Exercise 7: Two-dimensional array of flowers

Let's create a flower garden by programming in Java, in which we want to plant roses, sunflowers, daisies, and tulips.

### `Flower` Class

We will create a `Flower` class that will store the type of flower and its color. It will also have two static and constant attributes that will be arrays with the possible types of flowers and colors.

You must check that the flower being created is valid, i.e., that the type and color are within the arrays of types and colors. Use some method of the `Arrays` class to determine if the type and color are within the arrays of types and colors.

It will have a `toString` method that will return the flower in text format.

```text
rose of red color
```

### `Garden` Class

The `Garden` class will have a single attribute: a two-dimensional array of flowers. This array will represent the garden.

The constructor will receive the width and height of the garden. It must be initialized randomly with flowers (the constants of the `Flower` class will be used to know which are the possible types of flowers and colors).

It will have a `countFlowers` method that receives a type of flower as a parameter and returns the number of flowers of that type in the garden.

It will have a `toString` method that will return the garden in text format. Use the `StringBuilder` class to build the resulting text string.

Create a `getter` that returns the array of flowers and try to display it in the main program using some method of the `Arrays` class.
