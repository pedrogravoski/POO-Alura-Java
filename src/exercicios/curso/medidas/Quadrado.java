package exercicios.curso.medidas;

public class Quadrado implements Forma {
    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
