package Automoveis;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Garagem garagem = new Garagem(7);

        garagem.addVeiculos(new Veiculos("Ford", "Fiesta", new BigDecimal(1000)));
        garagem.addVeiculos(new Veiculos("Ford", "Focus", new BigDecimal(1200)));
        garagem.addVeiculos(new Veiculos("Ford", "Explores", new BigDecimal(2500)));
        garagem.addVeiculos(new Veiculos("Fiat", "Uno", new BigDecimal(500)));
        garagem.addVeiculos(new Veiculos("Fiat", "Cronos", new BigDecimal(1000)));
        garagem.addVeiculos(new Veiculos("Fiat", "Torino", new BigDecimal(1250)));
        garagem.addVeiculos(new Veiculos("Chevrolet", "Aveo", new BigDecimal(1250)));
        garagem.addVeiculos(new Veiculos("Chevrolet", "Spin", new BigDecimal(2500)));
        garagem.addVeiculos(new Veiculos("Toyota", "Corolla", new BigDecimal(1200)));
        garagem.addVeiculos(new Veiculos("Toyota", "Fortuner", new BigDecimal(3000)));
        garagem.addVeiculos(new Veiculos("Renault", "Logan", new BigDecimal(950)));


        System.out.println("Filtrado por preço");
        List<Veiculos> listFilterPreco = garagem.getVeiculos().stream()
                .sorted(Comparator.comparing(Veiculos::getPreco)).collect(Collectors.toList());
        listFilterPreco.forEach(System.out::println);

        System.out.println("Filtrado por marca");
        List<Veiculos> listFilterMarca = garagem.getVeiculos().stream()
                .sorted(Comparator.comparing(Veiculos::getMarca)).collect(Collectors.toList());
        listFilterMarca.forEach(System.out::println);


        System.out.println("Filtrado com preço não superior a 1000");

        List<Veiculos> listFilterMinPreco = garagem.getVeiculos().stream()
                .filter(veiculos -> veiculos.getPreco().compareTo(new BigDecimal(1000)) == -1)
                .collect(Collectors.toList());

        listFilterMinPreco.forEach(System.out::println);

        System.out.println("Filtrado com preço superior a 1000");
        List<Veiculos> listFilterMaxPreco = garagem.getVeiculos().stream()
                .filter(veiculos -> veiculos.getPreco().compareTo(new BigDecimal(1000)) == 1)
                .collect(Collectors.toList());

        listFilterMaxPreco.forEach(System.out::println);

        System.out.println("Média de valor dos veiculos");

        List<BigDecimal> medVeiculos = garagem.getVeiculos().stream()
                .map(veiculos -> veiculos.getPreco())
                .collect(Collectors.toList());

        BigDecimal valorTotal = medVeiculos.stream()
                .reduce(BigDecimal::add)
                .get();

        System.out.println("R$ " + valorTotal.divide(new BigDecimal(garagem.getVeiculos().size()),2, RoundingMode.HALF_UP));

    }

}
