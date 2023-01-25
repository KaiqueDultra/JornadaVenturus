package Exercicio04;

import java.util.Scanner;

public class SalariosFuncionarios {
    public static void main(String[] args){
        double salario;
        double novo_salario;
        double conta;
        double aumento;
        String nome;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = ler.next();
        System.out.println("Agora, nos informe o seu salário: ");
        salario = ler.nextInt();

        if(salario > 0 && salario <= 3000){
            conta = salario * 0.20; //Conta do valor da %
            novo_salario = (salario + conta); //Calculando o novo salário.
            aumento = (novo_salario - salario); //Quantidade em R$ de aumento.
            System.out.println("-------------------------------------------------");
            System.out.println("Bem vindo, " + nome);
            System.out.printf("O salário teve um aumento de: %.2f %n", (aumento));
            System.out.printf("O salário atual era de: %.2f %n", (salario));
            System.out.printf("O novo salário é de: %.2f %n", (novo_salario));
            System.out.println("-------------------------------------------------");
        } else if (salario >= 4000 && salario <= 6000) {
            conta = salario * 0.15;
            novo_salario = (salario + conta);
            aumento = (novo_salario - salario);
            System.out.println("-------------------------------------------------");
            System.out.println("Bem vindo, " + nome);
            System.out.printf("O salário teve um aumento de: %.2f %n", (aumento));
            System.out.printf("O salário atual era de: %.2f %n", (salario));
            System.out.printf("O novo salário é de: %.2f %n", (novo_salario));
            System.out.println("-------------------------------------------------");
        } else if (salario >= 7000 && salario <= 9000 ) {
            conta = salario * 0.12;
            novo_salario = (salario + conta);
            aumento = (novo_salario - salario);
            System.out.println("-------------------------------------------------");
            System.out.println("Bem vindo, " + nome);
            System.out.printf("O salário teve um aumento de: %.2f %n", (aumento));
            System.out.printf("O salário atual era de: %.2f %n", (salario));
            System.out.printf("O novo salário é de: %.2f %n", (novo_salario));
            System.out.println("-------------------------------------------------");
        } else if (salario >= 10000 && salario <= 12000) {
            conta = salario * 0.10;
            novo_salario = (salario + conta);
            aumento = (novo_salario - salario);
            System.out.println("-------------------------------------------------");
            System.out.println("Bem vindo, " + nome);
            System.out.printf("O salário teve um aumento de: %.2f %n", (aumento));
            System.out.printf("O salário atual era de: %.2f %n", (salario));
            System.out.printf("O novo salário é de: %.2f %n", (novo_salario));
            System.out.println("-------------------------------------------------");
        } else if (salario >= 12000 && salario <= 15999) {
            conta = salario * 0.7;
            novo_salario = (salario + conta);
            aumento = (novo_salario - salario);
            System.out.println("-------------------------------------------------");
            System.out.println("Bem vindo, " + nome);
            System.out.printf("O salário teve um aumento de: %.2f %n", (aumento));
            System.out.printf("O salário atual era de: %.2f %n", (salario));
            System.out.printf("O novo salário é de: %.2f %n", (novo_salario));
            System.out.println("-------------------------------------------------");
        }else{
            System.out.println("-------------------------------------------------");
            System.out.println("Bem vindo, " + nome);
            System.out.printf("O salário atual é de: %.2f %n", (salario));
            System.out.println("Você não teve aumento.");
            System.out.println("-------------------------------------------------");
        }
    }
}
