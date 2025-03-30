package org.example;

public class Main {
    public static void main(String[] args) {
        //Tres letras maiúsculas
        String expresion1 = "[A-ZÑ]{3}";
        System.out.println("ABC: " + "ABC".matches(expresion1)); //true
        System.out.println("ABC: " + "ABc".matches(expresion1)); //false
        System.out.println("ABC: " + "ABCD".matches(expresion1)); //false
        //Número de 9 díxitos
        String expresion2 = "\\d{9}";
        System.out.println("123456789: " + "123456789".matches(expresion2)); //true
        System.out.println("12345678: " + "12345678".matches(expresion2)); //false
        System.out.println("1234567890: " + "1234567890".matches(expresion2)); //false
        //Número, punto e letra maiúscula ou minúscula
        String expresion3 = "[0-9.a-zA-ZñÑ]";
        System.out.println("1: " + "1".matches(expresion3)); //true
        System.out.println(".: " + ".".matches(expresion3)); //true
        System.out.println("1.: " + "1.".matches(expresion3)); //false
        //Maiúscula inicial e minúsculas
        String expresion4 = "[A-ZÑ][a-zñ]*";
        System.out.println("A: " + "A".matches(expresion4)); //true
        System.out.println("Aa: " + "Aa".matches(expresion4)); //true
        System.out.println("AaA: " + "AaA".matches(expresion4)); //false
        //Non comeza por díxito
        String expresion5 = "[^0-9].*";
        System.out.println("A: " + "A".matches(expresion5)); //true
        System.out.println("1: " + "1".matches(expresion5)); //false
        System.out.println("A1: " + "A1".matches(expresion5)); //true
        System.out.println("1A: " + "1A".matches(expresion5)); //false
        //Entre 5 e 10 caracteres alfanuméricos
        String expresion6 = "\\w{5,10}";
        System.out.println("12345: " + "12345".matches(expresion6)); //true
        System.out.println("1234567890: " + "1234567890".matches(expresion6)); //true
        System.out.println("12345678901: " + "12345678901".matches(expresion6)); //false
        System.out.println("1234: " + "1234".matches(expresion6)); //false
        //Comeza por [DAW] seguido de tres números entre 4 e 7
        String expresion7 = "\\[DAW\\][4-7]{3}";
        System.out.println("[DAW]444: " + "[DAW]444".matches(expresion7)); //true
        System.out.println("DAW444: " + "DAW444".matches(expresion7)); //true
        System.out.println("D333: " + "D333".matches(expresion7)); //false
    }
}