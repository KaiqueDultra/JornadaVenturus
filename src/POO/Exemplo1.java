package POO;

public class Exemplo1 {
    public static void main(String[] args){
        Caneta c1 = new Caneta(); //Extanciando a classe Caneta (Criando um objeto da classe)
        c1.cor = "Azul"; //Atribuindo a cor do objeto
        c1.modelo = "Bic"; //Atribuindo a marca/modelo da caneta
        c1.carga = 90;
        c1.ponta = 0.7f;
        c1.tampada = false;
        c1.rabiscar();;
        c1.status();
        System.out.println(" ");

        Caneta c2 = new Caneta(); //Extanciando a classe Caneta (Criando um segundo objeto da classe)
        c2.cor = "Vermelho";
        c2.modelo = "Bic";
        c2.carga = 100;
        c2.ponta = 0.5f;
        c2.tampada = true;
        c2.rabiscar();;
        c2.status();
        System.out.println(" ");

        Caneta c3= new Caneta(); //Extanciando a classe Caneta (Criando um terceiro objeto da classe)
        c3.cor = "Preto";
        c3.modelo = "Bic";
        c3.carga = 100;
        c3.ponta = 0.4f;
        c3.tampada = true;
        c3.rabiscar();
        c3.destampar();
        c3.status();
        System.out.println(" ");
    }
}
