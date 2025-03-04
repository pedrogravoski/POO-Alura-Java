package exercicios.curso.numeros;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificaSeEhPrimo(int numero){
        if(verificarPrimalidade(numero)){
            System.out.println("O número " + numero + " é primo.");
        }else {
            System.out.println("O número " + numero + " NÃO é primo.");
        }
    }
}
