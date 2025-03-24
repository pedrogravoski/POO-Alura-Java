package exercicios.curso.senha;

import java.util.Scanner;

public class verificador {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String senha;
        System.out.println("Digite a senha: ");
        senha = s.nextLine();

        try {
            validadorSenha(senha);
            System.out.println("Concluído com sucesso!");
        }catch (excedeuTamanhoPermitido e) {
            System.out.println("Erro: " + e.getMessage());
        }



    }

    public static void validadorSenha(String senha){
        if (senha.length() != 6) {
            throw new excedeuTamanhoPermitido("A senha deve conter 6 caracteres");
        }

    }
}
