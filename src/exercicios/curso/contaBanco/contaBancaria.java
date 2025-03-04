package exercicios.curso.contaBanco;

public class contaBancaria {
    private int numeroDaConta;
    private double saldo;
    public String titular;

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void exibir(){
        System.out.println("ID conta: " + this.getNumeroDaConta());
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.getSaldo());
    }
}


