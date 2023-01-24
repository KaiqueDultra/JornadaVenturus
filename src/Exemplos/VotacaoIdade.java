package Exemplos;

import java.util.Scanner;

public class VotacaoIdade {
    public static void main(String[] args){
        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();

        String voto = ((idade >= 16 && idade <=18) || (idade > 70))? "É opcional" : "Não é opcional";
        System.out.println(voto);
    }
}
