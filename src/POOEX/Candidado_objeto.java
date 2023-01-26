package POOEX;

public class Candidado_objeto {
    public static void main(String[] args){
        Candidato c1 = new Candidato();
        c1.pessoaCandidata = "Kaique";
        c1.vaga = "TECNOLOGIA";
        c1.pretensaoSalarial = 2.200;
        c1.status();
        c1.enviarTesteTecnico();
        System.out.println(" ");

        Candidato c2 = new Candidato();
        c2.pessoaCandidata = "Bruna";
        c2.vaga = "GERAL";
        c2.pretensaoSalarial = 2.200;
        c2.status();
        c2.enviarTesteTecnico();
        System.out.println(" ");
    }
}
