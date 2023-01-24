package Exercicio03;

import java.util.Scanner;

public class Viajem {
    public static void main(String[] args){
        double valor;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor juntado: ");
        valor = ler.nextDouble();

        //Estrutura condicional Composta.
        if(valor >= 10000){
            System.out.println("Ebaaa, sua viajem para a Europa é esse mês!");
            System.out.println("Você juntou: " + " R$" + valor);
        }else {
            System.out.println("Ops, você não tem dinheiro para viajar para a Europa.");
            System.out.println("Sua viajem vai ser pelo Brasil.");
        }
    }
}
