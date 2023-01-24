package Exemplos;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args){
        int x;
        String dia;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 para o dia da semana: ");
        x = ler.nextInt();

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta:";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
    }
}
