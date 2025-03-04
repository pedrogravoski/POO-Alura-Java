package exercicios.curso.produtos;

public class produto {
    private String nome;
    private double preco;
    private int quantidade;

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return  Math.round(preco * 100.0) / 100.0;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void desconto(int percentual) {
        this.preco = this.preco - (this.preco * percentual / 100);
    }

    public String toString(){
        return this.getNome() + " - R$" + this.getPreco();
    }
}
