package exercicios.curso.contaBanco;

public class principal {
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();

        conta.titular = "Pedro";
        conta.setSaldo(200);
        conta.setNumeroDaConta(1234);




        conta.exibir();
    }
}
