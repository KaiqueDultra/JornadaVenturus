package Exemplos;

import java.util.Scanner;

public class DiaSemanaIfElse {
    public static void main(String[] args){
        int x;
        String dia;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 para o dia da semana: ");
        x = ler.nextInt();

        if(x == 1){
            dia = "Domingo";
        } else if (x == 2) {
            dia = "Segunda";
        } else if (x == 3) {
            dia = "Terça";
        } else if (x == 4) {
            dia = "Quarta";
        } else if (x == 5) {
            dia = "Quinta";
        } else if (x == 6) {
            dia = "Sexta";
        } else if (x == 7) {
            dia = "Sabado";
        }else{
            dia = "Valor inválido";
        }
        System.out.println("Dia da semana: " + dia);
    }
}
