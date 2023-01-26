package POO;

public class Caneta {
    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("% de carga: " + this.carga);
        System.out.println("Esta tampada?: " + this.tampada);
    }

    void rabiscar(){
        if(tampada == true){
            System.out.println("Desculpe, a caneta está tampada.");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
