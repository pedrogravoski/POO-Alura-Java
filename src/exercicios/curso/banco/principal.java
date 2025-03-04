package exercicios.curso.banco;

public class principal {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.consultar();
        conta.depositar(500);
        conta.consultar();
        conta.taxa();
        conta.consultar();
        conta.sacar(5000);
    }
}
