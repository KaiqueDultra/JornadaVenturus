package Exercicio04;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Financiamento {
    public static void main(String[] args){
        int salario;
        int financiamento;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        salario = ler.nextInt();
        System.out.println("Digite o valor do financiamento: ");
        financiamento = ler.nextInt();

        if(financiamento <= salario * 5){
            System.out.println("Financiamento Concedido.");
        }else{
            System.out.println("Financiamento Negado.");
        }
        System.out.println("Obrigado por nos consultar.");
    }
}
