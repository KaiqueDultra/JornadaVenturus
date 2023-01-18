package Exercicios01;

import java.awt.*;

public class Resolucao_computador {
    public static void main(String[] args){
        //Resolucao do computador
        Dimension tamanho = Toolkit.getDefaultToolkit().getScreenSize(); //GetScreenSize retorna o tamanho da tela do dispositivo
        int width = (int) tamanho.getWidth(); //Buscando tamanho do width
        int height = (int) tamanho.getHeight(); //Buscando tamanho do height
        System.out.println("O tamanho da dimensão da tela do seu computador é: ");
        System.out.println("Width: " + width + " Height: " + height);
    }
}
