package POOEX;

public class Funcionario_objeto {
    public static void main(String[] args){
        Funcionario fn = new Funcionario();

        fn.nome = "Kaique";
        fn.empresa = "Venturus";
        fn.anoInicial = 2016;
        fn.salarioInicial = 2000.0;
        fn.aumento();
        fn.status();
    }
}
