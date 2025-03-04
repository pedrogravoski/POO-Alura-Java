package exercicios.curso.animais;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.abanarRabo();
        c.emitirSom();



        Gato g = new Gato();
        g.arranhar();
        g.emitirSom();


        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(c);
        animais.add(g);

        for (Animal item : animais){
            System.out.println(item);
            if (item instanceof Cachorro cachorro) {
                cachorro.abanarRabo();
            }
        }


    }
}
