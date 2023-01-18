package Exercicio02;

import java.util.Scanner;

public class Valores_inteiros {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in); //Scanner é usado para ler a entrada de dados.
        int nm1, nm2, resultado; //Declarando as variaveis.

        System.out.println("Digite o primeiro valor: ");
        nm1 = ler.nextInt(); //Guardando o valor digitado dentro da variavel nm1
        System.out.println("Digite o segundo valor: ");
        nm2 = ler.nextInt(); //Guardando o valor digitado dentro da variavel nm2
        resultado = nm1 + nm2; //Somando os dados informados pelo usuário e atribuindo na variavel "resultado"

        System.out.println("A soma dos dois valores é de: " + resultado); //Imprimindo o resultado da soma.
    }
}
