package exercicios.curso.consulta.livros;

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
        System.out.println("Qual livro está procurando?");
        Scanner leitura = new Scanner(System.in);
        var titulo = leitura.nextLine().trim();

        var buscaCodificada = URLEncoder.encode(titulo, StandardCharsets.UTF_8);

        var pesquisa = "https://www.googleapis.com/books/v1/volumes?q=" + buscaCodificada + "AIzaSyDUtBnh1nRcTlkL0JOBnXVE5OnJ2oU_u_8";




        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(pesquisa))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
