package Exercicio04;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args){
        int nota1, nota2, nota3;
        int resultado;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a nota da primeira avaliação: ");
        nota1 = ler.nextInt();
        System.out.println("Digite a nota da segunda avaliação: ");
        nota2 = ler.nextInt();
        System.out.println("Digite a nota da terceira avaliação: ");
        nota3 = ler.nextInt();

        resultado = ((nota1 + nota2 + nota3) / 3);

        if(resultado >= 7){ //Testando se a nota é maior ou igual a 7
            System.out.println("Aluno aprovado, sua nota foi: " + resultado);
        } else if (resultado < 7 && resultado >= 5) { //Testando se a nota é menor que 7 ou maior ou igual a 5
            System.out.println("Aluno de recuperação, sua nota foi: " + resultado);
        }else{ //Se não for nenhuma das alternativas, cai no else.
            System.out.println("Aluno reprovado, sua nota foi de: " + resultado);
        }
    }
}
