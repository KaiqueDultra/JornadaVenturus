package POOEX;

import java.util.Scanner;

public class Funcionario {
    String nome, empresa;
    double salarioInicial;
    double aumentoSalarial, conta, quantidadeAumento, valorTotal;
    int anoInicial;

    void status(){
        System.out.println("----------------------------------");
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Nome da empresa: " + this.empresa);
        System.out.println("Ano inicial: " + this.anoInicial);
        System.out.printf("Salario inicial: %.2f %n", this.salarioInicial);
        System.out.printf("Aumento salarial: %.2f %n", this.quantidadeAumento);
        System.out.printf("Novo salário é de: %.2f %n", this.valorTotal);
    }

    void aumento(){
        //Não finalizado.
        if(anoInicial == 2016){
            conta =  salarioInicial * 0.015;
            aumentoSalarial =  (salarioInicial + conta);
            quantidadeAumento = (aumentoSalarial - salarioInicial);
            valorTotal = (salarioInicial + quantidadeAumento);
        }
    }
}
