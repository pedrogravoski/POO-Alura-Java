package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Qual o filme deseja buscar?");
        Scanner leitura = new Scanner(System.in);
        var busca = leitura.nextLine().trim();


        var buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        var endereco = "https://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=c7bb28ea";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());
    }
}
