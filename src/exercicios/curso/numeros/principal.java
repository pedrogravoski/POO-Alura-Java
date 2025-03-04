package exercicios.curso.numeros;

public class principal {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificaSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoNumero = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo número primo é: " + proximoNumero);


        NumerosPrimos primos = new NumerosPrimos();
        primos.listarPrimos(30);
    }
}
