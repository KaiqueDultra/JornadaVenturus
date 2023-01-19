package Exercicio02;

import java.util.Scanner;

public class Mercado {
    public static void main(String[] args){
        String nome;
        double preco;
        double valor = 0.0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do produto? ");
        nome = ler.next();
        System.out.println("Agora nos informe o valor do produto: ");
        preco = ler.nextDouble();

        //Primeira forma de resolver
        if(preco < 30) {valor = preco * 0.10;}
        else{valor = preco * 0.20;}
        System.out.printf("O valor com o desconto é de: %.2f %n", (valor)); //Colocando duas casas após a virgula.

        //Segunda forma
        if(preco < 30){
            valor = (preco * 10) / 100; //Ou seja, pega o valor do produto e multiplica por 10 e depois divide por 100.
        }else{
            valor = (preco * 20) / 100; //Mesma coisa, só que aqui com 20%.
        }
        System.out.printf("O valor com o desconto é de: %.2f %n", (valor)); //Colocando duas casas após a virgula.

        //Terceira forma
        double desconto = preco * (preco > 30 ? 0.20 : 0.10); //Nesse caso, se o preco for maior que 30, ele faz o 0.20 de desconto (20%), caso seja menor,
        //cai para o 0.10. Ess exemplo é chamado de operador ternário.
        System.out.printf("O valor com o desconto é de: %.2f %n", (desconto)); //Colocando duas casas após a virgula.
    }
}
