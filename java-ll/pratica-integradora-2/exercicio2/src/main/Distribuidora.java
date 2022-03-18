package main;

import java.util.ArrayList;

public class Distribuidora {

    public static void main(String[] args) {

        ArrayList<Produtos> list = new ArrayList<>();

        list.add(new NaoPereciveis("milho", 3.00, "Enlatado"));
        list.add(new NaoPereciveis("Farinha de trigo", 5.00, "Farináceos"));
        list.add(new Pereciveis("Pêra", 2.80, 2));
        list.add(new Pereciveis("Carne de Picanha", 100.0, 10));
        list.add(new Pereciveis("Pizza", 40.00, 1));


        for (Produtos produtos : list) {
            System.out.printf("A compra de cinco produtos de nome %s totaliza o valor de R$%.2f.%n", produtos.getNome(), produtos.calcular(5));


        }

    }

}
