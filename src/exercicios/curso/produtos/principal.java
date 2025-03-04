package exercicios.curso.produtos;

import java.util.ArrayList;


public class principal {
    public static void main(String[] args) {
        produto produtoUm = new produto("Notebook",2000.5878,3);
        produto produtoDois = new produto("Fogão",1000,5);
        produto produtoTres = new produto("Geladeira",1500,1);

        ArrayList<produto>  produtos = new ArrayList<>();
        produtos.add(produtoUm);
        produtos.add(produtoDois);
        produtos.add(produtoTres);


        System.out.println("O tamano da lista é: " + produtos.size());
        System.out.println("O Primeiro Produto é: " + produtos.get(0));

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Feijao", 25.66, 2, "20-10-2025");

        System.out.println(produtoPerecivel);

    }
}
