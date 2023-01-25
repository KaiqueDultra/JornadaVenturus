package Exercicio04;

import java.util.Scanner;

public class ProgramaSolidario {
    public static void main(String[] args){
        int opcao;
        int outro_valor;

        System.out.println("-----------------------------------------" + "\n" +
                "BEM VINDO AO PROGRAMA SOLIDÁRIO" + "\n" +
                "-----------------------------------------" + "\n" +
                "DIGITE A OPÇÃO DESEJADA: " + "\n" +
                "[1] para doar R$10" + "\n" +
                "[2] para doar R$25" + "\n" +
                "[3] para doar R$50" + "\n" +
                "[4] para doar outros valores" + "\n" +
                "[5] para cancelar" + "\n" +
                "-----------------------------------------");

        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma opção acima: ");
        opcao = ler.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Parabéns, você doou R$10.");
            break;
            case 2:
                System.out.println("Parabéns, você doou R$25.");
            break;
            case 3:
                System.out.println("Parabéns, você doou R$50.");
            break;
            case 4:
                System.out.println("Qual valor deseja doar: ");
                outro_valor = ler.nextInt();
                System.out.println("Parabéns, você doou " + outro_valor);
            break;
            case 5:
                System.out.println("Programa encerrado");
            break;
            default:
                System.out.println("Opção inválida, por favor escolha um de nossos serviços.");
        }
    }
}
