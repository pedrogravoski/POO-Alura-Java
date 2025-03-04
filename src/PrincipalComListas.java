import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("O poderoso chefão",1970);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        Movie outroFilme = new Movie("Avatar",2023);
        outroFilme.avalia(8);
        Movie filmePaulo = new Movie("Dogville", 2003);
        filmePaulo.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        lista.add(filmePaulo);

        for (Titulo item : lista){
            System.out.println(item);
            if (item instanceof Movie filme && filme.filtra() > 2){
                System.out.println(filme.filtra());
            }


        }

//        lista.forEach(System.out::println);
    }

}
