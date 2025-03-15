package exercicios.curso.receitasAPI;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Busca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome de uma receita:");

        var busca = leitura.nextLine().trim();
        var buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

        var pesquisa = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + buscaCodificada;





        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(pesquisa))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
