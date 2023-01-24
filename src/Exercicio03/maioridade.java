package Exercicio03;

import java.util.Scanner;

public class maioridade {
    public static void main(String[] args){
        int nascimento, ano, conta;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        ano = ler.nextInt();
        System.out.println("Agora, nos informe o ano que você nasceu: ");
        nascimento = ler.nextInt();

        conta = (ano - nascimento);

        //Estrutura condicional Composta.
        if(conta >= 18){
            System.out.println("Você possui a maioridade! Você tem: " + conta + " anos.");
        }else{
            System.out.println("Você ainda não possui a maioridade.");
        }
    }
}
