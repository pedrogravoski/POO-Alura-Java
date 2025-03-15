package exercicios.curso.criptoApi;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsultaCripto {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual a cripto deseja visualizar?");

        var busca = leitura.nextLine();

        var buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

        var link = "https://api.coingecko.com/api/v3/simple/price?ids=" + buscaCodificada + "&vs_currencies=usd";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
