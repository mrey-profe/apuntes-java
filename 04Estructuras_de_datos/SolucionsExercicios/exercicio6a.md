## Exercise 6: Regular Expressions

### Part a

Create the following regular expressions and provide matching and non-matching examples:

| Regular Expression                      | Regular expression | Matching Example | Non-Matching Example |
|----------------------------------------|-------------------|-----------------|---------------------|
| Three uppercase letters                 |[A-Z]{3}|ABC|aBN|
| 9-digit number                          |\\\\d{9}|789456132|7412589631|
| Number, period, and uppercase/lowercase letter |\\\\d\\\\.[A-Za-z]|4.a|4.4|
| Number, period, or uppercase/lowercase letter |[0-9\\\\.A-Za-z] ou \\\\d|\\\\.|[A-Za-z]|4.a|4.1|
| Uppercase initial and lowercase         |[A-Z][a-z]+|Ae|aE|
| Does not start with a digit            |^\\\\D|a3445|_3456|
| Between 5 and 10 alphanumeric characters  |\\\\w{5,10}|adfg_|sdf_sdtghfgsd|
| Starts with [DAW] followed by three numbers between 4 and 7 |^\\[DAW\\][4-7]{3}|[DAW]456|DAW234|