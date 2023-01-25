package Exercicio04;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        int opcao, numero1, numero2, resultado;

        System.out.println("-----------------------------------------" + "\n" +
                "BEM VINDO A CALCULADORA" + "\n" +
                "-----------------------------------------" + "\n" +
                "DIGITE A OPÇÃO DESEJADA: " + "\n" +
                "[1] SOMA" + "\n" +
                "[2] SUBTRAÇÃO" + "\n" +
                "[3] MULTIPLICAÇÃO" + "\n" +
                "[4] DIVISÃO" + "\n" +
                "-----------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a opção desejada: ");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o primeiro numero: ");
                numero1 = sc.nextInt();
                System.out.println("Agora, digite o segundo numero: ");
                numero2 = sc.nextInt();
                resultado = (numero1 + numero2);
                System.out.println("O resultado da conta é de: " + resultado);
                break;
            case 2:
                System.out.println("Digite o primeiro numero: ");
                numero1 = sc.nextInt();
                System.out.println("Agora, digite o segundo numero: ");
                numero2 = sc.nextInt();
                resultado = (numero1 - numero2);
                System.out.println("O resultado da conta é de: " + resultado);
            case 3:
                System.out.println("Digite o primeiro numero: ");
                numero1 = sc.nextInt();
                System.out.println("Agora, digite o segundo numero: ");
                numero2 = sc.nextInt();
                resultado = (numero1 * numero2);
                System.out.println("O resultado da conta é de: " + resultado);
                break;
            case 4:
                System.out.println("Digite o primeiro numero: ");
                numero1 = sc.nextInt();
                System.out.println("Agora, digite o segundo numero: ");
                numero2 = sc.nextInt();
                resultado = (numero1 / numero2);
                System.out.println("O resultado da conta é de: " + resultado);
            default:
                System.out.println("Opção inválida, por favor escolha um de nossos serviços.");
        }
    }
}
