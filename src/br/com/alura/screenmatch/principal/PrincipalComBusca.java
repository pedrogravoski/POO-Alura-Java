package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
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

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Qual o filme deseja buscar?");
        Scanner leitura = new Scanner(System.in);
        var busca = leitura.nextLine().trim();


        var buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        var endereco = "http://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=c7bb28ea";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();


        Gson gson =  new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);
        System.out.println(meuTituloOmdb);

        try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido:");
            System.out.println(meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("ERRO: ");
            System.out.println(e.getMessage());
        }




    }
}
