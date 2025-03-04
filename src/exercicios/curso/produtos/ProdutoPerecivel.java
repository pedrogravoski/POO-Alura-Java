package exercicios.curso.produtos;

public class ProdutoPerecivel extends produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String toString(){
        return super.toString() + " Data de Validade: " + this.dataValidade;
    }
}
