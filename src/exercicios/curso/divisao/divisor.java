package exercicios.curso.divisao;

import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int primeiroNum;
        int segundoNum;
        System.out.println("Escolha o primeiro número: ");
        primeiroNum = scanner.nextInt();

        System.out.println("Digite o divisor: ");
        segundoNum = scanner.nextInt();


        try {
            int resultado = primeiroNum / segundoNum;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida");
        }



    }
}
