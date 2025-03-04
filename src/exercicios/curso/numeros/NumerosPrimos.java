package exercicios.curso.numeros;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero) {
        if (numero == 1 || numero % 2 == 0) {
            return false;
        }
        return true;
    }

    public void listarPrimos(int limite){
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + "");
            }
        System.out.println();
        }
    }
}
