package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int visualizacao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getVisualizacao() {
        return visualizacao;
    }

    public void setVisualizacao(int visualizacao) {
        this.visualizacao = visualizacao;
    }


    @Override
    public int filtra() {
        if (visualizacao > 100){
            return 4;
        }
        if (visualizacao > 50){
            return 3;
        }
        if (visualizacao > 20){
            return 2;
        }
        return 1;
    }
}
