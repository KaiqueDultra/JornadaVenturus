package Exercicio04;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        int numero;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        if(numero % 2 == 0){ //Retornando o resto da divisão, se o resto for 0, o numero é par.
            System.out.println("O numero " + numero + " é par.");
        }else{ //Caso ao contrário, o numero é impar.
            System.out.println("O numero " + numero + " é impar.");
        }
    }
}
