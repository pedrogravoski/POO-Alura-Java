package exercicios.curso.senha;

public class excedeuTamanhoPermitido extends RuntimeException {
    public excedeuTamanhoPermitido(String mensagem){
        super(mensagem);
    }
}
