package exercicios.curso.pessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class principal {
    public static void main(String[] args) {
//        idadePessoa pessoaUm = new idadePessoa();
//        pessoaUm.setNome("Pedro");
//        pessoaUm.setIdade(20);
//
//        idadePessoa pessoaDois = new idadePessoa();
//        pessoaDois.setNome("Maria");
//        pessoaDois.setIdade(15);
//
//        pessoaUm.verificaMaiorIdade();
//
//        pessoaDois.verificaMaiorIdade();

        String jsonPessoa = "{\"nome\":\"Rodrigo\"}";


        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println(pessoa);
    }
}
