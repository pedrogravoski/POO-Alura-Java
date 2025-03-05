package exercicios.curso.medidas;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        System.out.println(quadrado.calcularArea());

        var circulo = new Circulo(2);
        System.out.println( circulo.calcularArea());


        ArrayList<Forma> formasObjetos = new ArrayList<>();
        formasObjetos.add(quadrado);
        formasObjetos.add(circulo);


        for (Forma forma : formasObjetos) {
            System.out.println(forma.getClass().getSimpleName()+ " " + forma.calcularArea());
        }
    }
}
