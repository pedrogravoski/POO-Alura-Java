package exercicios.curso.numeros;

import java.util.ArrayList;
import java.util.Comparator;

public class principal {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificaSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoNumero = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo número primo é: " + proximoNumero);


        NumerosPrimos primos = new NumerosPrimos();
        primos.listarPrimos(30);

    ArrayList<Integer> numeros = new ArrayList<>();
    int um = 1;
    int dois = 2;
    int tres = 3;

    numeros.add(tres);
    numeros.add(um);
    numeros.add(dois);

    System.out.println(numeros);
    numeros.sort(Comparator.comparing(Integer::intValue));
    System.out.println(numeros);
    }



}
