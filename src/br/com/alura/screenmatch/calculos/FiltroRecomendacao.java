package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.filtra() >= 4){
            System.out.println( "Recomendado");
        }else {
        System.out.println("Nao recomendado");
        }
    }
}
