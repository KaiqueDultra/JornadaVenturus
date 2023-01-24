package Exemplos;

public class Estrutura_repeticao {
    public static void main(String[] args){
        int soma = 1;

        for(int i = 1; i < 10; i++){
            soma = soma * i;
            System.out.println("O fatorial de: " + i + " é de: " + soma);
        }
    }
}
