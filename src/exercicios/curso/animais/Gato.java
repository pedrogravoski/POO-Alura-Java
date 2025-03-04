package exercicios.curso.animais;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranhar() {
        System.out.println("Arranhando");
    }
}
