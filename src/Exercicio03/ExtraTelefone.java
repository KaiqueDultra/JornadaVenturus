package Exercicio03;

import java.util.Scanner;

public class ExtraTelefone {
    public static void main(String[] args){
        int minutos;
        double conta = 50.0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de minutos utilizados no mês: ");
        minutos = ler.nextInt();

        //Estrutura condicional Composta.
        if(minutos > 100){
            conta += (minutos - 100) * 2.0; //Adicionando na conta o valor dos minutos, ou seja,
            //se passar 10 minutos (110 minutos), vai ser igual: 110 - 100 = 10 * 2.0 = R$ 20.
            //conta = 50 + 20 = 70.
            System.out.printf("Valor da conta é de: R$ %.2f%n", conta);
        }else{
            System.out.println("Você não passou dos minutos do mês.");
            ler.close(); //Fechando o scanner
        }
    }
}
