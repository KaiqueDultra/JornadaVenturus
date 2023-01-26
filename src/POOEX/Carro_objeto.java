package POOEX;

public class Carro_objeto {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.cor = "Preto";
        carro1.modelo = "Gol";
        carro1.velocidade = 100;
        carro1.status();
        carro1.frear();
        carro1.acelerar();
        carro1.acenderfarol();
        System.out.println(" ");

        Carro carro2 = new Carro();
        carro2.cor = "Branco";
        carro2.modelo = "Classic";
        carro2.velocidade = 0;
        carro2.status();
        carro2.frear();
        carro2.acelerar();
        carro2.acenderfarol();
        System.out.println(" ");

        Carro carro3 = new Carro();
        carro3.cor = "Cinza";
        carro3.modelo = "Onix";
        carro3.velocidade = 10;
        carro3.status();
        carro3.frear();
        carro3.acelerar();
        carro3.acenderfarol();
        System.out.println(" ");
    }
}
