package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String texto = "Idioma meu, homilde, nidio, **popular**,  \n" +
                "labrego, suburbial e **mariñeiro**,  \n" +
                "que fas avergoñar  \n" +
                "ó burgués, ó señorito i o tendeiro:  \n" +
                "levas **sangue** do povo...  \n" +
                "viudas de vivos e mortos  \n" +
                "que ninguén consolará. \n";
        String expresion  = "\\*\\*.+\\*\\*";
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println(matcher.group().substring(2, matcher.group().length() - 2));
        }
    }
}