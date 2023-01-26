package POOEX;

public class Candidato {
    String vaga, pessoaCandidata;
    Double pretensaoSalarial;

    void status(){
        System.out.println("Nome do candidato: " + this.pessoaCandidata);
        System.out.println("Vaga: " + this.vaga);
        System.out.println("Pretensão Salarial: " + this.pretensaoSalarial);
    }

    void enviarTesteTecnico(){
        if(vaga == "TECNOLOGIA"){
            System.out.println("Enviar teste de Tecnologia para: " + this.pessoaCandidata);
        }else{
            System.out.println("Enviar teste geral para: " + this.pessoaCandidata);
        }
    }
}
