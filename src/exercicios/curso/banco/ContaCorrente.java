package exercicios.curso.banco;

public class ContaCorrente extends ContaBancaria {
    public void taxa(){
        double TARIFA = saldo * 0.1;
        saldo -= TARIFA;
    }
}
