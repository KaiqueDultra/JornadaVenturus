package Exercicio02;

import java.util.Scanner;

public class Valor_pecas {
    public static void main(String[] args){
        int codigo1, numero1;
        int codigo2, numero2;
        double valor1, valor2, preco1, preco2, total;
        int contador = 0;

        Scanner ler = new Scanner(System.in);
        do{
            //Peça 01
            System.out.println("Digite o código da peça 01: ");
            codigo1 = ler.nextInt();
            contador++;
            System.out.println("Digite o numero de peças 01: ");
            numero1 = ler.nextInt();
            contador++;
            System.out.println("Digite o valor unitário de cada peça: ");
            valor1 = ler.nextDouble();
            contador++;

            //Peça 02
            System.out.println("Digite o código da peça 02: ");
            codigo2 = ler.nextInt();
            contador++;
            System.out.println("Digite o numero de peças 02: ");
            numero2 = ler.nextInt();
            contador++;
            System.out.println("Digite o valor unitário de cada peça: ");
            valor2 = ler.nextDouble();
            contador++;
        } while(contador < 6);
        preco1 = (valor1 * numero1); //Somando o valor das peças 01
        preco2 = (valor2 * numero2); //Somando o valor das peças 02
        total = (preco1 + preco2); //Atribuindo e somando o total das peças 01 e 02 juntas.
        System.out.println("Você comprou " + numero1 + numero2 + " peças e o total a pagar é de: R$ " + total);
    }
}
