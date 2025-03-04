package exercicios.curso.pessoa;

public class principal {
    public static void main(String[] args) {
        idadePessoa pessoaUm = new idadePessoa();
        pessoaUm.setNome("Pedro");
        pessoaUm.setIdade(20);

        idadePessoa pessoaDois = new idadePessoa();
        pessoaDois.setNome("Maria");
        pessoaDois.setIdade(15);

        pessoaUm.verificaMaiorIdade();

        pessoaDois.verificaMaiorIdade();
    }
}
