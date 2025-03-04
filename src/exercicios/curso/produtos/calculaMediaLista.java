package exercicios.curso.produtos;

import java.util.ArrayList;

public class calculaMediaLista {
    public double calculaMedia(ArrayList<produto> produtos){
        double soma = 0;
        for (produto produto : produtos) {
            soma += produto.getPreco();
        }

        return Math.round(soma / produtos.size() * 100.0) / 100.0;
    }
}
