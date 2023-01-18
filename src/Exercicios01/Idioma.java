package Exercicios01;

import java.util.Locale;

public class Idioma {
    public static void main(String[] args){
        //Idioma do sistema
        Locale idioma = Locale.getDefault(); //Buscando o idioma do dispositivo
        String linguagem = idioma.getDisplayLanguage(); //Armazenando o idioma na string linguagem
        System.out.println("O idioma do seu computador é: " + linguagem);
    }
}
