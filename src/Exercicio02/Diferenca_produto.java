package Exercicio02;

import java.util.Scanner;

public class Diferenca_produto {
    public static void main(String[] args){
        int a, b, c, d, soma, resultado;
        int contador = 0;

        Scanner valores = new Scanner(System.in);
        do{
            System.out.println("Digite o primeiro valor: ");
            a = valores.nextInt();
            contador++;
            System.out.println("Digite o segundo valor: ");
            b = valores.nextInt();
            contador++;
            System.out.println("Digite o terceiro valor: ");
            c = valores.nextInt();
            contador++;
            System.out.println("Digite o quarto e último valor: ");
            d = valores.nextInt();
            contador++;
        } while(contador < 4);
        soma = (a * b - c * d);
        resultado = soma;
        System.out.println("A diferença é de: " + resultado);
    }
}
