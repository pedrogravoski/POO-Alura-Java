package exercicios.curso.contaBanco;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria(1234,200);

        var contaUm = new contaBancaria(100,500 );

        var contaDois = new contaBancaria(200, 500);

        ArrayList<contaBancaria> contas = new ArrayList<>();

        contas.add(contaUm);
        contas.add(contaDois);
        contas.add(conta);

        double maiorSaldo = 0;
        contaBancaria contaMaiorSaldo = null;

        for (contaBancaria contaBancaria : contas) {

            contaBancaria.exibir();

            if (contaBancaria.getSaldo() >  maiorSaldo) {
                maiorSaldo = contaBancaria.getSaldo();
                contaMaiorSaldo = contaBancaria;
            }
        }

        System.out.println();
        assert contaMaiorSaldo != null;
        contaMaiorSaldo.exibir();



    }
}
