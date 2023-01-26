package POOEX;

public class Carro {
    String cor, modelo;
    int velocidade;

    void status(){
        System.out.println("Cor do carro: " + this.cor);
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Velocidade do carro: " + this.velocidade);
    }

    void acelerar(){
        if(velocidade < 20){
            System.out.println("Acelerando!!");
            this.velocidade = velocidade + 10;
        }else{
            if(velocidade > 60){
                System.out.println("Acima do limite!!");
                this.velocidade = velocidade - 10;
            }else{
                System.out.println("Dentro do limite!!");
            }
        }
    }

    void frear(){
        if(velocidade > 60){
            System.out.println("Freando!!");
            this.velocidade = velocidade - 10;
        }else{
            if(velocidade < 20){
                System.out.println("Abaixo do limite!!");
            }else{
                System.out.println("Dentro do limite");
            }
        }
    }

    void acenderfarol(){
        if(velocidade == 0){
            System.out.println("Farol apagado!");
        }else{
            System.out.println("Farol aceso!!");
        }
    }
}
