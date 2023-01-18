package Exercicio02;

import java.util.Scanner;

public class Salario_funcionario {
    public static void main(String[] args){
        int numero = 0, horas = 0;
        double valor_horas = 0;
        double salario;
        int contador = 0;

        System.out.println("BEM VINDO AO SISTEMA SALARIAL VENTURUS.");
        System.out.println("-----------------------------------------");
        Scanner ler = new Scanner(System.in);
        while(contador < 3){
            System.out.println("Digite o seu número do seu cadastro: ");
            numero = ler.nextInt();
            contador++;
            System.out.println("Digite o numero de horas trabalhadas: ");
            horas = ler.nextInt();
            contador++;
            System.out.println("Agora, nos informe o valor que recebe por hora trabalhada: ");
            valor_horas = ler.nextDouble();
            contador++;
        }
        salario = (horas * valor_horas);
        System.out.printf("O  seu salario é de: %.2f %n", (salario));
    }
}
