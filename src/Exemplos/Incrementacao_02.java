package Exemplos;

public class Incrementacao_02 {
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;

        //x++ == x = x + 1 (Adiciona 1 ao valor de x, armazena o resultado em x, e retorna o valor original)
        //++x == x = x + 1 (Adiciona 1 ao valor de x, armazena o resultado em x, e retorna o novo valor incrementado)

        System.out.println(a += ++a); //Retorna o valor incrementado, ou seja, (a + a = 10 ++a = 11)
        System.out.println(c = c + ++c);

        System.out.println(b += b++); //Retorna o valor normal, ou seja, (b + b = 10)
        System.out.println(d = d + d++);
    }
}
