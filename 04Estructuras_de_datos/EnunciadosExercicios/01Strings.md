# String Exercises

## Exercise 1: String Operations

Create a class called `StringOperations` that has only static methods and implements the following methods without using standard string manipulation methods:

1. **Character per line:** Write each character of a string on a different line.
2. **Check prefix:** Check if a string starts with a given substring.
3. **Count characters:** Count how many times a character appears in a string.
4. **Number of words:** Calculate the number of words in a sentence (separated by one or more spaces).
5. **Initials in uppercase:** Return a new string equal to the original, but with the initials of each word in uppercase.
6. **Reverse string:** Return a string with the order of characters reversed.
7. **Replace characters:** Replace all occurrences of one character with another.
8. **Uppercase/lowercase:** Convert uppercase to lowercase and vice versa.
9. **Search substring:** Check if a string contains a substring.
10. **Palindrome:** Indicate if a string is a palindrome (reads the same forwards and backwards).
11. **Acronyms of a phrase:** Return the acronyms of a phrase in uppercase (first letter of each word).

## Exercise 2: Caesar Cipher

One of the oldest methods for encoding messages is the one known as the Caesar cipher. Its operation is simple: each of the letters of the original message is replaced by another letter that is located a fixed number of positions further along in the alphabet.

The shifts can also be negative; for example, if we use a shift of -1, 'E' will become 'D', while 'A' will become 'Z'.

Our Caesar cipher does not encode characters that are not Anglo-Saxon letters. Thus, for example, spaces or punctuation symbols will not suffer any change.

1. Create a Java program that asks the user for an unencrypted message and the shift they want to use and returns the encrypted message.

   For example, if the user enters the message "ABC" and the shift is 3, the program will return "DEF".

2. Modify the program to display a menu where the user can choose encryption or decryption (structure it using methods).

You can check your results with the help of this online calculator:
<https://es.planetcalc.com/1434/>

## Exercise 3 (<https://www.aceptaelreto.com/problem/statement.php?id=106&cat=16>)

The EAN-8 system encodes barcodes in 8 numbers, of which the first 7 constitute the code itself and the last one would be the control code.

<p><img src="codigo-ean.png" width="100px"></p>

To calculate the control digit (counting from the right):

1. The digits in odd positions are multiplied by 3.
2. The digits in even positions are multiplied by 1.
3. The results are added together and the number needed to reach the nearest multiple of 10 is calculated.

For example, for the EAN-8 code in the figure, the operation to be performed is:
$$2 · 3 + 5 · 1 + 9 · 3 + 3 · 1 + 8 · 3 + 5 · 1 + 6 · 3 = 88$$

The check digit is the number that must be added to the previous result to reach a multiple of 10. In the EAN-8 example, to reach the nearest multiple of 10 above the number 88, 2 must be added (and reach 90). Keep in mind that if the sum is already a multiple of 10, the control digit will be 0.

Create a program that receives an EAN-8 code without the control digit and calculates it. Add the possibility to check the control digit of a complete code.

## Exercise 4 (<https://www.aceptaelreto.com/problem/statement.php?id=117&cat=16>)

Create a program that, in response to a greeting with the structure "I am \<name\>", replies "Hello, \<name\>" as long as it receives lines of text different from "The party is over" (this with any capitalization).

## Exercise 5 (<https://www.aceptaelreto.com/problem/statement.php?id=110&cat=16>)

Implement a program that determines whether two lines rhyme or not (considering consonant rhyme, all letters must match from the last stressed vowel).

Assume that the last words are grave, meaning that the stress is on the penultimate vowel of the line and that these last vowels do not have a tilde.

In the first approach, consider that the letters you need to check are the last 3 of each line.

Once you have achieved this, modify it so that the program looks for the penultimate vowel and compares from there.

## Exercise 6: Regular Expressions

### Part a

Create the following regular expressions and provide matching and non-matching examples:

| Regular Expression                      | Regular expression | Matching Example | Non-Matching Example |
|----------------------------------------|-------------------|-----------------|---------------------|
| Three uppercase letters                 ||||
| 9-digit number                          ||||
| Number, period, and uppercase/lowercase letter ||||
| Uppercase initial and lowercase         ||||
| Does not start with a digit            ||||
| Between 5 and 10 alphanumeric characters  ||||
| Starts with [DAW] followed by three numbers between 4 and 7 ||||

### Part b

Create an application that validates strings according to the previous regular expressions.

## Exercise 7: Search for Bold Words

Bold words in Markdown format are surrounded by two asterisks. Create a program that receives a text string and displays the bolded words. You must use regular expressions.

## Exercise 8: User Accounts

Create a `User` class with the following characteristics:

### Attributes

- Name
- Surname
- DNI. It must be checked, using a regular expression, that it has the correct format (6 digits followed by an uppercase letter) and that the letter is correct, according to the official algorithm.
- System user
- Password
- Email. It must be checked, using a regular expression, that it has the correct format.
  
### Constructor

- It must receive the name, surname, DNI, and email. It should create the system user (`using createUser()`) and the password randomly using the `createPassword()` method.

### Methods

- `calculateDNILetter()`: Calculates the DNI letter according to the official algorithm. It must be a static method.
- `isDNIValid()`: Checks if the DNI is correct.
- `isEmailValid()`: Checks if the email is correct.
- `createUser()`: Creates a system user with the user's name in lowercase and the initials of the surnames. For example, for a user named "Xiama" with surnames "Pérez López", the system user would be "xianapl".
- `createPassword()`: Creates a random password of 8 alphanumeric characters, with the following conditions:
  - 12 characters
  - 3 uppercase letters
  - 2 symbols from the following: `!@#$%&`
**HINTS**: Use the `Random` class to generate random numbers, and the `StringBuilder` class to generate the password. First, generate the password with 10 lowercase letters, randomly determine which 3 will become uppercase, choose 2 symbols, and place them in random positions.
- `toString()`: Returns a string with the user's information.

## Exercise 9: Vehicle

Create a `Vehicle` class with the following characteristics:

### Attributes

- License plate. It must be a valid license plate, with 4 numbers and 3 letters (according to current regulations), use regular expressions.
- Brand
- Model
- Color
- Year of manufacture. It must be checked that it is a valid year (between 1900 and the current year).
- Owner. It will be an object of the `Person` class. You can use the `Person` class from the previous exercise.
- Last license plate, it will be a static attribute that will be incremented every time a vehicle is created. You must follow the current registration rules.

### Constructors

- One of them must receive the brand, model, color, year of manufacture, and owner. The license plate must be assigned automatically, the next one to the last assigned license plate.
- Another must receive the values of all attributes, including the license plate.

### Methods

- `register()`: Assigns a license plate to the vehicle. It must modify the static attribute `lastLicensePlate` so that the next license plate is correct.
- `toString()`: Returns a string with the vehicle's information.
- Methods that allow validating the indicated attributes.

**HINTS**: Use the `LocalDate` class to get the current year.

## Exercise 10: Operations on `StringBuilder`

Implement operations on a string converted to `StringBuilder`:

1. Add `*` at position 3.
2. Replace the character at position 1 with `#`.
3. Delete the character at position 2.
4. Delete characters between positions 5 and 8.
5. Reverse the characters.
6. Replace characters in even positions with `$`.
7. Convert the final result to `String`.
