package exercicios.curso.numeros;

public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(int ultimoconhecido){
        int proximo = ultimoconhecido + 1;
        while(!verificarPrimalidade(proximo)){
            proximo++;
        }
        return proximo;
    }
}
