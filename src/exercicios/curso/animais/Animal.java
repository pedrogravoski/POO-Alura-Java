package exercicios.curso.animais;

public class Animal {


    public void emitirSom() {
        System.out.println("Som de animal");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() ;
    }
}
