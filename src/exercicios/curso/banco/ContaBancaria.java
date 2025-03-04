package exercicios.curso.banco;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(this.saldo < 0 || valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        }

        this.saldo -= valor;
    }

    public void consultar() {
        System.out.println( "Saldo: " + this.saldo);
    }
}
