package Exercicio04;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args){
        int numero;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        if(numero >= 0){ //Testando se o numero é positivo.
            if(numero % 2 == 0){ //Testando se o resto da divisão é igual a 0
                System.out.println("O numero " + numero + " é par.");
            }else{
                System.out.println("O numero " + numero + " é impar.");
            }
        }else{ //Se o numero não for maior que 0, retorna NEGATIVO.
            System.out.println("NEGATIVO");
        }
    }
}
