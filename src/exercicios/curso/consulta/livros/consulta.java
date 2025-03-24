package exercicios.curso.consulta.livros;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class consulta {
    public static void main(String[] args) throws IOException, InterruptedException {
//        System.out.println("Qual livro está procurando?");
//        Scanner leitura = new Scanner(System.in);
//        var titulo = leitura.nextLine().trim();
//
//        var buscaCodificada = URLEncoder.encode(titulo, StandardCharsets.UTF_8);
//
//        var pesquisa = "https://www.googleapis.com/books/v1/volumes?q=search+terms"  + buscaCodificada + "&key=AIzaSyB_URAg3zmUA4wFXJGP6xu4hAcfKfVoWpE";
//
//
//
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(pesquisa))
//                .build();
//
//        HttpResponse<String> response = client
//                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";


        Gson gson = new Gson();
        LivroJson livro = gson.fromJson(json, LivroJson.class);

        System.out.println(livro);


    }
}
