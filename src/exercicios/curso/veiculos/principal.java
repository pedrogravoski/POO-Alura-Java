package exercicios.curso.veiculos;

public class principal {
    public static void main(String[] args) {
        carro carroUm = new carro();
        carroUm.setModelo("Fusca");
        carroUm.definirPrecos(200,100.50,80.10);
        carroUm.retornaPrecos();
    }
}
