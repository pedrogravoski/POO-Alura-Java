package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String diretor;

    public Movie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int filtra() {
        return (int)pegaMedia() / 2;
    }

    @Override
    public String toString(){
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";

    }
}
